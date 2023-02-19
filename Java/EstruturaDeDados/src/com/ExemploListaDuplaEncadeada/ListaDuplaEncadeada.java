package com.ExemploListaDuplaEncadeada;

public class ListaDuplaEncadeada<T> {
    
    private No<T> primeiroNo = null;
    private No<T> ultimoNo = null;

    private int tamanhoLista;

    public ListaDuplaEncadeada() {
        this.tamanhoLista = 0;
    }

    private No<T> getNo(int index) {
        No<T> noAuxiliar = primeiroNo;

        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        novoNo.setNoPrevio(ultimoNo);

        if(primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if(ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }

        ultimoNo = novoNo;
        tamanhoLista++;

    }

    public void add(T conteudo, int index) {
        No<T> noAtual = getNo(index);
        No<T> novoNo = new No<>(conteudo);
        novoNo.setNoProximo(noAtual);

        if(novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAtual.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        tamanhoLista++;
        
    }

    public void remove(int index) {

        if(index == 0) {
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null) {
                primeiroNo.setNoPrevio(null);
            }

        } else {
            No<T> noAtual = getNo(index);
            noAtual.getNoPrevio().setNoProximo(noAtual.getNoProximo());
            if(noAtual != ultimoNo) {
                noAtual.getNoProximo().setNoPrevio(noAtual.getNoPrevio());
            } else {
                ultimoNo = noAtual.getNoPrevio();
            }
        }

        this.tamanhoLista--;
    }

    public int size() {
        return tamanhoLista;
    }

    public boolean isEmpty() {
        return primeiroNo == null ? true : false;
    }

    @Override
    public String toString() {
        String str = "Lista -> ";
        
        No<T> noAuxiliar = primeiroNo;

        for (int i = 0; i < this.size(); i++) {
            
            str += "No{conteudo=" + noAuxiliar.getConteudo() +"} -> ";

            noAuxiliar = noAuxiliar.getNoProximo();
        }

        str += "null";

        return str;
    }
}
