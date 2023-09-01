package com.wifi.obs.app.domain.usecase.device;

import com.wifi.obs.app.domain.dto.response.device.DeviceInfos;
import com.wifi.obs.data.mysql.config.JpaDataSourceConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class GetServiceDeviceUseCase {
	@Transactional(transactionManager = JpaDataSourceConfig.TRANSACTION_MANAGER_NAME, readOnly = true)
	public DeviceInfos execute(Long memberId, Long serviceId) {
		throw new NotImplementedException("구현해주세요");
	}

	@Transactional(transactionManager = JpaDataSourceConfig.TRANSACTION_MANAGER_NAME, readOnly = true)
	public DeviceInfos execute(Long memberId) {
		throw new NotImplementedException("구현해주세요");
	}
}
