package com.construtech.buildsphere.platform.shared.infrastructure.documentation.openapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.ExternalDocumentation;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI learningPlatformOpenApi() {
        // General Configuration
        var openApi = new OpenAPI();
        openApi
                .info(new Info()
                        .title("Construtech Buildsphere Platform API")
                        .description("Construtech Buildsphere Platform application REST API documentation.")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")))
                .externalDocs(new ExternalDocumentation()
                        .description("Construtech Buildsphere Platform Wiki Documentation")
                        .url("https://construtech-buildsphere-platform.wiki.github.io/docs"));
        return openApi;
    }
}