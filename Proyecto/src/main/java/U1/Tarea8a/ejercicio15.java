package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio15 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int Primo = 0;

        System.out.println("Introduce el valor de n: ");
        int n = teclado.nextInt();

        for (int EsPrimo = 2; EsPrimo <= n; EsPrimo++) {
           int NoPrimo = 0;

            for (numero = 1; numero <= EsPrimo; numero++) {
                if (EsPrimo % numero == 0) {
                    NoPrimo++;
                }
                }
                if (NoPrimo == 2) {
                    System.out.println(EsPrimo + " -> Es primo");
                    Primo++;
            } else {
                    System.out.println(EsPrimo + " -> No es primo");

                }
            }
        System.out.println("Entre 1 y " + n + " hay " + Primo + " numeros primos");
    }
    }
