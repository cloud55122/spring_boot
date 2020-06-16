package com.wdpr.bussvcs.payment.hub.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class AddressDTO {
    private String city;
    private String state;
    private String zipCode;
    private String country;
}