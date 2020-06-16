package com.wdpr.bussvcs.payment.hub.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class CheckPaymentDto extends PaymentDto{

    public String authorizationNumber;
    public String checkNumber;
    public String documentOriginator;
    public String paymentMethod;
}
