package com.ExemploListaCircular;

public class Main {
    public static void main(String[] args) {
        
        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("Lucas");
        System.out.println(minhaLista);

        minhaLista.remove(0);
        System.out.println(minhaLista);

        minhaLista.add("Igor");
        minhaLista.add("Tiago");
        minhaLista.add("Mateus");
        System.out.println(minhaLista);

        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(3));

        for(int i = 0; i < 15; i++) {
            System.out.println(minhaLista.get(i));
        }

    }
}
