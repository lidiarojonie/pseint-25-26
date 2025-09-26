// Leer tres números y escribir el mayor

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Teclado
        Scanner sc = new Scanner(System.in);

        // Pedir los 3 números
        System.out.println("Introduzca los 3 números a comparar: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Comparar los numeros
        if  (a < b && c < b) {
            System.out.println(b);
        }
        else if (a < c && b < c) {
            System.out.println(c);
        }
        else if (b < a && c < a) {
            System.out.println(a);
        }
    }
}