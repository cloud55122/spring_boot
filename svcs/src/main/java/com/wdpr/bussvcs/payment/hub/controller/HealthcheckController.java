package com.wdpr.bussvcs.payment.hub.controller;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdpr.bussvcs.payment.hub.web.facade.HealtcheckFacade;

@RestController
public class HealthcheckController {
    
 private HealtcheckFacade healtcheckFacade;
    
    @Autowired
    public HealthcheckController(final HealtcheckFacade healtcheckFacade) {
        this.healtcheckFacade = healtcheckFacade;
    }
    
    @RequestMapping(value = "/healthcheck")
    public Response healtCheck( ) throws Throwable {
        return Response.ok(healtcheckFacade.getDataApp()).build();
    }
}