package com.testandojunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    
    @Test
    void metodoDeTransferenciaDeveLancarExcecao() {

        Conta contaOrigem = new Conta(1, 0);
        Conta contaDestino = new Conta(2, 50);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            transferenciaEntreContas.transfere(contaOrigem, contaDestino, 0);
        });

    }

    @Test
    void metodoDeTransferenciaNaoDeveLancarExcecao() {

        Conta contaOrigem = new Conta(1, 0);
        Conta contaDestino = new Conta(2, 50);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 1));

    }
}
