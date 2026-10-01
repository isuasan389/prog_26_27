package U1.Tarea5b;

import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca el numero de horas trabajadas durante la semana: ");
        int horasTrabajadas = teclado.nextInt();
        int eurosPrimerasHoras = 12;
        int euros41Horas = 16;
        int salario;

        if (horasTrabajadas <=40) {
            salario = horasTrabajadas * eurosPrimerasHoras;

        } else {
            salario = 40 * eurosPrimerasHoras + (horasTrabajadas - 40) * euros41Horas;
        }
        System.out.println("El sueldo semanal que le corresponde es de: ");
        System.out.println(salario);

    }
}
