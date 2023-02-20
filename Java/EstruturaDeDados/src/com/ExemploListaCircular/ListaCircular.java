package com.ExemploListaCircular;

public class ListaCircular<T> {
    
    private No<T> cabeca = null;
    private No<T> cauda = null;
    private int tamanhoLista = 0;

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if(isEmpty()) {
            cabeca = novoNo;
            cauda = cabeca;
            cabeca.setRefProximo(cauda);
        } else {
            novoNo.setRefProximo(cauda);
            cabeca.setRefProximo(novoNo);
            cauda = novoNo;
        }

        this.tamanhoLista++;
    }

    private No<T> getNo(int index) {

        if(this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia!");
        }

        if(index == 0) {
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;

        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getRefProximo();
        }

        return noAuxiliar;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void remove(int index) {
        if(index >= tamanhoLista) {
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista!");
        }

        if(index == 0) {
            cauda = cauda.getRefProximo();
            cabeca.setRefProximo(cauda);
        } else if(index == 1) {
            cauda.setRefProximo(cauda.getRefProximo().getRefProximo());
        } else {
            No<T> noAuxiliar = cauda;
            for(int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getRefProximo();
            }
            noAuxiliar.setRefProximo(noAuxiliar.getRefProximo().getRefProximo());
        }

        tamanhoLista--;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size() {
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String str = "Lista -> ";
        
        No<T> noAuxiliar = cauda;

        for (int i = 0; i < this.size(); i++) {
            
            str += "No{conteudo=" + noAuxiliar.getConteudo() +"} -> ";

            noAuxiliar = noAuxiliar.getRefProximo();
        }

        str += isEmpty() == false ? "(retorna ao início)" : "[]";

        return str;
    }
}
