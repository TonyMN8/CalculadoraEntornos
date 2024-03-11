import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void testsuma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(30.0, calculadora.sumar(10.0, 20.0));
    }

    @Test
    public void testNegativo() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-10.0, calculadora.sumar(-5.0, -5.0));
    }

    @Test
    public void testSumaConTres() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6.6, calculadora.sumar(3.3, 3.3));
    }

}