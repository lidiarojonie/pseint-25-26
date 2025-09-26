// Leer dos números y escribir el mayor

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Teclado
        Scanner sc = new Scanner(System.in);

        // Pedir los 2 números
        System.out.println("Introduzca los 2 números a comparar: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Comparar los numeros
        if  (a < b) {
            System.out.println(b);
        }
        else if (a == b) {
            System.out.println("Ambos numeros son iguales");
        }
        else {
            System.out.println(a);
        }
    }
}
