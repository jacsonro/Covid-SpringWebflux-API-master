package com.digitalinnovation.covidcases.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Race {
    BRANCA("Branca"),
    INDIGINA("Indígina"),
    NEGRA("Negra"),
    PARDA("Parda");
    private final String description;
}
