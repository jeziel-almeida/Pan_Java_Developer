package com.ExemploArvore;

public class ArvoreBinaria<T extends Comparable<T>> {
    
    private No<T> raiz = null;


    public void inserir(T conteudo) {

        No<T> novoNo = new No<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private No<T> inserir(No<T> atual, No<T> novoNo) {
        
        if(atual == null) {
            return novoNo;
        } else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }

        return atual;
    }

    public void exibirEmOrdem() {

        System.out.println("\n -- Exibindo em ordem --");
        exibirEmOrdem(raiz);
        System.out.println();
    }

    private void exibirEmOrdem(No<T> atual) {
        if(atual != null) {
            exibirEmOrdem(atual.getNoEsq());
            System.out.print("("+atual.getConteudo()+") ");
            exibirEmOrdem(atual.getNoDir());
        }
    }

    public void exibirEmPosOrdem() {

        System.out.println("\n -- Exibindo em pós ordem --");
        exibirEmPosOrdem(raiz);
        System.out.println();
    }

    private void exibirEmPosOrdem(No<T> atual) {
        if(atual != null) {
            exibirEmPosOrdem(atual.getNoEsq());
            exibirEmPosOrdem(atual.getNoDir());
            System.out.print("("+atual.getConteudo()+") ");
        }

    }

    public void exibirEmPreOrdem() {

        System.out.println("\n -- Exibindo em pré ordem --");
        exibirEmPreOrdem(raiz);
        System.out.println();
    }

    private void exibirEmPreOrdem(No<T> atual) {
        if(atual != null) {
            System.out.print("("+atual.getConteudo()+") ");
            exibirEmPreOrdem(atual.getNoEsq());
            exibirEmPreOrdem(atual.getNoDir());
        }

    }
}
