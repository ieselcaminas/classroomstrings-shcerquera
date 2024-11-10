package test;

import main.Palindromo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromoTest {

    @Test
    void comprobarCorrecto() {
        assertTrue(Palindromo.esPalindromo("Reconocer"));
    }

    @Test
    void comprobarIncorrecto() {
        assertFalse(Palindromo.esPalindromo("Camioneta"));
    }

}
