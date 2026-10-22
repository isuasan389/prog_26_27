package U1.ENTREGABLE.Ej1;

import java.util.Scanner;

public class casa {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alturaTecho = 5;
        int alturaBase = 5;
        int anchuraBase = (alturaTecho * 2) - 1;

        System.out.println("Introduzca la altura del tejado: ");
        int altura = teclado.nextInt();

        for (int i = 1; i <= altura - i ; i++) {
            for (int j = 1; j <= altura - i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (2 * i) - 1 ; j++) {

                if (j == 1 || j == (2 * i) - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }

                }
            System.out.println();
        }
        for (int i = 2; i <= alturaBase; i++) {
            for (int j = 1; j <= anchuraBase ; j++) {

                if (j == 1 || j == anchuraBase || i == alturaBase) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();


        }
    }
}
