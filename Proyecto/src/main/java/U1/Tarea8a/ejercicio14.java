package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio14 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el valor de n:");
        int n = teclado.nextInt();

        for (int fila = 1; fila <= n; fila++) {
            for (int columna = fila; columna <= n; columna++) {
                break;
            }
            System.out.println("****");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
        }
    }
}
