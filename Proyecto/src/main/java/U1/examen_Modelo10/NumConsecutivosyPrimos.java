package U1.examen_Modelo10;

import java.util.Scanner;

public class NumConsecutivosyPrimos {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numero = teclado.nextInt();

// Hacemos un bucle que empiece en el número y dé 5 vueltas
        for (int i = numero; i < numero + 5; i++) {

            // Algoritmo de comprobación de número primo
            boolean esPrimo = true;
            if (i < 2) {
                esPrimo = false;
            } else {
                // Comprobamos hasta la raíz cuadrada para optimizar
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break; // Si encontramos un divisor, ya no es primo
                    }
                }
            }

            // Imprimimos el resultado
            if (esPrimo) {
                System.out.println(i + " es primo");
            } else {
                System.out.println(i + " no es primo");
            }
        }
    }
}
