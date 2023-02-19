package com.ExemploListaDuplaEncadeada;

public class Main {
    public static void main(String[] args) {
        
        ListaDuplaEncadeada<String> minhaLista = new ListaDuplaEncadeada<>();

        minhaLista.add("primeiro");
        minhaLista.add("terceiro");
        minhaLista.add("quarto");
        minhaLista.add("quinto");

        minhaLista.add("segundo", 1);

        minhaLista.remove(4);

        System.out.println(minhaLista.toString());
        
    }
}
