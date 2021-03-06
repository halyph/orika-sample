package com.halyph.core;

import com.halyph.config.AppConfig;
import com.halyph.entity.Name;
import com.halyph.entity.NameDto;
import com.halyph.entity.Person;
import com.halyph.entity.PersonDto;
import ma.glasnost.orika.MapperFacade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Name name1 = new Name("FirstName", "SecondName");
        Name name2 = new Name("Jet", "Lee");
        Person person = new Person(name1, new Date(), name2);

        System.out.println(person);
        MapperFacade mapper = context.getBean("mapper", MapperFacade.class);

        PersonDto personDto = mapper.map(person, PersonDto.class);
        System.out.println(personDto);

        NameDto nameDto = mapper.map(name1, NameDto.class);
        System.out.println(nameDto);

    }

}