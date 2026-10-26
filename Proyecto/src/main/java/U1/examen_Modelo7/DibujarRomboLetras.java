package U1.examen_Modelo7;

import java.util.Scanner;

public class DibujarRomboLetras {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();

// 1. Si la cadena tiene más de 10 caracteres, nos quedamos solo con los 10 primeros
        if (cadena.length() > 10) {
            cadena = cadena.substring(0, 10);
        }

// Guardamos la longitud de la cadena para usarla en los bucles
        int n = cadena.length();

// 2. La altura total del rombo será el doble de la longitud menos 1 (para "SAMPLE" de 6 letras, altura 11)
        int altura = (2 * n) - 1;

        for (int i = 0; i < altura; i++) {

            // 3. Calculamos la "fila lógica" en la que estamos.
            // Va subiendo de 0 hasta n-1 (mitad del rombo) y luego vuelve a bajar a 0
            int fila;
            if (i < n) {
                fila = i; // Primera mitad (triángulo superior)
            } else {
                fila = (2 * n - 2) - i; // Segunda mitad (triángulo inferior)
            }

            // 4. Imprimir los espacios en blanco necesarios a la izquierda
            // Cuanto mayor es la fila, menos espacios hay
            int espacios = n - 1 - fila;
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            // 5. Imprimir las letras hacia adelante (desde la posición 0 hasta 'fila')
            for (int j = 0; j <= fila; j++) {
                System.out.print(cadena.charAt(j));
            }

            // 6. Imprimir las letras hacia atrás (desde 'fila - 1' hasta 0)
            // Se empieza en fila - 1 para no repetir la letra central (el "pico")
            for (int j = fila - 1; j >= 0; j--) {
                System.out.print(cadena.charAt(j));
            }

            // 7. Salto de línea para la siguiente fila
            System.out.println();
        }
    }
}
