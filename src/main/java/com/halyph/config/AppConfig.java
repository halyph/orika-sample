package com.halyph.config;

import ma.glasnost.orika.MapperFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MapperFacade mapper() {
        return new MyCustomMapper();
    }


}