package org.cardanofoundation.rewards.validation.entity.persistence;

import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AggregationsInEpoch {
    BigInteger sumOfFees;
    BigInteger sumOfWithdrawals;
    BigInteger sumOfDeposits;
}
