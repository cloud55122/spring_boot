package com.wdpr.bussvcs.payment.hub.configuration;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class ServiceClientFactory {
    
    private long connectTimeout;
    private long serviceTimeout;

    public ServiceClientFactory(@Value("${payment.hub.ui.read.timeout.millis}") final long connectTimeout,@Value("${payment.hub.ui.connection.timeout.millis}") final long serviceTimeout) {
		this.connectTimeout = connectTimeout;
		this.serviceTimeout = serviceTimeout;
	}

	public <T> T getWebServiceClient(Class<T> clazz, String url) {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        proxyFactory.getInInterceptors().add(new LoggingInInterceptor());
        proxyFactory.getOutInterceptors().add(new LoggingOutInterceptor());
        proxyFactory.setServiceClass(clazz);

        proxyFactory.setAddress(url);

        @SuppressWarnings("unchecked")
        T service = (T) proxyFactory.create();

        HTTPConduit conduit = (HTTPConduit) ClientProxy.getClient(service).getConduit();
        HTTPClientPolicy policy = new HTTPClientPolicy();
        policy.setConnectionTimeout(connectTimeout);
        policy.setReceiveTimeout(serviceTimeout);
        policy.setAllowChunking(false);
        conduit.setClient(policy);
        return service;
    }
    
//    public static ServiceContext getServiceContext(String loggedUser, String conversationId) {
//        ServiceContext serviceContext = new ServiceContext();
//        serviceContext.setUserName(loggedUser);
//        serviceContext.setConversationId(conversationId);
//        return serviceContext;
//    }
//   
    
}
