package br.com.dio.desafio.dominio;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MentoriaTest {
    
    @Test
    void calcularXpDeveRetornar70() {
        Mentoria mentoria = new Mentoria("MentoriaTest", "DescriçãoTest", LocalDate.now());
        Assertions.assertEquals(70, mentoria.calcularXP()); 
    }
}
