package com.halyph.config;

import com.halyph.entity.Person;
import com.halyph.entity.PersonDto;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class MyCustomMapper extends ConfigurableMapper {
    protected void configure(MapperFactory factory) {
        factory.classMap(Person.class, PersonDto.class)
                .field("name.first", "firstName")
                .field("name.last", "lastName")
                .field("birthDate", "date")
//                .field("alias.first", "aliases[0]")
//                .field("alias.last", "aliases[1]")
                .byDefault()
                .register();
    }
}
