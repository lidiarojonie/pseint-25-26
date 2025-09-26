// Suma de 5 números insertados por el usuario con bucle REPETIR

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        // Teclado
        Scanner sc = new Scanner(System.in);

        // Variables
        int i = 0;
        int b = 0;

        // Bucle suma
        while (i < 5){
            System.out.println("Ingresa el valor que desee sumar: ");
            int a = sc.nextInt();
            b = b + a;
            i++;
        }
        System.out.println("El resultado es: " + b);
    }
}
