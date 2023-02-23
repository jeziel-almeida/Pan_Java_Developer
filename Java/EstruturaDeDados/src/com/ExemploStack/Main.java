package com.ExemploStack;

import java.util.Stack;

import com.EqualsEHashcode.Carro;

public class Main {
    public static void main(String[] args) {
        
        Stack<Carro> minhaPilha = new Stack<>();

        minhaPilha.push(new Carro("Ford"));
        minhaPilha.push(new Carro("Chevrolet"));
        minhaPilha.push(new Carro("Fiat"));

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.peek());
    }
}
