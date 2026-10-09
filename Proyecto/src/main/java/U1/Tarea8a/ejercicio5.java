package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio5 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int minimo;
        int maximo;
        int valorInterno;

        System.out.println("Introduce el valor minimo de un rango: ");
        minimo = teclado.nextInt();

        System.out.println("Introduce el valor maximo de un rango: ");
        maximo = teclado.nextInt();

        System.out.println("Introduce un valor: ");
        valorInterno = teclado.nextInt();

        while (valorInterno < minimo || valorInterno > maximo) {

                System.out.println("Fuera del rango, porfavor introduzca otro valor:");
                valorInterno = teclado.nextInt();
            }
        System.out.println("El numero esta dentro del rango.");
        }
    }
