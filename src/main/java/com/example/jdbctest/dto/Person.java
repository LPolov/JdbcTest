package com.example.jdbctest.dto;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Person {

  @Id
  Long id;
  String name;
  Integer age;
}
