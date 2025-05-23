package com.api.dataforge.components;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bridge")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BridgeProperties {

    private String baseUrl;
    private String encryptedToken;
    private String mockUrl;

}
