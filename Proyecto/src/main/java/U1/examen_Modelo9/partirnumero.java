package U1.examen_Modelo9;

import java.util.Scanner;

public class partirnumero {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = teclado.nextLong();

        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int posicion = teclado.nextInt();

// 1. Contar cuántos dígitos tiene el número
        long aux = numero;
        int numDigitos = 0;
        while (aux > 0) {
            aux = aux / 10;
            numDigitos++;
        }

// 2. Calcular cuántos dígitos se quedan en la parte derecha
        int digitosDerecha = numDigitos - posicion + 1;

// 3. Crear el divisor multiplicando por 10 (ej: si son 2 dígitos, el divisor será 100)
        long divisor = 1;
        for (int i = 0; i < digitosDerecha; i++) {
            divisor = divisor * 10;
        }

// 4. Calcular ambas partes matemáticamente
        long parte1 = numero / divisor;
        long parte2 = numero % divisor;

        System.out.println("Los números partidos son el " + parte1 + " y el " + parte2 + ".");
    }
}
