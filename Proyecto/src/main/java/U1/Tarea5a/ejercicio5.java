package U1.Tarea5a;

import java.util.Scanner;

public class ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Intorduce el primer numero entero largo:");
        long numero1 = teclado.nextLong();
        System.out.print("Introduce el segundo numero entero largo:");
        long numero2 = teclado.nextLong();
        System.out.print("Introduce el tercer numero entero largo:");
        long numero3 = teclado.nextLong();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(numero1 + "es el mayor");

        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2 + "Es el mayor");

        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println(numero3 + "Es el mayor");
        }

    }
}