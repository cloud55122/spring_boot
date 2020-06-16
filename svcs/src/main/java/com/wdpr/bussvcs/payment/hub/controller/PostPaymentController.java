package com.wdpr.bussvcs.payment.hub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdpr.bussvcs.payment.hub.web.facade.PostPaymentServiceFacade;

@RestController
@RequestMapping(value = "/post-payment-service")
public class PostPaymentController {

    private PostPaymentServiceFacade postPaymentServiceFacade;

    @Autowired
    public PostPaymentController(final PostPaymentServiceFacade postPaymentServiceFacade) {
        this.postPaymentServiceFacade = postPaymentServiceFacade;
    }

//    @RequestMapping(value = "/post-card-payment", consumes = "application/json", method = RequestMethod.POST)
//    public PaymentResponseInfo postCardPayment(@RequestBody String jsonPostCardPayment,
//            @RequestHeader Map<String, String> headers) throws Throwable {
//        GsonMapper gsonMapper = new GsonMapper();
//        CardPaymentDTO cardPaymentDto = gsonMapper.fromJson(jsonPostCardPayment, CardPaymentDTO.class);
//        String loggedUser = headers.get(Constants.LOGGED_USER);
//        String conversationId = headers.get(Constants.CONVERSATION_ID);
//
//        PostCardPaymentRequestFactory postCardPaymentRequestFactory = new PostCardPaymentRequestFactory(cardPaymentDto)
//                .withPaymentInfo(cardPaymentDto).withTenderAmount(cardPaymentDto).withConvertedAmount(cardPaymentDto)
//                .withPaymentMethodInfo(cardPaymentDto).withResponsibleParty(cardPaymentDto);
//        PostCardPayment postCardPaymentRequest = postCardPaymentRequestFactory.build();
//        PostCardPaymentResponse postCardPaymentResponse = postPaymentServiceFacade.postCardPayment(postCardPaymentRequest,
//                loggedUser, conversationId);
//        return (PaymentResponseInfo) postCardPaymentResponse.getReturnParameter();
//    }
//
//    @RequestMapping(value = "/card-payment-info/{txnId}", consumes = "application/json", method = RequestMethod.GET)
//    public PaymentsResponse retrieveCardPaymentInfo(@PathVariable("txnId") Long txnId, @RequestHeader Map<String, String> headers) throws Throwable {
//        String loggedUser = headers.get(Constants.LOGGED_USER);
//        String conversationId = headers.get(Constants.CONVERSATION_ID);
//        return postPaymentServiceFacade.retrieveCardPaymentInfo(txnId, loggedUser, conversationId);
//    }
}
