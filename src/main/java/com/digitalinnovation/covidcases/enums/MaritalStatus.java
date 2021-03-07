package com.digitalinnovation.covidcases.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MaritalStatus {
    CASADO("Casado"),
    SOLTEIRO("Solteiro"),
    UNIAO_ESTAVEL("União Estável");
    private final String description;
}
