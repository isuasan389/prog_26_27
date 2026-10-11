package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio13 {
    static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);


        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Introduce la nota del alumno " + i + " (0 a 10):");
            double nota = teclado.nextDouble();

            if (nota >=5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("\n--- Resultados ---");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Condicionados " + condicionados);
        System.out.println("Suspensos " + suspensos);
    }
}
