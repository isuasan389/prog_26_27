package U1.Tarea3;

import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduce un numero en millas:");
        int millas = teclado.nextInt();

        float equivalenciaenkm = millas * 1609;
        System.out.println("Su equivalencia en kilómetros es:" + equivalenciaenkm);

    }
}
