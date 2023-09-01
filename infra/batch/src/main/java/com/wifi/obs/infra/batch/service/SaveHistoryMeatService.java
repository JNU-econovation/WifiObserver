package com.wifi.obs.infra.batch.service;

import com.wifi.obs.data.mysql.config.JpaDataSourceConfig;
import com.wifi.obs.data.mysql.entity.history.ConnectHistoryEntity;
import com.wifi.obs.data.mysql.entity.wifi.service.WifiServiceEntity;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class SaveHistoryMeatService {

	@Transactional(transactionManager = JpaDataSourceConfig.TRANSACTION_MANAGER_NAME)
	public void execute(
			ConnectHistoryEntity connectHistory,
			WifiServiceEntity service,
			LocalDateTime now,
			Long durationTime) {

		throw new NotImplementedException("구현해주세요");

		// 날짜를 기준으로 접속 기록 메타 데이터 조회

		// 달을 기준으로 접속 기록 메타 데이터 조회

		// 해당 일의 접속 기록을 바탕으로 당일 접속 기록 메타 데이터 생성
	}
}
