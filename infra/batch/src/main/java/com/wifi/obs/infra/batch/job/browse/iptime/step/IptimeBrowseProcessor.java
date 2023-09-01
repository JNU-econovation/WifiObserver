package com.wifi.obs.infra.batch.job.browse.iptime.step;

import com.wifi.observer.client.wifi.dto.response.AuthInfo;
import com.wifi.observer.client.wifi.dto.response.iptime.IptimeOnConnectUserInfosResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class IptimeBrowseProcessor
		implements ItemProcessor<AuthInfo, IptimeOnConnectUserInfosResponse> {

	@Override
	public IptimeOnConnectUserInfosResponse process(AuthInfo item) {
		throw new NotImplementedException("구현해주세요");
	}
}
