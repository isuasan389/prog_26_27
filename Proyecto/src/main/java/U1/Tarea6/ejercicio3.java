package U1.Tarea6;

import java.util.Scanner;

public class ejercicio3 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // parte con if y else

        System.out.print("Introduce un numero entero:");
        int variable = teclado.nextInt();

        int par;

        if (variable % 2 == 1) {
            par = 1;
        } else {
            par = 0;
        }
        System.out.println("El valor de par es:" + par);

        // Parte con operador condiconal

        int operadorCondicional = (variable % 2 == 0) ? 1 : 0;

        // Mostrar resultados

        System.out.println("Usando el operador condicional, 'par' vale: " + par);
    }
}