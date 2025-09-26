// Pedir al usuario un número N y sumar valores desde teclado hasta el valor n insertado por el usuario.

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        // Teclado
        Scanner sc = new Scanner(System.in);

        // Pedir y almacenar el numero
        System.out.println("Introduzca cuantos numeros desea sumar: ");
        int num1 = sc.nextInt();
        int total = 0;

        // Sumar los números
        while (num1 > 0){
            total += num1;
            num1--;
        }
        System.out.println("El resultado es: " + total);
    }
}
