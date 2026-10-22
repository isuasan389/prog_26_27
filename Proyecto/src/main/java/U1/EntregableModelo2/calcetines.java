package U1.EntregableModelo2;

import java.util.Scanner;

public class calcetines {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int altura;

        do {
            System.out.println("Introduce la altura de los calcetines: ");
            altura = teclado.nextInt();
            teclado.nextLine();

        } while (altura < 4);

        for (int i = 0; i < altura - 2; i++) {
            System.out.println("***     ***");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("******  ******");

        }
    }
}
