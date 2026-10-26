package U1.examen_Modelo7;

import java.util.Scanner;

public class dibujarflechasizq {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;

// 1. Pedimos la altura asegurándonos de que sea >= 3 e impar
        do {
            System.out.print("Introduzca la altura de la flecha: ");
            altura = teclado.nextInt();
        } while (altura < 3 || altura % 2 == 0);

// 2. Variables para controlar cuántos espacios y asteriscos hay en cada fila
// Empezamos por la primera fila (la de más arriba)
        int espacios = altura / 2;
        int asteriscos = 1;

// 3. Bucle para dibujar cada fila de la flecha
        for (int i = 0; i < altura; i++) {

            // Imprimir los espacios en blanco
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            // Imprimir los asteriscos
            if (i == altura / 2) {
                // Si estamos en la fila del medio, sumamos los 5 del "palito"
                for (int j = 0; j < asteriscos + 5; j++) {
                    System.out.print("*");
                }
            } else {
                // Si es una fila normal de la punta de la flecha
                for (int j = 0; j < asteriscos; j++) {
                    System.out.print("*");
                }
            }

            // Salto de línea para pasar a la siguiente fila
            System.out.println();

            // 4. Ajustar los espacios y asteriscos para la próxima vuelta del bucle
            if (i < altura / 2) {
                // Mientras estemos en la mitad superior: cada vez hay menos espacios y más asteriscos
                espacios--;
                asteriscos++;
            } else {
                // Cuando pasamos a la mitad inferior: cada vez hay más espacios y menos asteriscos
                espacios++;
                asteriscos--;
            }
        }
    }
}
