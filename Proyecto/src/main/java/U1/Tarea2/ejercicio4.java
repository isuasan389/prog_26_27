package U1.Tarea2;

import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero entero:");
        int primerNumero = teclado.nextInt();

        System.out.println("Su multiplicación es:");
        System.out.println(primerNumero*1609);
    }
}
