package com.testandojunit;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionsTest {
    
    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = {-1, 2, 5, 10, 16};
        int[] segundoLancamento = {-1, 2, 5, 10, 16};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSePessoaEstaNulo() {

        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("João", LocalDate.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {

        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
