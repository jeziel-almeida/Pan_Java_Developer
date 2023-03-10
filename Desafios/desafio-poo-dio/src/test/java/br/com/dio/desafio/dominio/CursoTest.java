package br.com.dio.desafio.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CursoTest {

    @Test
    void calcularXpDeveRetornar80() {
        Curso curso = new Curso("Nome", "Descrição", 8);
        Assertions.assertEquals(80, curso.calcularXP());
    }
}
