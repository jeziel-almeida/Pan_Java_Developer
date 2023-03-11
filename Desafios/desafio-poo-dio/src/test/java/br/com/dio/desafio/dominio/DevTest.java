package br.com.dio.desafio.dominio;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DevTest {

    Curso curso = new Curso("Java-teste", "Descrição-teste", 8);
    Mentoria mentoria = new Mentoria("Java-mentoria-teste", "Descrição-teste", LocalDate.now());
    Bootcamp bootcamp = new Bootcamp("Java Developer-teste", "Descrição-teste");
    Dev dev = new Dev("Dev-teste");

    @Test
    void cursoDeveEstarEmUmBootcamp() {
        bootcamp.getConteudos().add(curso);
        dev.inscreverBootcamp(bootcamp);

        Assertions.assertTrue(bootcamp.getConteudos().contains(curso));
    }

    @Test
    void devDeveEstarEmUmBootcamp() {   
        bootcamp.getConteudos().add(curso);
        dev.inscreverBootcamp(bootcamp);

        Assertions.assertTrue(bootcamp.getDevsInscritos().contains(dev));
    }

    @Test
    void aoProgredirCursoDeveSerRemovidoDosInscritos() {
        bootcamp.getConteudos().add(curso);
        dev.inscreverBootcamp(bootcamp);

        dev.progredir();

        Assertions.assertFalse(dev.getConteudosInscritos().contains(curso));
    }

    @Test
    void aoProgredirCursoDeveSerAdicionadoAosConcluidos() {
        bootcamp.getConteudos().add(curso);
        dev.inscreverBootcamp(bootcamp);

        dev.progredir();

        Assertions.assertTrue(dev.getConteudosConcluidos().contains(curso));
    }

    @Test
    void totalXpDeveSer150() {
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);
        dev.inscreverBootcamp(bootcamp);

        dev.progredir();
        dev.progredir();

        Assertions.assertEquals(150, dev.calcularTotalXP());
    }
}
