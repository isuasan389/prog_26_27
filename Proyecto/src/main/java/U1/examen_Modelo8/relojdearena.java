package U1.examen_Modelo8;

import java.util.Scanner;

public class relojdearena {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura del reloj de arena: ");
        int altura = teclado.nextInt();

// Comprobamos si hay error en la altura (menor que 3 o par)
        if (altura < 3 || altura % 2 == 0) {
            System.out.println("Error: La altura debe ser un número impar mayor o igual a 3.");
        } else {
            // Variables para controlar la cantidad de espacios y asteriscos por fila
            int espacios = 0;
            int asteriscos = altura;

            // Bucle para pintar cada fila
            for (int i = 0; i < altura; i++) {

                // Pintamos los espacios
                for (int j = 0; j < espacios; j++) {
                    System.out.print(" ");
                }

                // Pintamos los asteriscos
                for (int j = 0; j < asteriscos; j++) {
                    System.out.print("*");
                }
                System.out.println(); // Salto de línea al terminar la fila

                // Modificamos contadores para la siguiente fila
                if (i < altura / 2) {
                    // Mitad superior: el reloj se estrecha
                    espacios++;
                    asteriscos -= 2;
                } else {
                    // Mitad inferior: el reloj se ensancha
                    espacios--;
                    asteriscos += 2;
                }
            }
        }
    }
}
