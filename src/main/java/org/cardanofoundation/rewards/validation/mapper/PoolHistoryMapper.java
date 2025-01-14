package org.cardanofoundation.rewards.validation.mapper;

import org.cardanofoundation.rewards.calculation.domain.PoolHistory;

import java.math.BigInteger;

public class PoolHistoryMapper {

    public static PoolHistory fromKoiosPoolHistory(rest.koios.client.backend.api.pool.model.PoolHistory poolHistory) {
        if (poolHistory == null) return null;

        return PoolHistory.builder()
            .activeStake(new BigInteger(poolHistory.getActiveStake()))
            .delegatorRewards(new BigInteger(poolHistory.getDelegRewards()))
            .poolFees(new BigInteger(poolHistory.getPoolFees()))
            .margin(Double.parseDouble(String.valueOf(poolHistory.getMargin())))
            .fixedCost(new BigInteger(String.valueOf(poolHistory.getFixedCost())))
            .blockCount(poolHistory.getBlockCnt())
            .epoch(poolHistory.getEpochNo())
            .build();
    }
}
