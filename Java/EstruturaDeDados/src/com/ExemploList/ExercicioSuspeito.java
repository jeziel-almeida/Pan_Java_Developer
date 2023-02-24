package com.ExemploList;

import java.util.*;

/*
* Utilizando listas, faça um programa que faça 5 perguntas para uma 
* pessoa sobre um crime. As perguntas são:
* 1. "Telefonou para a vítima?"
* 2. "Esteve no local do crime?"
* 3. "Mora perto da vítima?"
* 4. "Devia para a vítima?"
* 5. "Já trabalhou com a vítima?"
* Se a pessoa responder positivamente a 2 questões ela deve ser classificada
* como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso
* contrário, ela será classificado como "Inocente".
*/
public class ExercicioSuspeito {
    public static void main(String[] args) {
        
        List<String> perguntas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String[] respostas = new String[5];
        
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");
        
        System.out.println("Responda sim ou não para cada pergunta!");
        
        for(int i = 0; i < 5; i++) {
            System.out.println(perguntas[0]);
            respostas[i] = scanner.next();
        }
        
        int qtdSim = 0;
        
        for(int i = 0; i < 5; i++ {
            if(respostas[i] == "sim") {
                qtdSim++;
            }
        }
            
        System.out.println("--- Resultado ---");
        
        switch(qtdSim) {
            case 1:
                System.out.println("Inocente");
            case 2:
                System.out.println("Suspeita");
            case 3, 4:
                System.out.println("Cúmplice");
            case 5:
                System.out.println("Assassina");
        }
    }
}
