package com.api.dataforge.util;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "bridge")
public class BridgeApiProperties {

    private String baseUrl;
    private String accessToken;


}
