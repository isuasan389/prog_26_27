package U1.EntregableModelo2;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Introduzca un número entero positivo: ");
            numero = teclado.nextInt();
        } while (numero <= 0);

        int resultado = 0;
        int multiplicador = 1;
        int eliminados = 0;

        while (numero > 0) {
            int digito = numero % 10;

            if (digito == 0 || digito == 8) {
                eliminados++;
            } else {
                resultado = digito * multiplicador + resultado;
                multiplicador *= 10;
            }

            numero /= 10;
        }

        System.out.println("Número resultado: " + resultado);
        System.out.println("Dígitos eliminados: " + eliminados);
    }
}
