package U1.Tarea5b;

import java.util.Scanner;

public class ejercicio6 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        int nota1 = teclado.nextInt();
        System.out.print("Introduce la segunda nota: ");
        int nota2 = teclado.nextInt();
        System.out.print("Introduce la tercera nota: ");
        int nota3 = teclado.nextInt();

        int suma = nota1 + nota2 + nota3;
        int media = suma / 3;
        System.out.println("La nota media es: " + media);

    }
}
