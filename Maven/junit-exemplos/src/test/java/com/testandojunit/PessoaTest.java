package com.testandojunit;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa pessoa = new Pessoa("Júlia", LocalDate.of(2000, 1, 1));

        Assertions.assertEquals(23, pessoa.getIdade());
    }

    @Test 
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Júlia", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDate.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
