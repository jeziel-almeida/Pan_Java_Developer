package com.projetoNo;

/**
 * <h1>Nó</h1>
 * <p>Estrutura de dados: lista encadeada simples<p>
 * 
 * @author Jeziel Almeida
 * @version 1.0
 * @since 16/02/2023
 */
public class No<T> {

    private T conteudo;
    private No<T> proximo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximo = null;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public T getConteudo() {
        return this.conteudo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    public No<T> getProximo() {
        return this.proximo;
    }

    @Override
    public String toString() {
        return "[ Nó: "+this.conteudo+" ] ";
    }
}
