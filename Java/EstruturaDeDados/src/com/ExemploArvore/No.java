package com.ExemploArvore;

public class No<T extends Comparable<T>> {
    
    private T conteudo;
    private No<T> noEsq = null;
    private No<T> noDir = null;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(No<T> noEsq) {
        this.noEsq = noEsq;
    }

    public No<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(No<T> noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

    
}
