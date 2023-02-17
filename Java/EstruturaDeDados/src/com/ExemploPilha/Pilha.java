package com.ExemploPilha;

public class Pilha {
    
    private No noRefEntradaPilha;

    public Pilha() {
        this.noRefEntradaPilha = null;
    }

    public No top() {
        return noRefEntradaPilha;
    }

    public void push(No novoNo) {
        No noAuxiliar = noRefEntradaPilha;
        noRefEntradaPilha = novoNo;
        noRefEntradaPilha.setRefNo(noAuxiliar);
    }

    public No pop() {
        if(!this.isEmpty()) {
            No noPopado = noRefEntradaPilha;
            noRefEntradaPilha = noRefEntradaPilha.getRefNo();
            return noPopado;
        }
        return null;
    }

    public boolean isEmpty() {
        return noRefEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "----------------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "----------------------\n";

        No noAuxiliar = noRefEntradaPilha;

        while(true) {
            if(noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "======================\n";
        return stringRetorno;
    }
}
