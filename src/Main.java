import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Importamos la clase Scanner.
        Calculadora calcular = new Calculadora(); // Creamos un objeto de tipo calculadora.
        double num1 = 0;
        double num2 = 0;

        int opcion; // Creamos una variable de tipo entero llamada opción, que nos servirá más adelante para introducir los parámetros de nuestro menú.
        do{
            System.out.println("Menu calculadora:");
            System.out.println("1. - Sumar");
            System.out.println("2. - Restar");
            System.out.println("3. - Multiplicar");
            System.out.println("4. - Dividir");
            System.out.println("0. - Salir");
            System.out.println("Introduce una opcion: ");
            opcion = sc.nextInt();

            switch (opcion){ // Creamos un caso para las diferentes opciones.
                case 1:
                    // CASO 1: Ejecuta el método sumar.
                    System.out.print("Introduce el primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo numero: ");
                    num2 = sc.nextDouble();
                    System.out.println(calcular.sumar(num1, num2));
                    break;
                case 2:
                    // CASO 1: Ejecuta el método restar.
                    System.out.print("Introduce el primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo numero: ");
                    num2 = sc.nextDouble();
                    System.out.println(calcular.resta(num1, num2));
                    break;
                case 3:
                    // CASO 1: Ejecuta el método multiplicar.
                    System.out.print("Introduce el primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo numero: ");
                    num2 = sc.nextDouble();
                    System.out.println(calcular.multiplicar(num1, num2));
                    break;
                case 4:
                    // CASO 1: Ejecuta el método dividir.
                    System.out.print("Introduce el primer numero");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.println(calcular.dividir(num1, num2));
                    break;
                case 0:
                    // CASO 0: Sale del programa.
                    System.out.println("Cierras el programa");
                    break;
            }
        } while(opcion != 0);  // El bucle se ejecuta hasta que la opción sea igual a 0.
    }
}