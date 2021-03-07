package com.digitalinnovation.covidcases;

import org.springframework.boot.test.context.SpringBootTest;

import org.junit.Test;
import com.digitalinnovation.covidcases.repository.CovidCaseRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static com.digitalinnovation.covidcases.constants.CovidCaseConstant.COVID_CASE_ENDPOINT_LOCAL;


@RunWith(SpringRunner.class)
@DirtiesContext
@AutoConfigureWebTestClient
@SpringBootTest
public class CovidCaseApiApplicationTests {

  @Autowired
  WebTestClient webTestClient;

  @Autowired
  CovidCaseRepository covidCaseRepository;


  @Test
  public void getOneHeroeById(){

    webTestClient.get().uri(COVID_CASE_ENDPOINT_LOCAL.concat("/{id}"),"1")
      .exchange()
      .expectStatus().isOk()
      .expectBody();


  }

  @Test
  public void getOneHeronotFound(){

    webTestClient.get().uri(COVID_CASE_ENDPOINT_LOCAL.concat("/{id}"),"3")
      .exchange()
      .expectStatus().isNotFound();

  }


  @Test
  public void deleteHero(){

    webTestClient.delete().uri(COVID_CASE_ENDPOINT_LOCAL.concat("/{id}"),"3")
      .accept(MediaType.APPLICATION_JSON)
      .exchange()
      .expectStatus().isNotFound()
      .expectBody(Void.class);

  }

}


