import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la edad al usuario
        System.out.print("Introduzca su edad: ");
        int edad = sc.nextInt(); // Lee edad

        //Comprobar si es mayor de edad
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("NO es mayor de edad");
        }
    }
}