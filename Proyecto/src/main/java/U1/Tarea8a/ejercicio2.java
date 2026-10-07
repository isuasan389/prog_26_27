package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma_edades=0,media_edades=0, may_edad=0;
        System.out.println("Introduce la edad de los alumnos:");
        int edades = teclado.nextInt();

        while (edades > 0) {
            suma_edades+= edades;
            edades = teclado.nextInt();

        }
        int Sumar = edades + edades;
        System.out.println("La suma de las edades es: " + Sumar);

        int media = Sumar / 2;
        System.out.println("La media es");
    }
}