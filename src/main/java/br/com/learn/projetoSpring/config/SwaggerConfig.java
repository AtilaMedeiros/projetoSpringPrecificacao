package br.com.learn.projetoSpring.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {


    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("projetoSpring-controller")
                .pathsToMatch("/controller/**")
                .build();
    }

}



