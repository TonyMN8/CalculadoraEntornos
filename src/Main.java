import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calcular = new Calculadora();
        double num1 = 0;
        double num2 = 0;

        int opcion;
        do{
            System.out.println("Menu calculadora:");
            System.out.println("1. - Sumar");
            System.out.println("2. - Restar");
            System.out.println("3. - Multiplicar");
            System.out.println("4. - Dividir");
            System.out.println("0. - Salir");
            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Introduce el primer numero");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.print(calcular.sumar(num1, num2));
                    break;
                case 2:
                    System.out.print("Introduce el primer numero");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.print(calcular.resta(num1, num2));
                    break;
                case 3:
                    System.out.print("Introduce el primer numero");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.print(calcular.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.print("Introduce el primer numero");
                    num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.print(calcular.dividir(num1, num2));
                    break;
                case 0:
                    System.out.println("Cierras el programa");
                    break;
            }

        } while(opcion != 0);
    }
}