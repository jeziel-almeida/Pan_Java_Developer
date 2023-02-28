package com.ObserverCotacao;

public class Banco implements Observer {

    @Override
    public void notify(Cotacao cotacao) {
        System.out.println("Banco: " + cotacao);
    }
    
}
