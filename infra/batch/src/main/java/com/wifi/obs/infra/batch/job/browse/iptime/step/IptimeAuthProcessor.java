package com.wifi.obs.infra.batch.job.browse.iptime.step;

import com.wifi.obs.data.mysql.config.JpaDataSourceConfig;
import com.wifi.obs.data.mysql.entity.wifi.service.WifiServiceEntity;
import com.wifi.observer.client.wifi.dto.response.AuthInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
@RequiredArgsConstructor
public class IptimeAuthProcessor implements ItemProcessor<WifiServiceEntity, AuthInfo> {

	@Override
	@Transactional(readOnly = true, transactionManager = JpaDataSourceConfig.TRANSACTION_MANAGER_NAME)
	public AuthInfo process(WifiServiceEntity item) {
		throw new NotImplementedException("구현해주세요");
	}
}
