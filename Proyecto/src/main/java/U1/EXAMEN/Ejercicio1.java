package U1.EXAMEN;

import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        int altura = teclado.nextInt();

        int centro = altura % 2;
        if (altura >= 5 || altura % 2 == 0)

        {

        } else {
            altura--;
            centro++;
        }

        for (int fila = 1; fila < altura; fila++) {

            // LETRA N
            for (int col = 1; col < altura / 2 * 3; col++) {

                if (fila == centro) {
                    System.out.print("*");
                } else if (col == centro - fila || col == centro + fila) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Separación entre letras
            System.out.print("   ");
            //LETRA O
            for (int col = 1; col < altura - 1; col++) {

                if (fila == 1 || fila == centro || fila == altura - 1) {
                    System.out.print("*");
                } else if (col == 1 || col == altura - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}