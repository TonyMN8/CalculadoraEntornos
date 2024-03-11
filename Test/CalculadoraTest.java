import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(3.0, calculadora.dividir(30.0, 10.0));
    }

    @Test
    public void testDividirConNegativos() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.dividir(-10.0, -5.0));
    }

    @Test
    public void testDividirConTres() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1.0, calculadora.dividir(3.3, 3.3));
    }

}