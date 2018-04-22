package com.docker.java.repositories;

import com.docker.java.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <h1>Role</h1>
 * <p>Description </p>
 * <b>Note:</b>
 *
 * @author Mohamed Fadlaoui
 * @version 1.0
 * @projet java
 * @since 16:58 22/04/2018
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

     List<Person> findByName(String name);
}
