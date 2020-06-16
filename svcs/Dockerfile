# Latest Tomcat 8 and JRE 8 version base images
FROM 876496569223.dkr.ecr.us-east-1.amazonaws.com/wdpr-ra/wdpr-ra-docker-base-tc8jre8:v2

# Add property decoder to tomcat library
# ADD https://nexus.disney.com/nexus/service/local/repositories/WDPRT-latest/content/com/wdpr/ee/wdpr-ra-tc-db-connection-pool/1.0.0-2.0.0.0/wdpr-ra-tc-db-connection-pool-1.0.0-2.0.0.0.jar $CATALINA_HOME/lib/

# Configure catalina properties to use the digester
# RUN echo org.apache.tomcat.util.digester.PROPERTY_SOURCE=com.wdpr.ee.tomcat.util.EnvironmentPropertyDecoder >> $CATALINA_HOME/conf/catalina.properties

ENV LOGDIR "/usr/local/tomcat/logs"
ENV ENABLE_SECURE_PORTS="true"

ADD target/svcs.war   $CATALINA_HOME/webapps/svcs.war
ADD config/* $CATALINA_HOME/conf/

#RUN wget http://central.maven.org/maven2/mysql/mysql-connector-java/5.1.38/mysql-connector-java-5.1.38.jar --directory-prefix=$CATALINA_HOME/lib/
RUN mkdir -p /scripts /props/wdpr /appdynamics