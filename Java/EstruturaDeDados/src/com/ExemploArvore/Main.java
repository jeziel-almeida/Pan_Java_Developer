package com.ExemploArvore;

public class Main {
    public static void main(String[] args) {
        
        ArvoreBinaria<Integer> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(10);
        minhaArvore.inserir(20);
        minhaArvore.inserir(5);

        minhaArvore.exibirEmPreOrdem();
    }
}
