package br.com.erudio.services;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

// @Service > Serve para que o SpringBoot encare esse cara como um objeto
// que vai ser injetado em RunTime em outras classes da aplicação
@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {
        logger.info("Finding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Jilvan");
        person.setLastName("Junior");
        person.setAddress("Osasco - SP");
        person.setGender("Male");
        return person;
    }

}
