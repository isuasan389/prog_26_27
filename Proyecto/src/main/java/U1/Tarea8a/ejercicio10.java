package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio10 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        do {
            System.out.println("Introduce un numero (1-10): ");
            numero = teclado.nextInt();

            if (numero < 1 ||  numero > 10) {
                System.out.println("Error. El numero debe estar entre 1 y 10.");
            }
        } while (numero < 1 || numero > 10);

        System.out.println("Tabla de multiplicar del " + numero);

        for (int multiplicacion = 1; multiplicacion <= 10; multiplicacion++) {
            System.out.println(numero + " x " + multiplicacion + " = " + (numero * multiplicacion));

        }
    }
}
