package com.wifi.obs.infra.batch.job.refresh.iptime.step;

import com.wifi.obs.data.mysql.config.JpaDataSourceConfig;
import com.wifi.obs.data.mysql.entity.history.ConnectHistoryEntity;
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
public class IptimeBrowseRefreshWriter implements ItemWriter<ConnectHistoryEntity> {

	@Override
	@Transactional(transactionManager = JpaDataSourceConfig.TRANSACTION_MANAGER_NAME)
	public void write(List<? extends ConnectHistoryEntity> items) throws Exception {
		throw new NotImplementedException("구현해주세요");
	}
}
