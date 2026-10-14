package U1.Tarea8b;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la combinacion de la caja fuerte: ");
        int combinacion = teclado.nextInt();
        int combiCaja = 1234;
        int oportunidades = 4;


        while (oportunidades > 0) {

            if (combinacion == combiCaja) {

                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            } else {
                oportunidades--;
                System.out.println("Lo siento, esa no es la combinacion.");

                if (oportunidades > 0) {

                    System.out.println("Vuelve a introducir la combinacion: ");
                    int combiNueva = teclado.nextInt();

                    if (oportunidades == 0) {
                    }
                }
            }
        }
        System.out.println("Has agotado las oportunidades.");
    }
}
