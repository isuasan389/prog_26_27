package U1.Tarea3;

import java.util.Scanner;

public class ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        short añodenacimiento;
        short añoactual;
        short edad;

        System.out.print("Introduce tu año de nacimiento:");
        añodenacimiento = teclado.nextShort();

        System.out.print("Introduce el año actual:");
        añoactual = teclado.nextShort();

        edad = (short) (añoactual - añodenacimiento);

        System.out.println("Su edad es:" + edad + "años");


    }
}
