import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**  Método Restar
     * Esperamos el resultado: 20.
      **/
    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora();
        assertEquals(20.0, calculadora.resta(30.0, 10.0));
    }
    /**  Método restar con negativo
     * Esperamos el resultado: -5.
     **/
    @Test
    public void testRestaNegativo() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-5, calculadora.resta(10.0, -15.0));
    }
    /**  Método restar con tres
     * Esperamos el resultado: 0.
     **/
    @Test
    public void testRestaConTres() {
        Calculadora calculadora = new Calculadora();
        assertEquals(0.0, calculadora.resta(3.3, 3.3));
    }
    /**  Método multiplicación
     * Esperamos el resultado: 50.
     **/
    @Test
    public void testMultiplicacion() {
        Calculadora calculadora = new Calculadora();
        assertEquals(50.0, calculadora.multiplicar(5.0, 10.0));
    }
    /**  Método multiplicación con negativos
     * Esperamos el resultado: 20.
     **/
    @Test
    public void testMultiplicarConNegativos() {
        Calculadora calculadora = new Calculadora();
        assertEquals(20.0, calculadora.multiplicar(-20.0, -1.0));
    }
    /**  Método multiplicación con tres
     * Esperamos el resultado: 10.89.
     **/
    @Test
    public void testMultiplicarConTres() {
        Calculadora calculadora = new Calculadora();
        assertEquals(10.89, calculadora.multiplicar(3.3, 3.3));
    }
    /**  Método suma
     * Esperamos el resultado: 30.
     **/
    @Test
    public void testsuma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(30.0, calculadora.sumar(10.0, 20.0));
    }
    /**  Método suma con negativo
     * Esperamos el resultado: -10.
     **/
    @Test
    public void testNegativo() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-10.0, calculadora.sumar(-5.0, -5.0));
    }
    /**  Método suma con tres numeros
     * Esperamos el resultado: 6.6.
     **/
    @Test
    public void testSumaConTres() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6.6, calculadora.sumar(3.3, 3.3));
    }
    /**  Método test dividir
     * Esperamos el resultado: 3.0.
     **/
    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(3.0, calculadora.dividir(30.0, 10.0));
    }
    /**  Método test dividir con negativos
     * Esperamos el resultado: 2.0.
     **/
    @Test
    public void testDividirConNegativos() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.dividir(-10.0, -5.0));
    }
    /**  Método test dividir con tres
     * Esperamos el resultado: 1.0.
     **/
    @Test
    public void testDividirConTres() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1.0, calculadora.dividir(3.3, 3.3));
    }

}