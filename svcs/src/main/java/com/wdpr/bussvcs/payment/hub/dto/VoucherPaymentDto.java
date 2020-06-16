package com.wdpr.bussvcs.payment.hub.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class VoucherPaymentDto extends PaymentDto{

    String party1Id;
    String party1Type;
    String userName;
    String paymentMethod;
    String voucherNumber;
}
