package U1.Tarea4;

import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número decimal:");
        double numeroDecimal = teclado.nextDouble();

        int numeroRedondeado =(int) Math.round(numeroDecimal);

        System.out.print("El numero redondeado al entero mas proximo es:" + numeroRedondeado);
    }
}
