package com.wsb.wsb_bugtracker.people;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByUsername(String username);
    List<Person> findPersonByEnabledIsTrue();
}
