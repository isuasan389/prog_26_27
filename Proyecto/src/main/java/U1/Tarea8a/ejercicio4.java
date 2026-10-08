package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio4 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero n: ");
        String n = teclado.nextLine();

        int numeroRandom = Integer.parseInt(n);
        int contador;

        for (contador = 1; contador <= numeroRandom; contador++) {
            System.out.println(contador);
        }
    }
}
