package com.wdpr.bussvcs.payment.hub.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeanFactory {
    
    private ServiceClientFactory serviceClientFactory;
    
    @Autowired
    public ServiceBeanFactory(final ServiceClientFactory serviceClientFactory) {
        this.serviceClientFactory = serviceClientFactory;
    }
//Add bean services section here, example:
//    @Bean
//    public FolioPaymentServiceV2SEI getFolioPaymentService(@Value("${payment.hub.ui.folio.payment.service.url}") final String folioPaymentServiceUrl) {
//        return serviceClientFactory.getWebServiceClient(FolioPaymentServiceV2SEI.class,
//                folioPaymentServiceUrl);
//    }


}
