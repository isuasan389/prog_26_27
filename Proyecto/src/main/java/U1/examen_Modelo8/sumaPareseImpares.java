package U1.examen_Modelo8;

import java.util.Scanner;

public class sumaPareseImpares {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = teclado.nextLong();

// 1. Calculamos el divisor para extraer los dígitos de izquierda a derecha
        long divisor = 1;
        long aux = numero;
        while (aux > 9) {
            aux = aux / 10;
            divisor = divisor * 10;
        }

        long sumaPares = 0;
        long sumaImpares = 0;

// 2. PRIMERA PASADA: Buscamos e imprimimos solo los pares
        System.out.print("Dígitos pares: ");
        long divPares = divisor; // Usamos una copia del divisor
        while (divPares > 0) {
            long digito = (numero / divPares) % 10;
            if (digito % 2 == 0) {
                System.out.print(digito + " ");
                sumaPares += digito;
            }
            divPares = divPares / 10;
        }
        System.out.println(); // Salto de línea

// 3. SEGUNDA PASADA: Buscamos e imprimimos solo los impares
        System.out.print("Dígitos impares: ");
        long divImpares = divisor; // Reiniciamos el divisor copiándolo del original
        while (divImpares > 0) {
            long digito = (numero / divImpares) % 10;
            if (digito % 2 != 0) {
                System.out.print(digito + " ");
                sumaImpares += digito;
            }
            divImpares = divImpares / 10;
        }
        System.out.println(); // Salto de línea

// 4. Mostramos las sumas
        System.out.println("Suma de los dígitos pares: " + sumaPares);
        System.out.println("Suma de los dígitos impares: " + sumaImpares);
    }
}
