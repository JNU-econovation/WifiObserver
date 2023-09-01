package com.wifi.obs.app.domain.usecase.wifiService;

import com.wifi.obs.app.domain.dto.response.service.ServiceDeviceStetInfos;
import com.wifi.obs.app.web.dto.request.StetType;
import com.wifi.obs.data.mysql.config.JpaDataSourceConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class GetServiceStetFacadeUseCase {

	@Transactional(transactionManager = JpaDataSourceConfig.TRANSACTION_MANAGER_NAME, readOnly = true)
	public ServiceDeviceStetInfos execute(Long memberId, Long serviceId, StetType type) {
		throw new NotImplementedException("구현해주세요");
	}
}
