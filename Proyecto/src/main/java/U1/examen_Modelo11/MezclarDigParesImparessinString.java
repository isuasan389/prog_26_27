package U1.examen_Modelo11;

import java.util.Scanner;

public class MezclarDigParesImparessinString {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        long num1 = teclado.nextLong();

        System.out.print("Introduzca otro número: ");
        long num2 = teclado.nextLong();

// 1. Calculamos el divisor necesario para extraer de izquierda a derecha.
        long divisor = 1;
        long aux = num1;
        while (aux > 9) {
            aux = aux / 10;
            divisor = divisor * 10;
        }

        long pares = 0;
        long impares = 0;

// 2. Vamos sacando dígito a dígito
        while (divisor > 0) {

            // Extraemos el primer dígito disponible de cada número
            long digito1 = (num1 / divisor) % 10;
            long digito2 = (num2 / divisor) % 10;

            // Comprobamos el dígito del primer número
            if (digito1 % 2 == 0) {
                pares = (pares * 10) + digito1;
            } else {
                impares = (impares * 10) + digito1;
            }

            // Comprobamos el dígito del segundo número
            if (digito2 % 2 == 0) {
                pares = (pares * 10) + digito2;
            } else {
                impares = (impares * 10) + digito2;
            }

            // Reducimos el divisor para la siguiente vuelta
            divisor = divisor / 10;
        }

        System.out.println("El número formado por los dígitos pares es " + pares);
        System.out.println("El número formado por los dígitos impares es " + impares);
    }
}
