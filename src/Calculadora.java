public class Calculadora {
    /** Método dividir
     @param num1 Primer número a dividir.
     @param num2 Segundo número a dividir.
     @return Devuelve la división de los números. */
    public double dividir(double num1, double num2){
        if(num2 == 0){
            return 0;
        } else{
            return num1 / num2;
        }
    }

    /** Método sumar
     @param num1 Primer número a sumar.
     @param num2 Segundo número a sumar.
     @return Devuelve la suma de los números. */
    public double sumar(double num1, double num2){
        return num1 + num2;
    }

    /** Método resta
     @param num1 Primer número a restar.
     @param num2 Segundo número a restar.
     @return Devuelve la resta de los números. */
    public double resta(double num1, double num2){
        return num1 - num2;
    }

    /** Método multiplicar
     @param num1 Primer número a multiplicar.
     @param num2 Segundo número a multiplicar.
     @return Devuelve la multiplicación de los números. */
    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }
}
