package U1.Tarea2;

import java.util.Scanner;


public class ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero entero:");
        int primerNumero = teclado.nextInt();

        System.out.println("Esquivalen a los siguientes grados Fahrenheit:" + (9 * primerNumero / 5 + 32));
    }
}
