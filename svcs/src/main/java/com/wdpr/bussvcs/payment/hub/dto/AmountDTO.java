package com.wdpr.bussvcs.payment.hub.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class AmountDTO {
    private String amount;
    private String currency;
}
