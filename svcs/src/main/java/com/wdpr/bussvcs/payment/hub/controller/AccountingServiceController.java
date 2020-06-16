package com.wdpr.bussvcs.payment.hub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdpr.bussvcs.payment.hub.web.facade.AccountingServiceFacade;

@RestController
@RequestMapping(value = "/accounting-service")
public class AccountingServiceController {

    private AccountingServiceFacade accountingServiceFacade;

    @Autowired
    public AccountingServiceController(final AccountingServiceFacade accountingServiceFacade) {
        this.accountingServiceFacade = accountingServiceFacade;
    }
    // Example to expose services

//    @RequestMapping(value = "/retrieve-bac-by-type")
//    public ArrayList<AccountingCenterTO> retrieveAccountingCentersByType(@RequestHeader Map<String, String> headers) throws Throwable {
//    	String loggedUser = headers.get(Constants.LOGGED_USER);
//    	String conversationId = headers.get(Constants.CONVERSATION_ID);
//        ArrayList<AccountingCenterTO> accountingCentersByType = accountingServiceFacade
//                .getAccountingCentersByType(loggedUser, conversationId);
//        return accountingCentersByType;
//    }


}
