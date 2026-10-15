package U1.examen_Modelo5;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

                System.out.print("Introduce la altura: ");
                int altura = teclado.nextInt();

                int centro = altura / 2;

                for (int fila = 0; fila < altura; fila++) {

                    // LETRA A
                    for (int col = 0; col < altura; col++) {

                        if (fila == centro) {
                            System.out.print("*");
                        } else if (col == centro - fila || col == centro + fila) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                    // Separación entre letras
                    System.out.print("  ");

                    // LETRA B
                    for (int col = 0; col < altura - 1; col++) {

                        if (fila == 0 || fila == centro || fila == altura - 1) {
                            System.out.print("*");
                        } else if (col == 0 || col == altura - 2) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                    System.out.println();
                }

                teclado.close();
            }
        }
