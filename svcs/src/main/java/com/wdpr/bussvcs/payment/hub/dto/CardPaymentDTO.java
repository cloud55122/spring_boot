package com.wdpr.bussvcs.payment.hub.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class CardPaymentDTO extends PaymentDto{

    private String tpId;
    private String lengthOfStay;
    private List<String> overriddenErrors;
    private String paymentMethod;
    private String paymentMethodType;
    private String cardNumber;
    private String expirationDate;
    private String cardHolderName;
    private String deviceTerminalId;
    private String currencyExcangeRate;
    private CardAuthorizationInfoDTO cardAuthorizationInfo;
    private AddressDTO address;
}
