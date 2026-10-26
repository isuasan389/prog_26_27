package U1.examen_Modelo8;

import java.util.Scanner;

public class mezclarNumeros {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        long num1 = teclado.nextLong();

        System.out.print("Introduzca otro número: ");
        long num2 = teclado.nextLong();

// 1. Calculamos el divisor necesario para extraer los números de izquierda a derecha.
// Por ejemplo, si el número es 9402, el divisor terminará siendo 1000.
        long divisor = 1;
        long aux = num1;
        while (aux > 9) {
            aux = aux / 10;
            divisor = divisor * 10;
        }

        long pares = 0;
        long impares = 0;

// 2. Bucle para ir sacando dígito a dígito mientras el divisor sea mayor que 0
        while (divisor > 0) {

            // 3. Extraemos el dígito más a la izquierda de cada número.
            // Ej: (9402 / 1000) % 10 = 9 % 10 = 9
            long digito1 = (num1 / divisor) % 10;
            long digito2 = (num2 / divisor) % 10;

            // 4. Comprobamos el dígito del primer número
            if (digito1 % 2 == 0) {
                // Para añadir un dígito al final, multiplicamos lo que teníamos por 10 y sumamos
                pares = (pares * 10) + digito1;
            } else {
                impares = (impares * 10) + digito1;
            }

            // 5. Comprobamos el dígito del segundo número
            if (digito2 % 2 == 0) {
                pares = (pares * 10) + digito2;
            } else {
                impares = (impares * 10) + digito2;
            }

            // 6. Dividimos el divisor entre 10 para en la siguiente vuelta sacar el siguiente dígito
            // Ej: Pasamos de 1000 a 100
            divisor = divisor / 10;
        }

        System.out.println("El número formado por los dígitos pares es " + pares);
        System.out.println("El número formado por los dígitos impares es " + impares);
    }
}
