package com.wifi.obs.app.domain.service.wifi;

import com.wifi.obs.data.mysql.config.JpaDataSourceConfig;
import com.wifi.obs.data.mysql.entity.wifi.service.WifiServiceEntity;
import com.wifi.obs.data.mysql.repository.wifi.service.WifiServiceRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class DeleteWifiServiceService {

	private final WifiServiceRepository wifiServiceRepository;

	@Transactional(transactionManager = JpaDataSourceConfig.TRANSACTION_MANAGER_NAME)
	public void execute(List<WifiServiceEntity> services) {
		wifiServiceRepository.deleteAllById(
				services.stream().map(WifiServiceEntity::getId).collect(Collectors.toList()));
	}
}
