package com.example.jdbctest.dao;

import com.example.jdbctest.dto.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
