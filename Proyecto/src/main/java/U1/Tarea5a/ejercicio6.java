package U1.Tarea5a;

import java.util.Scanner;

public class ejercicio6 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        final double GRAVEDAD = 9.8;

        System.out.print("Introduce el tiempo: ");
        double tiempo = teclado.nextDouble();

        if (tiempo <= 0) {
            System.out.println("Tiempo Incorrecto");

        } else {
            double velocidad = GRAVEDAD * tiempo;
            System.out.println("La velocidad es: " + velocidad);
        }
    }
}
