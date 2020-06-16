package com.wdpr.bussvcs.payment.hub.exception;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;


import lombok.Getter;
import lombok.Setter;

@XmlRootElement(name = "error")
@Getter @Setter
public class ErrorResponse
{
    public ErrorResponse(String message, ServiceApplicationFault detail) {
        super();
        this.message = message;
        this.detail = detail;
    }

    private String message; 
    private ServiceApplicationFault detail;
 
  }
