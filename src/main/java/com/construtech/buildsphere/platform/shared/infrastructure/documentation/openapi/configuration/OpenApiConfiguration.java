package com.construtech.buildsphere.platform.shared.infrastructure.documentation.openapi.configuration;

<<<<<<< HEAD
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
=======
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.ExternalDocumentation;
>>>>>>> bc11713 (docs: initial configuration for swagger)

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI learningPlatformOpenApi() {
        // General Configuration
        var openApi = new OpenAPI();
        openApi
                .info(new Info()
<<<<<<< HEAD
                        .title("ACME Learning Platform API")
                        .description("ACME Learning Platform application REST API documentation.")
=======
                        .title("Construtech Buildsphere Platform API")
                        .description("Construtech Buildsphere Platform application REST API documentation.")
>>>>>>> bc11713 (docs: initial configuration for swagger)
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")))
                .externalDocs(new ExternalDocumentation()
<<<<<<< HEAD
                        .description("ACME Learning Platform Wiki Documentation")
                        .url("https://acme-learning-platform.wiki.github.io/docs"));
        return openApi;
    }
}
=======
                        .description("Construtech Buildsphere Platform Wiki Documentation")
                        .url("https://construtech-buildsphere-platform.wiki.github.io/docs"));
        return openApi;
    }
}
>>>>>>> bc11713 (docs: initial configuration for swagger)
