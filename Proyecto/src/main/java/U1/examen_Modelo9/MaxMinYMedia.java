package U1.examen_Modelo9;

import java.util.Scanner;

public class MaxMinYMedia {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");

        int maximo = 0;
        int minimo = Integer.MAX_VALUE; // Le damos el valor más alto posible para que el primero lo sobreescriba
        double suma = 0;
        int cantidad = 0;

        while (true) {
            int numero = teclado.nextInt();

            // 1. Comprobar si es primo
            boolean esPrimo = true;
            if (numero < 2) {
                esPrimo = false;
            } else {
                for (int i = 2; i * i <= numero; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            // 2. Si es primo, salimos del bucle (no se tiene en cuenta)
            if (esPrimo) {
                break;
            }

            // 3. Si no es primo, actualizamos las estadísticas
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }

            suma += numero;
            cantidad++;
        }

// 4. Mostrar resultados (protegido por si el primero metido ya era primo)
        if (cantidad > 0) {
            System.out.println("\nHa introducido " + cantidad + " números no primos.");
            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + (suma / cantidad));
        } else {
            System.out.println("\nNo se ha introducido ningún número no primo.");
        }
    }
}
