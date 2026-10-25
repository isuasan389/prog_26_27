package U1.EntregableModelo4;

import java.util.Scanner;

public class conversor_decimal_asteriscos {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        String numeroTexto = Integer.toString(numero);

        System.out.print("El número " + numero + " traducido al sistema de asteriscos es: ");

        for (int i = 0; i < numeroTexto.length(); i++) {
            int cifra = numeroTexto.charAt(i) - '0';

            for (int j = 0; j < cifra; j++) {
                System.out.print("*");
            }

            if (i < numeroTexto.length() - 1) {
                System.out.print("-");
            }
        }

        System.out.println();
    }
}
