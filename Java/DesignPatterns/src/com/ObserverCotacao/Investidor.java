package com.ObserverCotacao;

public class Investidor implements Observer {

    @Override
    public void notify(Cotacao cotacao) {
        System.out.println("Investidor: " + cotacao);
    }
    
}
