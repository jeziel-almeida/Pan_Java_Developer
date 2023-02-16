package com.projetoNo;

public class Main {
    public static void main(String[] args) {
        
        No<String> no1 = new No<>("Jeziel");
        No<String> no2 = new No<>("Luíza");
        no1.setProximo(no2);

        No<String> no3 = new No<>("Felipe");
        no2.setProximo(no3);

        No<String> no4 = new No<>("Caio");
        no3.setProximo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximo());
        System.out.println(no1.getProximo().getProximo());
        System.out.println(no1.getProximo().getProximo().getProximo());
        System.out.println(no1.getProximo().getProximo().getProximo().getProximo());
    }
}
