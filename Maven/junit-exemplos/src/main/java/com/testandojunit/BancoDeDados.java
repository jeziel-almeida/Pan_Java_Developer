package com.testandojunit;

import java.util.logging.Logger;

public class BancoDeDados {
    
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    
    public static void iniciarConexao() {
        // Fez algo
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao() {
        // Fez algo
        LOGGER.info("Finalizou conexão");
    }

    public static void inserirPessoa(Pessoa pessoa) {
        // Insere pessoa no banco de dados
        LOGGER.info("Inseriu pessoa no banco de dados");
    }
    
    public static void removerPessoa(Pessoa pessoa) {
        // Insere pessoa no banco de dados
        LOGGER.info("Removeu pessoa do banco de dados");
    }
}
