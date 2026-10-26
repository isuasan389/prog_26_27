package U1.EntregableModelo2;

import java.util.Scanner;

public class incrementarHora {
    static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.print("Introduzca horas: ");
        int horas = teclado.nextInt();

        System.out.print("Introduzca minutos: ");
        int minutos = teclado.nextInt();

        System.out.print("Introduzca segundos: ");
        int segundos = teclado.nextInt();

        System.out.print("Introduzca segundos a incrementar: ");
        int incremento = teclado.nextInt();

        System.out.println("\nAumentando la hora...");

        for (int i = 0; i < incremento; i++) {
            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;

                if (minutos == 60) {
                    minutos = 0;
                    horas++;

                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }

            System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
        }
    }
}
