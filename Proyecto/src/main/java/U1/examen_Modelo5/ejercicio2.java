package U1.examen_Modelo5;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        long numero = teclado.nextLong();

        boolean[] digitos = new boolean[10];

        if (numero < 0) {
            numero = -numero;
        }

        if (numero == 0) {
            digitos[0] = true;
        }

        while (numero > 0) {
            int digito = (int) (numero % 10);
            digitos[digito] = true;
            numero /= 10;
        }

        System.out.print("Dígitos que aparecen en el número: ");
        for (int i = 0; i <= 9; i++) {
            if (digitos[i]) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.print("Dígitos que no aparecen: ");
        for (int i = 0; i <= 9; i++) {
            if (!digitos[i] && i != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
