package com.EqualsEHashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Carro siena = new Carro("Chevrolet");

        Carro gol = new Carro("Ford");

        List<Carro> minhaLista = new ArrayList<>();

        minhaLista.add(gol);
        minhaLista.add(new Carro("Ford"));

        System.out.println("Na lista, há siena: "+minhaLista.contains(siena));

        
    }
}
