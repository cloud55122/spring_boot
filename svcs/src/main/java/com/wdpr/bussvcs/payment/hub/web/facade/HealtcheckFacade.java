package com.wdpr.bussvcs.payment.hub.web.facade;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.wdpr.bussvcs.payment.hub.util.ApplicationData;

@Service
public class HealtcheckFacade {

    private BuildProperties buildProperties;
    private Environment environment;

    @Autowired
    public HealtcheckFacade(BuildProperties buildProperties, Environment environment) {
        this.buildProperties = buildProperties;
        this.environment = environment;
    }

    public ApplicationData getDataApp() throws Throwable {
        ZonedDateTime now = ZonedDateTime.now();
        ZoneId zoneId = now.getZone();
        String hour = Instant.parse(buildProperties.get("time")).atZone(zoneId).format(DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss z"));
        return ApplicationData.builder().version(buildProperties.getVersion())
                .springProfile(environment.getActiveProfiles()[0])
                .serverStartedTime(hour).build();

    }

}