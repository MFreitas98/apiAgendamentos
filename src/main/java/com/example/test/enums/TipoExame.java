package com.example.test.enums;

public enum TipoExame {

    IMAGEM("Tipo Imagem"),
    COLETA("Tipo Coleta");

    private final String description;

    TipoExame(String description) {
        this.description = description;
    }
}
