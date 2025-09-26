// Suma de 5 números insertados por el usuario con bucle FOR

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Teclado
        Scanner sc = new Scanner(System.in);
        int b = 0;

        // Bucle suma
        for (int i = 0; i < 5; i++){
            System.out.print("Ingresa el numero que quiera sumar: ");
            int a = sc.nextInt();
            b = b + a;
        }
        System.out.println("El resultado es: " + b);
    }
}
