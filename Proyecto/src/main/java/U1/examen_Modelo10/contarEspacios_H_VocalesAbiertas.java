package U1.examen_Modelo10;

import java.util.Scanner;

public class contarEspacios_H_VocalesAbiertas {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Entrada: cad = ");
        String cadena = teclado.nextLine();

        int contador = 0;

// Convertimos todo a minúsculas para simplificar las comprobaciones
        cadena = cadena.toLowerCase();

// Recorremos la cadena letra por letra
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            // Comprobamos si es espacio, 'h' o vocal abierta (con y sin tilde)
            if (c == ' ' || c == 'h' || c == 'a' || c == 'á' || c == 'e' || c == 'é' || c == 'o' || c == 'ó') {
                contador++;
            }
        }

        System.out.println("Salida: La cantidad de espacios, haches y vocales abiertas es " + contador);
    }
}
