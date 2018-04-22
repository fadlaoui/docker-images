package com.docker.java.controllers;

import com.docker.java.entities.Person;
import com.docker.java.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * <h1>Role</h1>
 * <p>Description </p>
 * <b>Note:</b>
 *
 * @author Mohamed Fadlaoui
 * @version 1.0
 * @projet java
 * @since 17:01 22/04/2018
 */
@RestController
public class HomeController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("checkHealth")
    public String hello(){
        return "Up";
    }

    @GetMapping("getUserById")
    public Optional<Person> findPerson(@RequestParam("id") Long id){
        return personRepository.findById(id);
    }
}

