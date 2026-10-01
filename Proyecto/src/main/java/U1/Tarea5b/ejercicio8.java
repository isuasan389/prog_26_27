package U1.Tarea5b;

import java.util.Scanner;

public class ejercicio8 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el valor de a:");
        double a = teclado.nextDouble();

        System.out.println("Introduce el valor de b:");
        double b = teclado.nextDouble();

        System.out.println("Introduce el valor de c:");
        double c = teclado.nextDouble();

        double discriminante = Math.pow(b, 2) - (4 * a * c);

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La ecuacion tiene dos soluciones reales:");
            System.out.println("x1 =" + x1);
            System.out.println("x2 =" + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una unica solucion real:");
            System.out.println("x =" + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales (tiene soluciones complejas).");

        }
    }
}
