package com.ExemploMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Jeziel");
        aluno.put("Turma", "A");
        aluno.put("Série", "5");
        aluno.put("Nota", "10");

        System.out.println();
        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> minhaLista = new ArrayList<>();

        minhaLista.add(aluno);

        System.out.println("\n"+minhaLista);
        System.out.println(aluno.containsKey("Série"));
    }
}