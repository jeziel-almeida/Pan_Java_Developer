package com.ObserverCotacao;

public class Main {
    public static void main(String[] args) {
        
        var banco = new Banco();
        var investidor = new Investidor();

        var servidorCotacao = new ServidorCotacao();

        servidorCotacao.registerObserver(banco);
        servidorCotacao.registerObserver(investidor);

        servidorCotacao.novaCotacao(new Cotacao("USD", 4));
    }
}
