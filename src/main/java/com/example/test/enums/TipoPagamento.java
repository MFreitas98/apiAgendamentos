package com.example.test.enums;

public enum TipoPagamento {

    DINHEIRO("Dinheiro"),
    DEBITO("Cartão de Debito"),
    CREDITO("Cartão de Credito");

    private final String description;

    TipoPagamento(String description) {
        this.description = description;
    }
}
