package U1.Tarea5;

import java.util.Scanner;

public class ejercicio3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int numero = 20;
        if (numero % 2 != 0) {
            System.out.println("Tu numero es impar");
        } else {
            System.out.println("Tu numero no es impar");
        }
    }
}