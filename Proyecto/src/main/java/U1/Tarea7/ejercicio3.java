package U1.Tarea7;

import java.util.Scanner;

import static java.lang.Math.random;

public class ejercicio3 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 26) + 97;
        System.out.println(numeroAleatorio);
        
    }
}
