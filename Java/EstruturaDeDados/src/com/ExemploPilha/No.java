package com.ExemploPilha;

public class No {

    private int dado;
    private No refNo = null;

    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    public No getRefNo() {
        return refNo;
    }

    @Override
    public String toString() {
        return "No{" + "dado=" + dado + '}';
    }
}