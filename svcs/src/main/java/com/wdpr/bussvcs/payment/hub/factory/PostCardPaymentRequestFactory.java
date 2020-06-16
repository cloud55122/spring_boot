package com.wdpr.bussvcs.payment.hub.factory;

//Factory Pattern example
public class PostCardPaymentRequestFactory extends PaymentRequestFactory {

//    private PostCardPayment postCardPaymentRequest;
//
//    public PostCardPaymentRequestFactory(CardPaymentDTO cardPaymentDTO) {
//        this.postCardPaymentRequest = new PostCardPayment();
//    }
//
//    public PostCardPaymentRequestFactory withPaymentInfo(CardPaymentDTO cardPaymentDTO) {
//        this.postCardPaymentRequest.setPmtInfo(createCardPaymentInfo(cardPaymentDTO));
//        return this;
//    }
//
//    public PostCardPaymentRequestFactory withPaymentMethodInfo(CardPaymentDTO cardPaymentDTO) {
//        this.postCardPaymentRequest.getPmtInfo().setPaymentMethodInfo(createPaymentMethodInfo(cardPaymentDTO));
//        return this;
//    }
//
//    public PostCardPaymentRequestFactory withResponsibleParty(CardPaymentDTO cardPaymentDTO) {
//        this.postCardPaymentRequest.getPmtInfo().setResponsibleParty(createResponsiblePartyInfo(cardPaymentDTO));
//        return this;
//    }
//
//    public PostCardPaymentRequestFactory withTenderAmount(CardPaymentDTO cardPaymentDTO) {
//        this.postCardPaymentRequest.getPmtInfo().setTenderedAmount(createAmount(cardPaymentDTO));
//        return this;
//    }
//
//    public PostCardPaymentRequestFactory withConvertedAmount(CardPaymentDTO cardPaymentDTO) {
//        this.postCardPaymentRequest.getPmtInfo().setConvertedAmount(createAmount(cardPaymentDTO));
//        return this;
//    }
//
//    public CardPaymentInfo createCardPaymentInfo(CardPaymentDTO cardPaymentDTO) {
//        AddressTO address = new AddressTO();
//        CardPaymentInfo cardPaymentInfo = new CardPaymentInfo();
//        cardPaymentInfo.setBankingACName(cardPaymentDTO.getBankingAccountingCenterName());
//        cardPaymentInfo.setCurrencyExcangeRate(new Double(cardPaymentDTO.getCurrencyExcangeRate()));
//        cardPaymentInfo.setLocationId(Long.parseLong(cardPaymentDTO.getLocationId()));
//        cardPaymentInfo.setLengthOfStay(Long.parseLong(cardPaymentDTO.getLengthOfStay()));
//        cardPaymentInfo.setOverriddenErrors(cardPaymentDTO.getOverriddenErrors());
//        cardPaymentInfo.setPostingDate(DateUtil.stringToDate(cardPaymentDTO.getPostingDate()));
//        cardPaymentInfo.setCardNumber(cardPaymentDTO.getCardNumber().replaceAll("\\d(?=\\d{4})", "*"));
//        cardPaymentInfo.setExpirationDate(cardPaymentDTO.getExpirationDate());
//        cardPaymentInfo.setName(cardPaymentDTO.getCardHolderName());
//        cardPaymentInfo.setDeviceTerminalId(cardPaymentDTO.getDeviceTerminalId());
//        cardPaymentInfo.setCardAuthorizationInfoTO(
//                createCardAuthorizationInfo(cardPaymentDTO.getCardAuthorizationInfo(), createAmount(cardPaymentDTO)));
//        address.setCountry(cardPaymentDTO.getAddress().getCountry());
//        cardPaymentInfo.setAddress(address);
//
//        return cardPaymentInfo;
//    }
//
//    private AmountTO createAmount(CardPaymentDTO cardPaymentDTO) {
//        AmountTO amountTO = new AmountTO();
//        amountTO.setAmount(new BigDecimal(cardPaymentDTO.getAmount()));
//        amountTO.setCurrency(cardPaymentDTO.getCurrencyCode());
//        return amountTO;
//    }
//
//    private PaymentMethodInfo createPaymentMethodInfo(CardPaymentDTO cardPaymentDTO) {
//        PaymentMethodInfo paymentMethodInfo = new PaymentMethodInfo();
//        paymentMethodInfo.setPaymentMethodCd(cardPaymentDTO.getPaymentMethod());
//        paymentMethodInfo.setPaymentMethodTypeCd(cardPaymentDTO.getPaymentMethodType());
//        return paymentMethodInfo;
//    }
//
//    private ResponsiblePartyInfo createResponsiblePartyInfo(CardPaymentDTO cardPaymentDTO) {
//        ResponsiblePartyInfo responsiblePartyInfo = new ResponsiblePartyInfo();
//        responsiblePartyInfo.setBookingSource(cardPaymentDTO.getExternalReferenceSource());
//        responsiblePartyInfo.setExternalReferenceNumber(cardPaymentDTO.getExternalReferenceValue());
//        responsiblePartyInfo.setFolioId(new Long(cardPaymentDTO.getFolioId()));
//        responsiblePartyInfo.setFolioType(cardPaymentDTO.getFolioType());
//        responsiblePartyInfo.setThreeLetterPartyName(cardPaymentDTO.getPartyLastName());
//        responsiblePartyInfo.setTpId(Long.getLong(cardPaymentDTO.getTpId()));
//        return responsiblePartyInfo;
//    }
//
//    private CardAuthorizationInfo createCardAuthorizationInfo(CardAuthorizationInfoDTO cardAuthorizationInfoTO, AmountTO authAmount) {
//        CardAuthorizationInfo cardAuthorizationInfo = new CardAuthorizationInfo();
//        cardAuthorizationInfo.setAuthorizationCode(cardAuthorizationInfoTO.getAuthorizationCode());
//        cardAuthorizationInfo.setAuthorizationType(cardAuthorizationInfoTO.getAuthorizationType());
//        cardAuthorizationInfo.setCardTrackType(cardAuthorizationInfoTO.getCardTrackType());
//        cardAuthorizationInfo.setExpirationMonth(Integer.valueOf(cardAuthorizationInfoTO.getExpirationMonth()));
//        cardAuthorizationInfo.setExpirationYear(Integer.valueOf(cardAuthorizationInfoTO.getExpirationYear()));
//        cardAuthorizationInfo.setRetrievalReferenceNumber(cardAuthorizationInfoTO.getRetrievalReferenceNumber());
//        cardAuthorizationInfo.setRetrievalReferenceNumberKey(cardAuthorizationInfoTO.getRetrievalReferenceNumberKey());
//        cardAuthorizationInfo.setStratusTermId(Integer.valueOf(cardAuthorizationInfoTO.getStratusTermId()));
//        cardAuthorizationInfo.setDataOriginCode(cardAuthorizationInfoTO.getDataOriginCode());
//        cardAuthorizationInfo.setAuthAmount(authAmount);
//        return cardAuthorizationInfo;
//    }
//
//    public PostCardPayment build() {
//        return this.postCardPaymentRequest;
//    }
}
