package com.digitalinnovation.covidcases.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Sex {
    MASC("Macsul"),
    FEM("Feminino"),
    NEUTRO("Neutro");
    private final String description;
}
