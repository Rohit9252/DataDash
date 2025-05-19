package com.api.dataforge.configuration;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Bridge API Integration",
                version = "1.0",
                description = "API documentation for Bridge Data Output Integration"
        )
)
@Configuration
public class OpenApiConfig {
}
