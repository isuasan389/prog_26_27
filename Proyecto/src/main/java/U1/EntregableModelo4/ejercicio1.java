package U1.EntregableModelo4;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;

        do {
            System.out.println("Introduce la altura del arbol de navidad: ");
            altura = teclado.nextInt();
            teclado.nextLine();

        } while (altura < 4);

        for (int i = 0; i < altura + 1; i++) {
            for (int j = 0; j < altura - 1; j++) {

                System.out.print("*");
                if (i == altura + 1) {

                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < altura / 3; j++) {
                System.out.println("*");

            }
            System.out.println();
        }
    }
}
