package com.ObserverCotacao;

public class Cotacao {
    
    private String moeda;
    private double valor;

    public Cotacao(String moeda, double valor) {
        this.moeda = moeda;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Cotacao[moeda=" + moeda + ", valor=" + valor + "]";
    }
}
