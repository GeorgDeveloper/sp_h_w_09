package ru.georgdeveloper;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDiscoveryClient
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("tasks-service", r -> r.path("/tasks/**")
                        .uri("http://localhost:8081/"))
                .route("users-service", r -> r.path("/users/**")
                        .uri("http://localhost:8082/"))
                .route("web-service", r -> r.path("/**")
                        .uri("http://localhost:8083/"))
                .build();
    }
}