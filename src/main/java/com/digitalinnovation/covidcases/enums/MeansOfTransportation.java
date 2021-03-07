package com.digitalinnovation.covidcases.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MeansOfTransportation {
    PUBLICO("Tránsporte Público"),
    CARRO("Carro"),
    MOTO("Moto"),
    BICICLETA( "Bicicleta"),
    A_PE("A pé");
    private final String description;
}
