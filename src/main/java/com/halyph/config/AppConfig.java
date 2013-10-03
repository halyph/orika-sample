package com.halyph.config;

import com.halyph.mapper.DozerMapper;
import com.halyph.mapper.Mapper;
import com.halyph.mapper.OrikaMapper;
import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class AppConfig {

    @Bean(name = "orika")
    public Mapper mapperOrika() {
        return new OrikaMapper(new MyCustomMapper());
    }

    @Bean(name="dozer")
    public Mapper mapperDozer(DozerBeanMapper map) {
        return new DozerMapper(map);
    }

    @Bean
    public DozerBeanMapper dozerBeanMapper() {
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        return dozerBeanMapper;
    }

}