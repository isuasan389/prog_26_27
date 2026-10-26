package U1.examen_Modelo11;

import java.util.Scanner;

public class cincoConsecutivosYprimos {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numero = teclado.nextInt();

// Bucle para dar 5 vueltas empezando en el número introducido
        for (int i = numero; i < numero + 5; i++) {

            // Lógica para comprobar si 'i' es primo
            boolean esPrimo = true;
            if (i < 2) {
                esPrimo = false;
            } else {
                // Solo comprobamos hasta la raíz cuadrada para optimizar
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.println(i + " es primo");
            } else {
                System.out.println(i + " no es primo");
            }
        }
    }
}
