package com.ExemploFila;

public class Fila<T> {
    
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    public void enqueue(T object) {
        No<T> novoNo = new No<T>(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first() {
        if(!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            while(true) {
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue() {
        if(!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while(true) {
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "----------------------\n";
        stringRetorno += "      Fila\n";
        stringRetorno += "----------------------\n";

        No<T> noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null) {
            while(true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]\n";
                if(noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    break;
                }
            }
        } else {
            stringRetorno += "null\n";
        }

        stringRetorno += "======================\n";
        return stringRetorno;
    }
}
