package U1.Tarea4;

import java.util.Scanner;

public class ejercicio3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double nota1 = 9.50;
        double nota2 = 5.25;
        double nota3 = 3.75;

        double mediaDecimal = (nota1 + nota2 + nota3) / 3.0;
        System.out.println(mediaDecimal);

        int parteEntera = (int) mediaDecimal;
        System.out.println("La media exacta es:" + mediaDecimal);
        System.out.println("La parte entera de la media es:" + parteEntera);
    }
}
