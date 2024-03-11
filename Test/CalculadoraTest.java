import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora();
        assertEquals(20.0, calculadora.resta(30.0, 10.0));
    }

    @Test
    public void testRestaNegativo() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-5, calculadora.resta(10.0, -15.0));
    }

    @Test
    public void testRestaConTres() {
        Calculadora calculadora = new Calculadora();
        assertEquals(0.0, calculadora.resta(3.3, 3.3));
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calculadora = new Calculadora();
        assertEquals(50.0, calculadora.multiplicar(5.0, 10.0));
    }

    @Test
    public void testMultiplicarConNegativos() {
        Calculadora calculadora = new Calculadora();
        assertEquals(20.0, calculadora.multiplicar(-20.0, -1.0));
    }

    @Test
    public void testMultiplicarConTres() {
        Calculadora calculadora = new Calculadora();
        assertEquals(10.89, calculadora.multiplicar(3.3, 3.3));
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