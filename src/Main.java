import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
                    System.out.println("Seleccionas la opcion 2");
                    break;
                case 2:
                    System.out.println("Seleccionas la opcion 2");
                    break;
                case 3:
                    System.out.println("Seleccionas la opcion 3");
                    break;
                case 4:
                    System.out.println("Seleccionas la opción 4");
                    break;
                case 0:
                    System.out.println("Cierras el programa");
                    break;
            }

        } while(opcion != 0);
    }
}