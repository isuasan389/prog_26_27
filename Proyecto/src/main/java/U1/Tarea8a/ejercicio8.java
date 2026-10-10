package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio8 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 6;
        long factorial = 1;
        String expresion = "";

        for (int i = numero; i >= 1; i--) {

            factorial *= i;
            expresion += i;

            if (i > 1) {
                expresion += "x";
        System.out.println("Factorial de " + numero + ": " + numero + "! = " + expresion + " = " + factorial);
            }
        }
    }
}
