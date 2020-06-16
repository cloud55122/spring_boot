package com.wdpr.bussvcs.payment.hub.web.facade;

import org.springframework.stereotype.Service;

//Facade Pattern Example
@Service
public class FolioServiceFacade {
    
//    private FolioServiceV2IF folioService;
//    
//    @Autowired
//    public FolioServiceFacade(final FolioServiceV2IF folioService) {
//        this.folioService = folioService;
//    }
//
//    public FoliosResponse retrieveAllFolios(String referenceName, String referenceValue, String sourceAccountingCenter, String loggedUser, String conversationId) throws Throwable {        
//        List<String> folioQs = new ArrayList<String>();
//        String folioBasic= FolioRetrievalTypeEnum.FOLIO_RETRIEVAL_BASIC.value();
//        folioQs.add(folioBasic);
//        String folioBal= FolioRetrievalTypeEnum.FOLIO_RETRIEVAL_ACCT_BALANCE.value();
//        folioQs.add(folioBal);
//        String folioAddlInfo= FolioRetrievalTypeEnum.FOLIO_RETRIEVAL_ADDL_INFO.value();
//        folioQs.add(folioAddlInfo);
//        List<String> settlementQs = new ArrayList<String>();
//        String settlementBasic= SettlementRetrievalTypeEnum.SETTLEMENT_RETRIEVAL_BASIC.value();
//        settlementQs.add(settlementBasic);
//        String settlementTypes= SettlementRetrievalTypeEnum.SETTLEMENT_RETRIEVAL_TYPES.value();
//        settlementQs.add(settlementTypes);
//        List<String> depositQs = new ArrayList<String>();
//        depositQs.add(DepositRetrievalTypeEnum.DEPOSIT_RETRIEVAL_BASIC.value());
//        com.wdw.folio.service.transferobject.ExternalReferenceTO chrgAcctRef = new com.wdw.folio.service.transferobject.ExternalReferenceTO();
//        chrgAcctRef.setReferenceName(referenceName);
//        chrgAcctRef.setReferenceValue(referenceValue);
//        FoliosResponse response = null;
//        try {
//            response = folioService.retrieveAllFolios(chrgAcctRef, Long.valueOf(sourceAccountingCenter), folioQs, settlementQs, null, depositQs, null, ServiceClientFactory.getServiceContext(loggedUser, conversationId));
//
//        } catch (Throwable e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//            throw e;
//        }
//        return response;
//    }
//    
//    public AccountingTO retrieveFolioDetails(String referenceName, String referenceValue, String sourceAccountingCenterId, String loggedUser, String conversationId) throws Throwable {
//       
//        ExternalReferenceTO externalReferenceTO = new ExternalReferenceTO(); 
//        externalReferenceTO.setReferenceName(referenceName);
//        externalReferenceTO.setReferenceValue(referenceValue);
//        AccountingTO retrieveFolioDetailsResponse = null;
//        try {
//            retrieveFolioDetailsResponse = folioService.retrieveFolioDetails(externalReferenceTO, Long.valueOf(sourceAccountingCenterId), null, ServiceClientFactory.getServiceContext(loggedUser, conversationId));
//        } catch (Throwable e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//            throw e;
//        }
//        return retrieveFolioDetailsResponse;
//    }
//    
}
