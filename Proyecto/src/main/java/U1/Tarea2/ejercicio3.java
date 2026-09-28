package U1.Tarea2;

import java.util.Scanner;

public class ejercicio3 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe un numero entero: ");
        int primerNumero = teclado.nextInt();

        System.out.print("Introduzca el segundo numero: " );
        int segundoNumero = teclado.nextInt();

        System.out.print("Su division es:");
        System.out.println(primerNumero/segundoNumero);

    }
}
