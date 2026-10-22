package U1.EntregableModelo3;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;

        do {
            System.out.print("Introduce la altura de la Z: ");
            altura = teclado.nextInt();
        } while (altura % 2 == 0 || altura <= 3);

        for (int fila = 0; fila < altura; fila++) {

            for (int z = 0; z < 2; z++) {
                if (fila == 0 || fila == altura - 1) {

                    for (int i = 0; i < altura; i++) {
                        System.out.print("*");
                    }
                } else {
                    for (int i = 0; i < altura - 1 - fila; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int i = 0; i < fila; i++) {
                        System.out.print(" ");
                    }
                }
                if (z == 0) {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
