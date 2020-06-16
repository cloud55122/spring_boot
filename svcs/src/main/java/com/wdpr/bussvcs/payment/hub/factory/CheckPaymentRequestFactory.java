package com.wdpr.bussvcs.payment.hub.factory;

// Factory Pattern example
public class CheckPaymentRequestFactory extends PaymentRequestFactory{
//    CheckPaymentRequest checkPaymentRequest;
//    
//    public CheckPaymentRequestFactory(String authorizationNumber, String checkNumber, String documentOriginator, String paymentMethod) {
//        this.checkPaymentRequest = new CheckPaymentRequest();
//        this.checkPaymentRequest.setAuthorizationNumber(authorizationNumber);
//        this.checkPaymentRequest.setCheckNumber(checkNumber);
//        this.checkPaymentRequest.setDocumentOriginator(documentOriginator);
//        this.checkPaymentRequest.setPaymentMethod(paymentMethod);
//    }
//    
//    public CheckPaymentRequestFactory withPaymentInfo(CheckPaymentDto checkPaymentDTO) {
//        this.checkPaymentRequest.setPaymentInfo(createPaymentInfo(checkPaymentDTO));
//        return this;
//    }
//    
//    public CheckPaymentRequestFactory withFolioIdentifierInfo(CheckPaymentDto checkPaymentDTO) {
//        this.checkPaymentRequest.getPaymentInfo().setFolioIdentifierInfo(createFolioIdentifierInfo(checkPaymentDTO)); 
//        return this;
//    }
//    
//    
//    public CheckPaymentRequestFactory withPaymentSource(CheckPaymentDto checkPaymentDTO) {
//        this.checkPaymentRequest.getPaymentInfo().setPaymentSource(createPaymentSource(checkPaymentDTO));
//        return this;
//    }
//    
//    public CheckPaymentRequestFactory withOverrideCodes(ArrayList<String> OverrideCodes) {
//        if(OverrideCodes != null && !OverrideCodes.isEmpty()) {
//               this.checkPaymentRequest.getPaymentInfo().getOverrideCodes().addAll(OverrideCodes);
//        }
//        return this;
//    }
//    
//    public CheckPaymentRequest build() {
//        return this.checkPaymentRequest;
//    }
//    
}
