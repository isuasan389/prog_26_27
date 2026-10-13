package U1.Tarea8b;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la combinacion de la caja fuerte:");
        int combinacion = teclado.nextInt();
        int combiCaja = 1234;
        int oportunidades = 4;


        while (combinacion != oportunidades) {

            if (combinacion != combiCaja) {
                System.out.println("Lo siento, esa no es la combinacion");

            } else {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            }
            break;
        }
    }
}
