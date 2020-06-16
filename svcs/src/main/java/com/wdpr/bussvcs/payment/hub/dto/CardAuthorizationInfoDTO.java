package com.wdpr.bussvcs.payment.hub.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class CardAuthorizationInfoDTO {
    private String authorizationCode;
    private String authorizationType;
    private String avsResponseCode;
    private String cardTrackType;
    private String expirationMonth;
    private String expirationYear;
    private String retrievalReferenceNumber;
    private String retrievalReferenceNumberKey;
    private String stratusTermId;
    private String dataOriginCode;
    private AmountDTO authAmount;
}
