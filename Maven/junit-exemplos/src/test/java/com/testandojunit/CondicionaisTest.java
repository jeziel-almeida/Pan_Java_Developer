package com.testandojunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.condition.JRE.JAVA_8;
import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisTest {
    
    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    void validarAlgo() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "codespace")
    void validarAlgo2() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnJre(JAVA_8)
    void validarAlgo3() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
    void validarAlgo4() {
        Assertions.assertEquals(10, 5+5);
    }
}
