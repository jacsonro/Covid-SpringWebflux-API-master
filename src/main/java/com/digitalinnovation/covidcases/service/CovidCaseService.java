package com.digitalinnovation.covidcases.service;

import com.digitalinnovation.covidcases.document.CovidCase;
import com.digitalinnovation.covidcases.repository.CovidCaseRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CovidCaseService {
  private final CovidCaseRepository covidCaseRepository;

  public CovidCaseService(CovidCaseRepository covidCaseRepository) {
    this.covidCaseRepository = covidCaseRepository;
  }

  public Flux<CovidCase> findAll(){

    return Flux.fromIterable(this.covidCaseRepository.findAll());
  }

  public  Mono<CovidCase> findByIdCovidCase(String id){
    return  Mono.justOrEmpty(this.covidCaseRepository.findById(id));
  }


  public Mono<CovidCase> save(CovidCase covidCase){
    return  Mono.justOrEmpty(this.covidCaseRepository.save(covidCase));
  }


  public Mono<Boolean> deletebyIDCovidCase(String id) {
    covidCaseRepository.deleteById(id);
    return Mono.just(true);

  }

}

