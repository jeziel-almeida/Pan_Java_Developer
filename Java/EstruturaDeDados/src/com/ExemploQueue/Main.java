package com.ExemploQueue;

import java.util.LinkedList;
import java.util.Queue;

import com.EqualsEHashcode.Carro;

public class Main {
    public static void main(String[] args) {
        
        Queue<Carro> minhaFila = new LinkedList<>();

        minhaFila.add(new Carro("Ford"));
        minhaFila.add(new Carro("Fiat"));
        minhaFila.add(new Carro("VW"));

        System.out.println(minhaFila);
        System.out.println(minhaFila.peek());

        System.out.println(minhaFila.poll());
        System.out.println(minhaFila);
    }
}
