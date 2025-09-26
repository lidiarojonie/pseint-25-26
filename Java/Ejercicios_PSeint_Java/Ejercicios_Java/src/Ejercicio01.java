// Media de tres números

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(){
        // Teclado
        Scanner sc = new Scanner(System.in);

        // Pedir los 3 números
        System.out.print("Introduce los 3 números: ");
        int a = sc.nextInt(); // Lee un número entero
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Hacer la media

        System.out.println((a + b + c) / 3);
    }
}
