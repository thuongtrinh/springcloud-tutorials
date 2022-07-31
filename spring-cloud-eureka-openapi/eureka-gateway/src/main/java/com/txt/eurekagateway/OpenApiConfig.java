package com.txt.eurekagateway;

import org.springdoc.core.SwaggerUiConfigParameters;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    private final RouteDefinitionLocator locator;
    private final SwaggerUiConfigParameters swaggerUiConfigParameters;

    public OpenApiConfig(RouteDefinitionLocator locator, SwaggerUiConfigParameters swaggerUiConfigParameters) {
        this.locator = locator;
        this.swaggerUiConfigParameters = swaggerUiConfigParameters;
    }

    @Bean
    public void apis() {
        List<RouteDefinition> definitions = locator.getRouteDefinitions().collectList().block();

        definitions.stream()
                .filter(routeDefinition -> routeDefinition.getId().matches(".*-engine"))
                .forEach(routeDefinition -> {
                    String name = routeDefinition.getId().replaceAll("-engine", "");
                    swaggerUiConfigParameters.addGroup(name);
                });
    }
}
