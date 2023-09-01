package com.wifi.obs.infra.batch.job.browse.iptime.step;

import com.wifi.obs.data.mysql.config.JpaDataSourceConfig;
import com.wifi.observer.client.wifi.dto.response.iptime.IptimeOnConnectUserInfosResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
@RequiredArgsConstructor
public class IptimeConnectHistoryWriter implements ItemWriter<IptimeOnConnectUserInfosResponse> {

	@Override
	@Transactional(transactionManager = JpaDataSourceConfig.TRANSACTION_MANAGER_NAME)
	public void write(List<? extends IptimeOnConnectUserInfosResponse> items) {
		throw new NotImplementedException("구현해주세요");
	}
}
