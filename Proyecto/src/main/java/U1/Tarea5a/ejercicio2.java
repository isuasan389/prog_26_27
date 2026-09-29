package U1.Tarea5a;

import java.util.Scanner;

public class ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el numero 12:");
        int numero = teclado.nextInt();

        if (numero == 12) {
            System.out.println("El ejercicio esta correcto");
        } else {
            System.out.println("El ejercicio no esta correctamente hecho");


        }
    }
}
