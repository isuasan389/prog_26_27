package U1.Tarea8b;

import java.util.Scanner;

public class ejercicio4 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int numero = 0;

        System.out.println("Introduce un valor: ");
        int lista = teclado.nextInt();

        for (int i = 0; i < 10; i++) {
            positivos++;
            if (numero <= 10 && numero >= 0) {
                numero++;
            } else {
                negativos++;
            }
            System.out.println(positivos);
            System.out.println(negativos);
        }
        System.out.println("Son positivos " + positivos);
        System.out.println("No hay negativos " +  negativos);
    }
}
