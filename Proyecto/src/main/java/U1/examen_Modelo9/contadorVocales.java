package U1.examen_Modelo9;

import java.util.Scanner;

public class contadorVocales {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entrada: cad = ");
        String cadena = teclado.nextLine();

        int contadorVocales = 0;

// Convertimos la cadena a minúsculas para ahorrarnos comprobar 'A', 'E', 'I'...
        cadena = cadena.toLowerCase();

// Recorremos la cadena letra a letra
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("Salida: La cantidad de vocales es " + contadorVocales);
    }
}
