package U1.Tarea8b;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int numero = teclado.nextInt();

        for (int i = numero; i < numero + 5; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + "\t\t" + cuadrado + "\t\t" + cubo);
        }
    }
}
