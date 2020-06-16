
package com.wdpr.bussvcs.payment.hub.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationData {

    private String version;
    private String serverStartedTime;
    private String springProfile;

}