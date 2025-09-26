// Factorial

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Teclado
        Scanner sc = new Scanner(System.in);

        // Pedir numero e inicializar variables
        System.out.println("Introduzca el número que desee: ");
        int total = 1;
        int numero = sc.nextInt();

        if (numero > 0){
            while (numero > 0) {
                total = total * numero;
                numero--;
            }
        }
        else if (numero == 0) {
            System.out.println("El resultado es: 1");
        }
        System.out.println("El resultado es: " + total);
    }
}
