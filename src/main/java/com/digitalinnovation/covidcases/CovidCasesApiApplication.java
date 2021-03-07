package com.digitalinnovation.covidcases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;

@SpringBootApplication
@EnableDynamoDBRepositories
public class CovidCasesApiApplication {

  public static void main(String[] args) {

    SpringApplication.run(CovidCasesApiApplication.class, args);
    System.out.println("Casos de Covid com webflux");
  }

}

