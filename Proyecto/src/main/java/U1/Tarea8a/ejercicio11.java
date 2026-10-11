package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio11 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Tabla del " + numero);

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            System.out.println();
        }
    }
}
