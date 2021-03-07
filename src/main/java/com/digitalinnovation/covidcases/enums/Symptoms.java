package com.digitalinnovation.covidcases.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Symptoms {
    FEBRE("Febre"),
    TOSSE("Tosse seca"),
    CANSADO("Cansado"),
    DORES("Dores e desconfortos"),
    DOR_GARGANTA("Dor de garganta"),
    DIARREIA("Diarreia"),
    CONJUNTIVITE("Conjuntivite"),
    DOR_CABECA("Dor de cabeça"),
    PERDA_PALADAR_OFATO("Perda de paladar ou olfato"),
    ERUPCAO_DESCOLORACAO("Erupção cutânea na pele ou descoloração dos dedos das mãos ou dos pés"),
    FALTA_AR("Dificuldade de respirar ou falta de ar"),
    DOR_PEITO("Dor ou pressão no peito"),
    PERDA_FALA_MOVIMENTO("Perda de fala ou movimento"),
    ASSINTOMATICO("Assintomático");
    private final String description;
}
