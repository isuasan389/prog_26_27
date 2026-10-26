package U1.examen_Modelo11;

import java.util.Scanner;

public class PirámideNumeros {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número n: ");
        int n = teclado.nextInt();

// Bucle principal para las filas (de 1 a n)
        for (int i = 1; i <= n; i++) {

            // 1. Imprimir espacios (n - i espacios)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 2. Imprimir números ascendentes (de 1 hasta i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // 3. Imprimir números descendentes (desde i-1 hasta 1)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Salto de línea para la siguiente fila
            System.out.println();
        }
    }
}
