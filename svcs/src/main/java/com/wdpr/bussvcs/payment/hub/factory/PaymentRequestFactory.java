package com.wdpr.bussvcs.payment.hub.factory;


//Factory Pattern example
public abstract class PaymentRequestFactory {
    
    
//    public PaymentInfo createPaymentInfo(PaymentDto paymentDTO) {
//        PaymentInfo paymentInfo = new PaymentInfo();
//        paymentInfo.setCurrencyCode(paymentDTO.getCurrencyCode());
//        paymentInfo.setPostingAmount(new Double(paymentDTO.getAmount()));
//        paymentInfo.setPostingDate(DateUtil.stringToDate(paymentDTO.getPostingDate()));
//        if(paymentDTO.getTxnId() != null && !paymentDTO.getTxnId().isEmpty()) {
//            paymentInfo.setTxnId(Long.valueOf(paymentDTO.getTxnId()));
//        }
//        return paymentInfo;
//    }
//    
//    public FolioIdentifierInfo createFolioIdentifierInfo(PaymentDto paymentDto) {
//        FolioIdentifierInfo folioIdentifierInfo = new FolioIdentifierInfo();
//        folioIdentifierInfo.setExternalReferenceSource(paymentDto.getExternalReferenceSource());
//        folioIdentifierInfo.setExternalReferenceValue(paymentDto.getExternalReferenceValue());
//        folioIdentifierInfo.setFolioId(paymentDto.getFolioId());
//        folioIdentifierInfo.setFolioType(paymentDto.getFolioType());
//        folioIdentifierInfo.setPartyLastName(paymentDto.getPartyLastName());
//        return folioIdentifierInfo;
//    }
//    
//   
//    public PaymentSource createPaymentSource(PaymentDto paymentDTO) {
//        PaymentSource paymentSource = new PaymentSource();
//        paymentSource.setBankingAccountingCenterId(Long.valueOf(paymentDTO.getBankingAccountingCenterId()));
//        paymentSource.setBankingAccountingCenterName(paymentDTO.getBankingAccountingCenterName());
//        paymentSource.setLocationId(Long.valueOf(paymentDTO.getLocationId()));        
//        return paymentSource;
//    }

}
