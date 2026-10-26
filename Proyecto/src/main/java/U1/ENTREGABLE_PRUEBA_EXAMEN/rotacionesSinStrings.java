package U1.ENTREGABLE_PRUEBA_EXAMEN;

import java.util.Scanner;

public class rotacionesSinStrings {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long numero;

        do {
            System.out.print("Introduzca un número entero positivo: ");
            numero = teclado.nextLong();
        } while (numero <= 0);

        System.out.print("Introduzca las posiciones a rotar: ");
        int rotacionesOriginales = teclado.nextInt();

        long original = numero;

// 1. Averiguar el número de dígitos
        long aux = numero;
        int numDigitos = 0;
        while (aux > 0) {
            aux = aux / 10;
            numDigitos++;
        }

// 2. Simplificar las rotaciones por si nos piden rotar más veces que dígitos tiene
        int rotacionesReales = rotacionesOriginales % numDigitos;

// 3. Calcular el divisor que nos permitirá extraer el dígito de la izquierda (ej: 100000 para un número de 6 cifras)
        long divisor = 1;
        for (int i = 0; i < numDigitos - 1; i++) {
            divisor = divisor * 10;
        }

// 4. Bucle para rotar matemáticamente las veces necesarias
        for (int i = 0; i < rotacionesReales; i++) {
            // Extraemos la parte izquierda (el primer dígito) y el resto del número
            long primerDigito = numero / divisor;
            long resto = numero % divisor;

            // Formamos el nuevo número
            numero = (resto * 10) + primerDigito;
        }

        System.out.println("El número " + original + " rotado " + rotacionesOriginales + " posiciones es " + numero);
    }
}
