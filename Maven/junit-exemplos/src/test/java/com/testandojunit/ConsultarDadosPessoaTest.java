package com.testandojunit;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosPessoaTest {
    
    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.inserirPessoa(new Pessoa("João", LocalDate.of(2020, 12, 10)));
    }

    @AfterEach
    void removeDadosParaTeste() {
        BancoDeDados.removerPessoa(new Pessoa("João", LocalDate.of(2020, 12, 10)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
        System.out.println("Fez teste de validar dados.");
    }
    
    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertTrue(true);
        System.out.println("Fez teste de validar dados novamente.");
    }

    @AfterAll
    static void finalizaConexao() {
        BancoDeDados.finalizarConexao();
    }
}
