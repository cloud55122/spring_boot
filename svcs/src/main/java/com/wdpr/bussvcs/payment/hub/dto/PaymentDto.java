package com.wdpr.bussvcs.payment.hub.dto;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public abstract class PaymentDto {
    
    String externalReferenceSource;
    String externalReferenceValue;
    String folioId;
    String folioType;
    String partyLastName; 
    String sourceAccountingCenterId;
    String bankingAccountingCenterId;
    String bankingAccountingCenterName;
    String locationId;
    String paymentId;
    String amount;
    String postingDate;
    String currencyCode;
    String txnId;
    ArrayList<String> overrideCodes;

}
