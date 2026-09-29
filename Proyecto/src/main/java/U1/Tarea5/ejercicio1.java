package U1.Tarea5;

import java.util.Scanner;

public class ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero:");
        int numeroEntero = teclado.nextInt();

        if (numeroEntero > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

    }
}
