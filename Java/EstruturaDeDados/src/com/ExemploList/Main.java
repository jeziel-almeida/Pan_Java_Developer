package com.ExemploList;

import java.util.List;
import java.util.ArrayList;

import com.EqualsEHashcode.Carro;

public class Main {
    public static void main(String[] args) {
        
        List<Carro> minhaLista = new ArrayList<>();

        minhaLista.add(new Carro("Ford"));
        minhaLista.add(new Carro("Pegeout"));
        minhaLista.add(new Carro("VW"));

        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.contains(new Carro("VW")));
        System.out.println(minhaLista.indexOf(new Carro("Wb")));

        System.out.println(minhaLista.remove(1));
        System.out.println(minhaLista);
    }
}
