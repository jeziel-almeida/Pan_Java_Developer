package com.testandojunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class OrdemAleatoria {
    
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
        System.out.println("Fluxo D executado");
    }

    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
        System.out.println("Fluxo A executado");
    }

    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
        System.out.println("Fluxo B executado");
    }

    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
        System.out.println("Fluxo C executado");
    }
}
