package com.iesebre.library20242025;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CadenaTest {

    @Test
    void retornaCaracter_generatesCharacterWithinRange() {
        char result = Cadena.retornaCaracter();
        assertTrue(result >= ' ' && result <= '}');
    }

    @Test
    void retornaCaracter_withinSpecifiedRange() {
        char result = Cadena.retornaCaracter('a', 'z');
        assertTrue(result >= 'a' && result <= 'z');
    }

    @Test
    void retornaCaracter_withMinGreaterThanMax() {
        char result = Cadena.retornaCaracter('z', 'a');
        assertTrue(result >= 'a' && result <= 'z');
    }

    @Test
    void retornaCaracter_withSameMinAndMax() {
        char result = Cadena.retornaCaracter('a', 'a');
        assertEquals('a', result);
    }

    @Test
    void retornaCaracter_withSpecialCharacters() {
        char result = Cadena.retornaCaracter('!', '/');
        assertTrue(result >= '!' && result <= '/');
    }
}