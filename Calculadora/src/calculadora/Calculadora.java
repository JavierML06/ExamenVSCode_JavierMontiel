package calculadora;

import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int resultado;
        System.out.println("Calculadora");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.print("Ingrese la opción: ");
        int opcion = scanner.nextInt();
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("La resta es: " + resultado);
                break;
            default:
                System.out.println("Opción inválida");
        }
        scanner.close();
    }
}
