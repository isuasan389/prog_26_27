package U1.EntregableModelo2;

import java.util.Scanner;

public class ejercicio3 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca sus números favoritos:");
        int favorito1 = teclado.nextInt();
        int favorito2 = teclado.nextInt();
        int favorito3 = teclado.nextInt();

        System.out.print("Introduzca el número de la lotería: ");
        int numero = teclado.nextInt();

        int favoritos = 0;
        int otros = 0;

        while (numero > 0) {
            int digito = numero % 10;

            if (digito == favorito1 || digito == favorito2 || digito == favorito3) {
                favoritos++;
            } else {
                otros++;
            }

            numero /= 10;
        }

        if (favoritos > otros) {
            System.out.println("Ese número le va a dar suerte");
        } else {
            System.out.println("Ese número no le va a dar suerte");
        }
    }
}
