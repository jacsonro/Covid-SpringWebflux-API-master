package com.digitalinnovation.covidcases.repository;

import com.digitalinnovation.covidcases.document.CovidCase;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface CovidCaseRepository extends CrudRepository<CovidCase, String>{
}
