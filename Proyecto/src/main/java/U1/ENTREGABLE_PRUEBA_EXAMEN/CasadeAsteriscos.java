package U1.ENTREGABLE_PRUEBA_EXAMEN;

import java.util.Scanner;

public class CasadeAsteriscos {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int h;

// 1. Pedir y validar la altura
        do {
            System.out.print("Introduzca la altura del tejado: ");
            h = teclado.nextInt();
            if (h < 3) {
                System.out.println("Error: la altura debe ser mayor o igual que 3.");
            }
        } while (h < 3);

        System.out.println(); // Salto de línea estético antes de dibujar

// 2. Pintar el tejado (Triángulo hueco)
        for (int i = 0; i < h; i++) {
            // Espacios por fuera del tejado
            for (int j = 0; j < h - 1 - i; j++) {
                System.out.print(" ");
            }

            if (i == 0) {
                // Cúspide del tejado (solo un asterisco)
                System.out.println("*");
            } else if (i == h - 1) {
                // Base del tejado: fila completa de asteriscos (2*h - 1)
                for (int j = 0; j < 2 * h - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                // Parte media del tejado: hueca
                System.out.print("*");
                // Espacios por dentro del tejado: 2*i - 1
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

// 3. Pintar el cuerpo de la casa (Rectángulo hueco de altura h)
        for (int i = 0; i < h; i++) {
            if (i == h - 1) {
                // Base de la casa: fila completa
                for (int j = 0; j < 2 * h - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                // Paredes laterales
                System.out.print("*");
                // Espacio interior de la casa: 2*h - 3
                for (int j = 0; j < 2 * h - 3; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
