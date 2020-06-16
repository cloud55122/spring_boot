package com.wdpr.bussvcs.payment.hub.web.facade;

import org.springframework.stereotype.Service;

//Facade Pattern Example
@Service
public class AccountingServiceFacade {

    
//    private AccountingConfigBoundaryServiceIF accountingService;
//
//    HashMap<Integer, AccountingCenterTO> accountingCenterListCache = new HashMap<Integer, AccountingCenterTO>();
//    
//    @Autowired
//    public AccountingServiceFacade(final AccountingConfigBoundaryServiceIF accountingService) {
//        this.accountingService = accountingService;
//    }
//
//    public ArrayList<AccountingCenterTO> getAccountingCentersByType(String loggedUser, String conversationId) throws Throwable {
//        ArrayList<AccountingCenterTO> accountingCenterTOs = null;
//        try {
//            accountingCenterTOs = (ArrayList<AccountingCenterTO>) accountingService.retriveAccountingCenterByType(AccountingCenterType.BANKING_ACCOUNTING_CENTER, ServiceClientFactory.getServiceContext(loggedUser, conversationId));
//        } catch (Throwable e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//            throw e;
//        }
//        return accountingCenterTOs;
//    }
//    
//   public List<PaymentMethodTO> retrievePaymentTypesAndMethodsByBac(List<String> bankingAccountingCenters, String loggedUser, String conversationId) throws Throwable {
//       
//    List<PaymentMethodTO> retrievePaymentMethodsResponse = null;
//    try {
//        retrievePaymentMethodsResponse = accountingService.retrievePaymentMethods(bankingAccountingCenters, ServiceClientFactory.getServiceContext(loggedUser, conversationId));
//    } catch (Throwable e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//        throw e;
//    }
//    return retrievePaymentMethodsResponse;
//   }


}
