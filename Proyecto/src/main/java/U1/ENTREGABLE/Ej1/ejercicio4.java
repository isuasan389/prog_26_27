package U1.ENTREGABLE.Ej1;

import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int secreto = (int) (Math.random() * 100) + 1;
        int intentos = 1;

        System.out.println("He pensado un numero entre 1 y 100. Tienes 7 intentos.");
        while (intentos <= 7) {
            System.out.println("Intento " + intentos + ": ");
            int num = teclado.nextInt();
            if (num < 1 || num > 100) {
                System.out.println("Ese numero no esta entre 1 y 100. No cuenta como intento.");
                continue;
            }
            if (num == secreto) {
                System.out.println("Has acertado. en " + intentos + " intentos");
                return;
            }
            System.out.println(secreto > num ? "El numero es mayor. " : "El numero es menor. ");

            int dif = Math.abs(secreto - num);
            System.out.println(dif <= 5 ? "Caliente!" : dif <= 25 ? "Templado" : "Frio");
            intentos++;

        }
        System.out.println("Agotaste los intentos. El numero era: " + secreto);

    }
}