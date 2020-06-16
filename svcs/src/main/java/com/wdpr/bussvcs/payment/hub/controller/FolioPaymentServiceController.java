package com.wdpr.bussvcs.payment.hub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdpr.bussvcs.payment.hub.web.facade.FolioPaymentServiceFacade;

@RestController
@RequestMapping(value = "/folio-payment-service")
public class FolioPaymentServiceController {
    
    private FolioPaymentServiceFacade folioPaymentServiceFacade;
    @Autowired
    public FolioPaymentServiceController(final FolioPaymentServiceFacade folioPaymentServiceFacade) {
        this.folioPaymentServiceFacade = folioPaymentServiceFacade;
    }
// Example of Post services

//    @RequestMapping(value = "/process-voucher-payment", consumes = "application/json", method = RequestMethod.POST)
//    public VoucherPaymentResponse processVoucherPayment(@RequestBody String jsonProcessVoucherPayment, @RequestHeader Map<String, String> headers) throws Throwable{
//    	String loggedUser = headers.get(Constants.LOGGED_USER);
//    	String conversationId = headers.get(Constants.CONVERSATION_ID);
//        GsonMapper gsonMapper = new GsonMapper();
//        VoucherPaymentDto voucherPaymentDTO = gsonMapper.fromJson(jsonProcessVoucherPayment,
//                VoucherPaymentDto.class);
//        VoucherPaymentRequest voucherPaymentRequest = new VoucherPaymentRequestFactory(
//                voucherPaymentDTO.getVoucherNumber(), voucherPaymentDTO.getPaymentMethod())
//                        .withPaymentInfo(voucherPaymentDTO).withFolioIdentifierInfo(voucherPaymentDTO).withOverrideCodes(voucherPaymentDTO.getOverrideCodes())
//                        .withPaymentSource(voucherPaymentDTO).build();
//        VoucherPaymentResponse processVoucherPaymentResonse;        
//        processVoucherPaymentResonse = folioPaymentServiceFacade
//                    .processVoucherPayment(voucherPaymentRequest, loggedUser, conversationId);        
//        return processVoucherPaymentResonse;
//
//    }
//
//    @RequestMapping(value = "/process-check-payment", consumes = "application/json", method = RequestMethod.POST)
//    public CheckPaymentResponse processCheckPayment(@RequestBody String jsonProcessCheckPayment, @RequestHeader Map<String, String> headers) throws Throwable{
//    	String loggedUser = headers.get(Constants.LOGGED_USER);
//    	String conversationId = headers.get(Constants.CONVERSATION_ID);
//        GsonMapper gsonMapper = new GsonMapper();
//        CheckPaymentDto checkPaymentDto = gsonMapper.fromJson(jsonProcessCheckPayment, CheckPaymentDto.class);
//        CheckPaymentRequest checkPaymentRequest = new CheckPaymentRequestFactory(
//                checkPaymentDto.getAuthorizationNumber(), checkPaymentDto.getCheckNumber(),
//                checkPaymentDto.getDocumentOriginator(), checkPaymentDto.getPaymentMethod())
//                        .withPaymentInfo(checkPaymentDto).withFolioIdentifierInfo(checkPaymentDto).withOverrideCodes(checkPaymentDto.getOverrideCodes())
//                        .withPaymentSource(checkPaymentDto).build();
//        CheckPaymentResponse processCheckPaymentResponse;        
//        processCheckPaymentResponse = folioPaymentServiceFacade
//                    .processCheckPayment(checkPaymentRequest, loggedUser, conversationId);        
//        return processCheckPaymentResponse;
//    }
}
