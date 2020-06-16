package com.wdpr.bussvcs.payment.hub.web.facade;

import org.springframework.stereotype.Service;

//Facade Pattern Example
@Service
public class PostPaymentServiceFacade {

//    private PaymentIF paymentServiceIF;
//
//    @Autowired
//    public PostPaymentServiceFacade(PaymentIF paymentServiceIF) {
//        this.paymentServiceIF = paymentServiceIF;
//    }
//
//    public PostCardPaymentResponse postCardPayment(PostCardPayment postCardPaymentRequest, String loggedUser, String conversationId) throws Throwable{
//        PostCardPaymentResponse postCardPaymentResponse = new PostCardPaymentResponse();
//        try {
//            postCardPaymentResponse.setReturnParameter(paymentServiceIF.postCardPayment(postCardPaymentRequest.getPmtInfo(),
//                    ServiceClientFactory.getServiceContext(loggedUser, conversationId)));
//        } catch (Throwable e) {
//            e.printStackTrace();
//            throw e;
//        }
//        return postCardPaymentResponse;
//    }
//
//    public PaymentsResponse retrieveCardPaymentInfo(Long txnId, String loggedUser, String conversationId) throws Throwable {
//        List<Long> txnIds = new ArrayList<Long>(Arrays.asList(txnId));
//        List<String> pmtQs = new ArrayList<String>(Arrays.asList(PaymentRetrievalTypeEnum.PAYMENT_RETRIEVAL_BASIC.value()));
//        PaymentsResponse response = null;
//        try {
//            response = paymentServiceIF.retrieveCardPaymentInfo(txnIds, pmtQs, new ArrayList<Long>(),
//                    new ArrayList<String>(), ServiceClientFactory.getServiceContext(loggedUser, conversationId));
//        } catch (Throwable e) {
//            e.printStackTrace();
//            throw e;
//        }
//        return response;
//    }
}
