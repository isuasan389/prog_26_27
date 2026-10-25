package U1.EntregableModelo3;
import java.util.Scanner;

public class ocurrencias_posiciones {
    static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);
                long numero;
                int cifra;

                do {
                    System.out.println("Introduzca un número:");
                    numero = teclado.nextLong();
                } while (numero <= 0);

                do {
                    System.out.println("Una cifra:");
                    cifra = teclado.nextInt();
                } while (cifra < 0 || cifra > 9);

                // Primero contamos cuántas cifras tiene el número
                int totalCifras = 0;
                long aux = numero;
                while (aux > 0) {
                    totalCifras++;
                    aux = aux / 10;
                }

                // Recorremos el número de derecha a izquierda
                int ocurrencias = 0;
                String posiciones = "";
                int posicion = totalCifras; // la última cifra está en la posición totalCifras
                aux = numero;

                while (aux > 0) {
                    int digito = (int) (aux % 10);
                    if (digito == cifra) {
                        ocurrencias++;
                        // Como vamos de derecha a izquierda, añadimos la posición por delante
                        if (posiciones.equals("")) {
                            posiciones = "" + posicion;
                        } else {
                            posiciones = posicion + " - " + posiciones;
                        }
                    }
                    posicion--;
                    aux = aux / 10;
                }

                if (ocurrencias == 0) {
                    posiciones = "Ninguna";
                }

                System.out.println();
                System.out.println("Resultado:");
                System.out.println();
                System.out.println(ocurrencias + " ocurrencias");
                System.out.println("Posiciones: " + posiciones);
    }
}
