package com.devang.test.repo;

import org.springframework.data.repository.CrudRepository;

import com.devang.test.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
