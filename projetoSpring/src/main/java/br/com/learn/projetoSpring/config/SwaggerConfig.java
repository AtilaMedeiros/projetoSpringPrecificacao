package br.com.learn.projetoSpring.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;




    @Configuration
    public class SwaggerConfig {
        public GroupedOpenApi publicApi() {
            return GroupedOpenApi.builder()
                    .group("projetoSpring-controller")
                    .pathsToMatch("/controller/**")
                    .build();
        }



    }






