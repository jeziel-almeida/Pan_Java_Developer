package com.ExemploSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        Set<Carro> meuConjunto = new HashSet<>();

        meuConjunto.add(new Carro("Fiat"));
        meuConjunto.add(new Carro("VW"));
        meuConjunto.add(new Carro("Toyota"));
        meuConjunto.add(new Carro("Renault"));
        meuConjunto.add(new Carro("Hyundai"));
        meuConjunto.add(new Carro("Honda"));

        System.out.println(meuConjunto);

        Set<Carro> meuConjunto2 = new TreeSet<>();

        meuConjunto2.add(new Carro("Fiat"));
        meuConjunto2.add(new Carro("VW"));
        meuConjunto2.add(new Carro("Toyota"));
        meuConjunto2.add(new Carro("Renault"));
        meuConjunto2.add(new Carro("Hyundai"));
        meuConjunto2.add(new Carro("Honda"));

        for (Carro carro : meuConjunto2) {
            System.out.println(carro.getMarca());
        }
    }
}
