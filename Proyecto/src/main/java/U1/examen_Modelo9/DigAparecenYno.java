package U1.examen_Modelo9;

import java.util.Scanner;

public class DigAparecenYno {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        long numero = teclado.nextLong();

        String aparecen = "";
        String noAparecen = "";

// Comprobamos dígito a dígito del 0 al 9
        for (int d = 0; d <= 9; d++) {
            boolean encontrado = false;
            long aux = numero;

            // Si el usuario mete un 0 directamente
            if (numero == 0 && d == 0) {
                encontrado = true;
            }

            // Desmontamos el número para buscar el dígito 'd'
            while (aux > 0) {
                long digito = aux % 10;
                if (digito == d) {
                    encontrado = true;
                    break; // Si lo encontramos, dejamos de buscar en este número
                }
                aux = aux / 10;
            }

            // Lo guardamos en su variable correspondiente
            if (encontrado) {
                aparecen += d + " ";
            } else {
                noAparecen += d + " ";
            }
        }

        System.out.println("Dígitos que aparecen en el número: " + aparecen);
        System.out.println("Dígitos que no aparecen: " + noAparecen);
    }
}
