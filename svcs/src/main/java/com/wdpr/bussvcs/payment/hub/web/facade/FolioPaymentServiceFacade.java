package com.wdpr.bussvcs.payment.hub.web.facade;

import org.springframework.stereotype.Service;

//Facade Pattern Example
@Service
public class FolioPaymentServiceFacade {

    
//    private FolioPaymentServiceV2SEI folioPaymentService;
//
//    HashMap<String, ArrayList<PaymentMethodInfo>> paymentMethodInfoListCache = new HashMap<String, ArrayList<PaymentMethodInfo>>();
//
//    @Autowired
//    public FolioPaymentServiceFacade(final FolioPaymentServiceV2SEI folioPaymentService) {
//        this.folioPaymentService = folioPaymentService;
//    }
//    
//    public VoucherPaymentResponse processVoucherPayment(VoucherPaymentRequest voucherPaymentRequest, String loggedUser, String conversationId) throws Throwable {
//        VoucherPaymentResponse processVoucherPaymentResonse = null;
//        try {
//            processVoucherPaymentResonse = folioPaymentService.processVoucherPayment(voucherPaymentRequest, ServiceClientFactory.getServiceContext(loggedUser, conversationId), null);
//        } catch (Throwable e) {
//            e.printStackTrace();
//            throw e;
//        } 
//        return processVoucherPaymentResonse;
//    }
//    
//    public CheckPaymentResponse processCheckPayment(CheckPaymentRequest checkPaymentRequest, String loggedUser, String conversationId) throws Throwable{
//        CheckPaymentResponse processCheckPaymentResonse = null;
//        try {
//            processCheckPaymentResonse = folioPaymentService.processCheckPayment(checkPaymentRequest,ServiceClientFactory.getServiceContext(loggedUser, conversationId), null);
//        } catch (Throwable e) {
//            e.printStackTrace();
//            throw e;
//        } 
//        return processCheckPaymentResonse;
//    }
}
