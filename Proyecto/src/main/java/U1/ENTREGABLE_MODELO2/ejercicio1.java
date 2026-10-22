package U1.ENTREGABLE_MODELO2;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;

        do {
            System.out.println("Introduce la altura de los calcetines: ");
            altura = teclado.nextInt();
            teclado.nextLine();

        } while (altura < 4);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");

            }
            System.out.print("  ");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < altura - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}