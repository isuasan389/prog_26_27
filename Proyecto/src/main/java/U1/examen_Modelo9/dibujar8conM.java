package U1.examen_Modelo9;

import java.util.Scanner;

public class dibujar8conM {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        int altura = teclado.nextInt();

        if (altura < 5 || altura % 2 == 0) {
            System.out.println("La altura introducida no es correcta");
        } else {
            for (int i = 0; i < altura; i++) {
                // Comprobamos si estamos en la primera, la del medio o la última fila
                if (i == 0 || i == altura / 2 || i == altura - 1) {
                    System.out.println("MMMMMM");
                } else {
                    System.out.println("M    M");
                }
            }
        }
    }
}
