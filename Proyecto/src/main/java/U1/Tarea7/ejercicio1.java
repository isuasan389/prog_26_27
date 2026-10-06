package U1.Tarea7;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String temp;

        String a = "agua";
        String b = "coca cola";
        temp = a;
        a = b;
        b = temp;
        System.out.println("a es: " + a);
        System.out.println("b es: " + b);

    }
}
