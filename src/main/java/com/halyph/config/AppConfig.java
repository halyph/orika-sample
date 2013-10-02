package com.halyph.config;

import ma.glasnost.orika.MapperFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.halyph.hello.HelloWorld;
import com.halyph.hello.impl.HelloWorldImpl;

@Configuration
public class AppConfig {

    @Bean(name = "helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }

    @Bean
    public MapperFacade mapper() {
        return new MyCustomMapper();
    }


}