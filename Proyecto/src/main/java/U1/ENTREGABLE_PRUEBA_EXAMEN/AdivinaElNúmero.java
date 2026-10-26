package U1.ENTREGABLE_PRUEBA_EXAMEN;

import java.util.Scanner;

public class AdivinaElNúmero {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
// Math.random() da un valor [0.0, 1.0). Multiplicado por 100 da [0.0, 99.99).
// Sumando 1 garantizamos que sea entre 1 y 100.
        int secreto = (int)(Math.random() * 100) + 1;

        System.out.println("He pensado un número entre 1 y 100. Tienes 7 intentos.");

        int intentoActual = 1;
        boolean acertado = false;

// Bucle mientras queden intentos y no haya acertado
        while (intentoActual <= 7 && !acertado) {
            System.out.print("Intento " + intentoActual + ": ");
            int numero = teclado.nextInt();

            // Validar el rango. Si no es válido, se repite el turno.
            if (numero < 1 || numero > 100) {
                System.out.println("Ese número no está entre 1 y 100. No cuenta como intento.");
                continue;
            }

            // Comprobar acierto
            if (numero == secreto) {
                acertado = true;
                System.out.println("¡Enhorabuena! Has acertado en " + intentoActual + " intentos.");
            } else {
                // Pista mayor/menor
                if (secreto > numero) {
                    System.out.print("El número es mayor. ");
                } else {
                    System.out.print("El número es menor. ");
                }

                // Pista de temperatura (usamos Math.abs para sacar el valor absoluto y ver la diferencia en positivo)
                int diferencia = Math.abs(secreto - numero);

                if (diferencia <= 5) {
                    System.out.println("¡Caliente!");
                } else if (diferencia <= 15) {
                    System.out.println("Templado");
                } else {
                    System.out.println("Frío");
                }

                intentoActual++;
            }
        }

// Si salimos del bucle y no hemos acertado, informamos del número
        if (!acertado) {
            System.out.println("Lo siento, has agotado tus intentos. El número era el " + secreto + ".");
        }
    }
}
