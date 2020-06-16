package com.wdpr.bussvcs.payment.hub.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


@Configuration
//@Import({ SecurityConfiguration.class, JwtTokenConfig.class })
@PropertySource("classpath:jwt-token.properties")
public class ServletConfig {
    
    private static final String SECURED_CONTEXT_API = "/*";

    /**
     * This method will register the Filter registration bean required for
     * servlet filter required for authz.
     *
     * @return FilterRegistrationBean
     */
    //Filter registration example for services
//    @Bean
//    public FilterRegistrationBean httpServletFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new com.wdpr.ee.loggingapi.filter.HttpLoggingFilter());
//        registration.addUrlPatterns("/*");
//        registration.setName("HttpServletFilter");
//        return registration;
//    }

    /**
     * This Filter will register the Filter bean required for oauth filter
     * registration.
     *
     * @return FilterRegistrationBean
     */
//    @Bean
//    public FilterRegistrationBean oAuthFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        final AuthFilter authFilter = new AuthFilter();
//        registration.setFilter(authFilter);
//        registration.addUrlPatterns(SECURED_CONTEXT_API);
//        registration.setName("OAuthFilter");
//        registration.setOrder(1);
//        return registration;
//    }
}
