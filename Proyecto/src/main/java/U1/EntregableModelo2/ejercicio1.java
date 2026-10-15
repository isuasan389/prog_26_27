package U1.EntregableModelo2;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura de los calcetines: ");
        int altura = teclado.nextInt();

        for (int i = 1; i <= altura; i++) {
            if (i <= altura / 2) {
                System.out.println("***     ***");
            } else {
                System.out.println("******  ******");
            }
        }
    }
}