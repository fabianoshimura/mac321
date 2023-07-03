/* Testes automatizados para classe Calculadora usando JUnit 5
 * Baseado no exemplo da documentação
 * em https://junit.org/junit5/docs/current/user-guide/#writing-tests
 */

import java.lang.Math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.DisplayName;

class TestaCalculadoraComJUnit {

    private final Calculadora calc = new Calculadora();

    @Test
    @DisplayName("Testa soma de inteiros positivos")
    void somaDeInteirosPositivos() {
        assertEquals(7, calc.soma(3,4));
        assertEquals(7, calc.soma(4,3));
        assertTrue(calc.soma(0,0) >= 0);
    }

    @ParameterizedTest
    @CsvSource({
        "3,         4,          7",
        "-3,        -4,         -7",
        "1,         -1,         0",
        "1,         0,          1"
    })
    void somaDeInteiros(double op1, double op2, double res) {
        assertEquals(res, calc.soma(op1,op2));
        assertEquals(res, calc.soma(op2,op1));
    }

    @Disabled("Desativado até que comparação seja feita corretamente")
    @Test
    @DisplayName("Testa soma de reais decimais de forma exata")
    void somaDeDecimaisExata() {
        assertEquals(0.3, calc.soma(0.1,0.2));
        assertEquals(0.3, calc.soma(0.2,0.1));
    }

    @Test
    @DisplayName("Testa soma de reais decimais de forma aproximada")
    void somaDeDecimaisAproximada() {
        assertEquals(0.1+0.2, calc.soma(0.1,0.2));
        assertTrue(Math.abs(0.3-calc.soma(0.2,0.1)) < 1E-16);
    }
}
