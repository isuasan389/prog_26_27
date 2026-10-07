package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad = 0;
        int suma_edades=0;
        int contador = 0;
        int may_edad = 0;
        System.out.println("Introduce la edad de los alumnos:");
        edad = teclado.nextInt();

        while (edad >= 0) {
            suma_edades += edad;
            contador++;

        if (edad >= 18) {
            may_edad++;
        }
            edad = teclado.nextInt();
        }
        double media = (double) suma_edades / contador;
        System.out.println("La suma de las edades es:" + suma_edades);
        System.out.println("La media es: " + media);
        System.out.println("Mayores de edad: " + may_edad);
    }
}