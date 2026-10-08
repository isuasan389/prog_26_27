package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio3 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numAleatorio = (int) (Math.random() * 100) + 1;
        System.out.println(numAleatorio);

        int numero = 0;
        int intentos = 0;

        while (numero != numAleatorio) {

            System.out.println("Introduce un numero:");
            numero = teclado.nextInt();

            if (numero == -1) {
                System.out.println("Te has rendido.");
                break;
            }
            if (numero > numAleatorio) {
                System.out.println("Mayor");
            } else if (numero < numAleatorio) {
                System.out.println("Menor");

            } else {
                System.out.println("Has acertado");
                System.out.println("Numero de intentos " + intentos);
            }
        }

    }
}