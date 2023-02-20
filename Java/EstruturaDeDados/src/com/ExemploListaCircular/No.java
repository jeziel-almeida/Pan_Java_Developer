package com.ExemploListaCircular;

public class No<T> {
    
    private T conteudo;
    private No<T> refProximo = null;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getRefProximo() {
        return refProximo;
    }

    public void setRefProximo(No<T> refProximo) {
        this.refProximo = refProximo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

    
}
