package com.ExemploListaEncadeada;

public class Main {
    public static void main(String[] args) {
        
        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        System.out.println("\nMétodo size() Must be 0: "+minhaLista.size());

        minhaLista.add("João");
        minhaLista.add("Luíza");
        minhaLista.add("Fernando");
        minhaLista.add("Tiago");

        System.out.println("\n"+minhaLista.toString()+"\n");

        System.out.println("Método get(0) Must be João: "+minhaLista.get(0));
        System.out.println("Método get(2) Must be Fernando: "+minhaLista.get(2));
        System.out.println("Método remove(1) Must be Luíza: "+minhaLista.remove(1));

        
        System.out.println();  
        System.out.println(minhaLista.toString());
        System.out.println("Método size() Must be 3: "+minhaLista.size()+"\n");
    }
}
