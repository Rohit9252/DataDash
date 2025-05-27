package com.api.dataforge.configuration;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "listing")
public class ListingCriteriaConfig {

    private List<String> propertySubTypes;
    private List<String> city;
    private PriceRange priceRange;

    @Data
    public static class PriceRange {
        private Integer min;
        private Integer max;
    }


}
