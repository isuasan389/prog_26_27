package U1.ENTREGABLE.Ej1;

import java.util.Scanner;

public class rotaciones {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

                long numero = 0;
                int posiciones = 0;

                do {
                    System.out.print("Introduzca un número entero positivo: ");
                    while (!teclado.hasNextLong()) {
                        System.out.print("Por favor, introduzca un número válido: ");
                        teclado.next();
                    }
                    numero = teclado.nextLong();
                } while (numero <= 0);

                do {
                    System.out.print("Introduzca las posiciones a rotar: ");
                    while (!teclado.hasNextInt()) {
                        System.out.print("Por favor, introduzca un número entero válido: ");
                        teclado.next();
                    }
                    posiciones = teclado.nextInt();
                } while (posiciones < 0);

                String numeroStr = Long.toString(numero);
                int longitud = numeroStr.length();

                int rotacionesReales = posiciones % longitud;


                String parteIzquierda = numeroStr.substring(0, rotacionesReales);
                String parteDerecha = numeroStr.substring(rotacionesReales);
                String resultadoStr = parteDerecha + parteIzquierda;

                long resultadoFinal = Long.parseLong(resultadoStr);


                System.out.println("El número " + numero + " rotado " + posiciones + " posiciones es " + resultadoFinal);
    }
}