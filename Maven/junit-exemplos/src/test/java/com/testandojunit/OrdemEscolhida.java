package com.testandojunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdemEscolhida {
    
    @Order(4)
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
        System.out.println("Fluxo D executado");
    }

    @Order(3)
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
        System.out.println("Fluxo A executado");
    }

    @Order(2)
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
        System.out.println("Fluxo B executado");
    }

    @Order(1)
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
        System.out.println("Fluxo C executado");
    }

    
}
