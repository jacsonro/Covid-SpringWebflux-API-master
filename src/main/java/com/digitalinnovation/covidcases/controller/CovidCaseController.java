package com.digitalinnovation.covidcases.controller;

import com.digitalinnovation.covidcases.document.CovidCase;
import com.digitalinnovation.covidcases.repository.CovidCaseRepository;
import com.digitalinnovation.covidcases.service.CovidCaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



import static com.digitalinnovation.covidcases.constants.CovidCaseConstant.COVID_CASE_ENDPOINT_LOCAL;

@RestController
@Slf4j
public class CovidCaseController {
  CovidCaseService covidCaseService;

  CovidCaseRepository covidCaseRepository;
/*
  private static final org.slf4j.Logger log =
    org.slf4j.LoggerFactory.getLogger(CovidCaseController.class);
*/


  public CovidCaseController(CovidCaseService covidCaseService, CovidCaseRepository covidCaseRepository) {
    this.covidCaseService = covidCaseService;
    this.covidCaseRepository = covidCaseRepository;
  }

  @GetMapping(COVID_CASE_ENDPOINT_LOCAL)
  @ResponseStatus(HttpStatus.OK)
  public Flux<CovidCase> getAllItems() {
    log.info("requesting the list off all covid cases");
    return covidCaseService.findAll();

  }


  @GetMapping(COVID_CASE_ENDPOINT_LOCAL + "/{id}")
  public Mono<ResponseEntity<CovidCase>> findByIdCovidCase(@PathVariable String id) {
    log.info("Requesting the covid case with id {}", id);
    return covidCaseService.findByIdCovidCase(id)
      .map((item) -> new ResponseEntity<>(item, HttpStatus.OK))
      .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping(COVID_CASE_ENDPOINT_LOCAL)
  @ResponseStatus(HttpStatus.CREATED)
  public Mono<CovidCase> createCovidCase(@RequestBody CovidCase covidCase) {
    log.info("A new covidCase case was Created");
    return covidCaseService.save(covidCase);

  }

  @DeleteMapping(COVID_CASE_ENDPOINT_LOCAL + "/{id}")
  @ResponseStatus(code = HttpStatus.NOT_FOUND)
  public Mono<HttpStatus> deletebyIDCovidCase(@PathVariable String id) {
    covidCaseService.deletebyIDCovidCase(id);
    log.info("Deleting the covid case with id {}", id);
    return Mono.just(HttpStatus.NOT_FOUND);
  }
}
