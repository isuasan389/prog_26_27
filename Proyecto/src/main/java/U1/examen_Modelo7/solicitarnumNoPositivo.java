package U1.examen_Modelo7;

import java.util.Scanner;

public class solicitarnumNoPositivo {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

// 1. Pedir el número hasta que sea positivo
        do {
            System.out.println("Introduce el número:");
            numero = teclado.nextInt();
        } while (numero <= 0);

// 2. Pedir posiciones
        System.out.println("Posición inicial:");
        int posInicial = teclado.nextInt();

        System.out.println("Posición final:");
        int posFinal = teclado.nextInt();

// 3. Convertimos el número a texto (String) para poder manejarlo por posiciones
        String numeroStr = String.valueOf(numero);
        String resultado = "";

// 4. Recorremos el texto carácter por carácter
        for (int i = 0; i < numeroStr.length(); i++) {
            // Si la posición actual NO está entre la inicial y la final, la guardamos
            if (i < posInicial || i > posFinal) {
                resultado += numeroStr.charAt(i);
            }
        }

// 5. Mostramos el resultado
        System.out.println("El número resultante es: " + resultado);
    }
}
