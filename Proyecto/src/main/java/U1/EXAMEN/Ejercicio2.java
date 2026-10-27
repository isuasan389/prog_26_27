package U1.EXAMEN;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long numero;
        long valorSuma;
        long Tarjeta = 0;
        do {
            System.out.println("Introduce el numero de la tarjeta: ");
            numero = teclado.nextLong();
            teclado.nextLine();

        } while (Tarjeta >= 0);

        long digito = Tarjeta % 10;

        if (digito == 0 || digito == 10) {

        }

    }
}
