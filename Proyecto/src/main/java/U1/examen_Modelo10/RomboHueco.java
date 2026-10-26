package U1.examen_Modelo10;

import java.util.Scanner;

public class RomboHueco {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;

// 1. Pedir altura hasta que sea correcta (impar y >= 3)
        do {
            System.out.print("Por favor, introduzca la altura del rombo: ");
            altura = teclado.nextInt();

            if (altura < 3 || altura % 2 == 0) {
                System.out.println("Error: La altura debe ser un número impar mayor o igual a 3.");
            }
        } while (altura < 3 || altura % 2 == 0);

// 2. Contadores iniciales para la primera fila
        int espaciosFuera = altura / 2;
        int espaciosDentro = -1; // -1 significa que en la primera fila no hay hueco dentro

// 3. Bucle para dibujar cada fila
        for (int i = 0; i < altura; i++) {

            // Espacios exteriores
            for (int j = 0; j < espaciosFuera; j++) {
                System.out.print(" ");
            }

            // Primer asterisco
            System.out.print("*");

            // Espacios interiores y segundo asterisco (si corresponde)
            if (espaciosDentro > 0) {
                for (int j = 0; j < espaciosDentro; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println(); // Salto de línea

            // 4. Modificamos los espacios para la siguiente fila
            if (i < altura / 2) {
                // Mitad superior: menos espacios fuera, más dentro
                espaciosFuera--;
                espaciosDentro += 2;
            } else {
                // Mitad inferior: más espacios fuera, menos dentro
                espaciosFuera++;
                espaciosDentro -= 2;
            }
        }
    }
}
