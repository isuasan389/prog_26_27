package U1.examen_Modelo10;

import java.util.Scanner;

public class contDigPareseImpares {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = teclado.nextLong();

        long aux = numero;
        int pares = 0;
        int impares = 0;

// Caso especial por si el usuario introduce un 0
        if (aux == 0) {
            pares = 1;
        } else {
            // Vamos extrayendo los números de derecha a izquierda
            while (aux > 0) {
                long digito = aux % 10;

                if (digito % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                aux = aux / 10; // Quitamos el último dígito
            }
        }

        System.out.println("El " + numero + " contiene " + pares + " dígitos pares y " + impares + " dígitos impares.");
    }
}
