public class Calculadora {
    public double dividir(double num1, double num2){
        if(num2 == 0){
            return 0;
        } else{
            return num1 / num2;
        }

    }

    public double sumar(double num1, double num2){
        return num1 + num2;
    }
    public double resta(double num1, double num2){
        return num1 - num2;
    }
    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }
}
