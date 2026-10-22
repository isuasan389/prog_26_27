package U1.EntregableModelo3;

import java.util.Scanner;

public class ejercicio4 {

    // Comprueba si un número es primo
    public static boolean esPrimo(long n) {
        if (n < 2) {
            return false;
        }
        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numero;
        int cifras;

        // Pedimos el número hasta que sea positivo y tenga un número par de cifras
        do {
            System.out.println("Introduce un número:");
            numero = sc.nextLong();

            // Contamos las cifras
            cifras = 0;
            long aux = numero;
            while (aux > 0) {
                aux = aux / 10;
                cifras++;
            }
        } while (numero <= 0 || cifras % 2 != 0);

        // Calculamos el divisor: 10 elevado a la mitad de las cifras
        // Ejemplo: 4 cifras -> divisor = 100
        long divisor = 1;
        for (int i = 0; i < cifras / 2; i++) {
            divisor = divisor * 10;
        }

        long primeraMitad = numero / divisor;   // 1213 / 100 = 12
        long segundaMitad = numero % divisor;   // 1213 % 100 = 13

        // %0Nd escribe el número con ceros por delante (por ejemplo 05)
        String formato = "%0" + (cifras / 2) + "d";

        // Primera mitad
        System.out.printf(formato, primeraMitad);
        if (esPrimo(primeraMitad)) {
            System.out.println(" es número primo");
        } else {
            System.out.println(" no es número primo");
        }

        // Segunda mitad
        System.out.printf(formato, segundaMitad);
        if (esPrimo(segundaMitad)) {
            System.out.println(" es número primo");
        } else {
            System.out.println(" no es número primo");
        }
    }
}