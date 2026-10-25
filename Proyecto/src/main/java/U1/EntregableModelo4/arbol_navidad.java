package U1.EntregableModelo4;

import java.util.Scanner;

public class arbol_navidad {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;

        do {
            System.out.print("Por favor, introduzca la altura del árbol: ");
            altura = teclado.nextInt();
        } while (altura < 4);

        for (int i = 0; i < altura - 1; i++) {

            if (i == 0) {
                for (int j = 0; j < altura - 3; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");

            } else if (i == 1) {
                for (int j = 0; j < altura - 3; j++) {
                    System.out.print(" ");
                }
                System.out.println("^");

            } else if (i == altura - 2) {
                for (int j = 0; j < altura * 2 - 5; j++) {
                    System.out.print("^");
                }
                System.out.println();

            } else {
                for (int j = 0; j < altura - 2 - i; j++) {
                    System.out.print(" ");
                }

                System.out.print("^");

                for (int j = 0; j < i * 2 - 3; j++) {
                    System.out.print(" ");
                }

                System.out.println("^");
            }
        }

        for (int j = 0; j < altura - 3; j++) {
            System.out.print(" ");
        }

        System.out.println("Y");
    }
}