// Divisores de un número positivo

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        //Teclado
        Scanner sc = new Scanner(System.in);

        // Variables
        System.out.println("Introduzca el numero: ");
        int num = sc.nextInt();

        // Positivo y Calcular divisores
        if (num > 0){
            for (int i = 1; i <= num; i++){
                if (num % i == 0){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("No ha introducido un numero válido");
        }
    }
}
