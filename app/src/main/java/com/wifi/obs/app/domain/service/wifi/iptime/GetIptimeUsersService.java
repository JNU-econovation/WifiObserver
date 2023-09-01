package com.wifi.obs.app.domain.service.wifi.iptime;

import com.wifi.obs.app.domain.dto.response.service.OnConnectUserInfos;
import com.wifi.obs.app.domain.dto.response.service.UserInfo;
import com.wifi.obs.data.mysql.entity.wifi.auth.WifiAuthEntity;
import com.wifi.observer.client.wifi.client.iptime.IptimeAuthClientImpl;
import com.wifi.observer.client.wifi.client.iptime.IptimeBrowseClientImpl;
import com.wifi.observer.client.wifi.dto.request.iptime.IptimeAuthRequest;
import com.wifi.observer.client.wifi.dto.request.iptime.IptimeBrowseRequest;
import com.wifi.observer.client.wifi.dto.response.AuthInfo;
import com.wifi.observer.client.wifi.dto.response.ClientResponse;
import com.wifi.observer.client.wifi.dto.response.OnConnectUserInfo;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GetIptimeUsersService {

	private final IptimeAuthClientImpl iptimeAuthClient;
	private final IptimeBrowseClientImpl iptimeBrowseClient;

	public OnConnectUserInfos execute(WifiAuthEntity authInfo) {
		ClientResponse<AuthInfo> authResponse =
				iptimeAuthClient.command(
						IptimeAuthRequest.builder()
								.host(authInfo.getHost())
								.userName(authInfo.getCertification())
								.password(authInfo.getPassword())
								.build());

		AuthInfo auth =
				authResponse.getResponse().orElseThrow(() -> new RuntimeException("인증에 실패했습니다."));

		com.wifi.observer.client.wifi.dto.response.OnConnectUserInfos res =
				iptimeBrowseClient
						.query(
								IptimeBrowseRequest.builder().authInfo(auth.getInfo()).host(auth.getHost()).build())
						.getResponse()
						.orElseThrow(() -> new RuntimeException("조회에 실패했습니다."));

		List<OnConnectUserInfo> usersInfo = res.getUsers();

		List<UserInfo> userInfos =
				usersInfo.stream()
						.map(u -> UserInfo.builder().mac(u.getUser()).build())
						.collect(Collectors.toList());

		return new OnConnectUserInfos(userInfos);
	}
}