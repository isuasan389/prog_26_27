package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int numero = teclado.nextInt();

        while (numero != 0) {
            // SI ES PAR O IMPAR
            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
                // Si es positivo o negativo
                if (numero > 0) {
                    System.out.println("Es positivo");
                } else {
                    System.out.println("Es negativo");
                    // CALCULA EL CUADRADO
                    int cuadrado = numero * numero;
                        System.out.println("El cuadrado es:" + cuadrado);
                    }
                }
            }
        }
    }
