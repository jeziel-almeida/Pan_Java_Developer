package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Curso Java", "Descrição do curso", 8);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Descrição da mentoria", LocalDate.of(2022, 10, 8));

        System.out.println();

        Bootcamp bootcamp = new Bootcamp("Java Developer", "Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev("Jeziel Almeida");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + dev.getNome() + ": " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos concluídos de " + dev.getNome() + ": " + dev.getConteudosConcluidos());
        System.out.println("Total de XP: " + dev.calcularTotalXP());

    }
}
