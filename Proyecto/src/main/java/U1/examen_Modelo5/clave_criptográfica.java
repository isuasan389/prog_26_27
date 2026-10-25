package U1.examen_Modelo5;

import java.util.Random;
import java.util.Scanner;

public class clave_criptográfica {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        System.out.print("Introduzca un número: ");
        long numero = teclado.nextLong();

        long auxiliar = numero;
        long divisor = 1;
        int resultado = 0;

        if (auxiliar < 0) {
            auxiliar = -auxiliar;
        }

        while (auxiliar / divisor >= 10) {
            divisor *= 10;
        }

        while (divisor > 0) {
            int cifra = (int) (auxiliar / divisor);
            auxiliar %= divisor;
            divisor /= 10;

            int clave = aleatorio.nextInt(9000) + 1000;

            System.out.println("La clave criptográfica generada para " + cifra
                    + " es: " + clave);

            int suma = cifra;
            int claveAuxiliar = clave;

            while (claveAuxiliar > 0) {
                suma += claveAuxiliar % 10;
                claveAuxiliar /= 10;
            }

            System.out.println("La suma de las cifras totales para " + cifra
                    + " es: " + suma);

            resultado += suma;
        }

        System.out.println("El número resultante es: " + resultado);
    }
}
