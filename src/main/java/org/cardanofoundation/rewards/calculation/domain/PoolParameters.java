package org.cardanofoundation.rewards.calculation.domain;

import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PoolParameters {
    int epoch;
    BigInteger pledge;
}
