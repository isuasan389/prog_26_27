package U1.examen_Modelo5;

import java.util.Scanner;

public class ejercicio4 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a Carbonita Volando");

        System.out.print("Introduzca el peso de su figura en gramos: ");
        double peso = teclado.nextDouble();

        System.out.print("Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): ");
        int material = teclado.nextInt();

        System.out.print("¿Quiere posprocesado? (1=si, 2=no): ");
        int posprocesado = teclado.nextInt();

        System.out.print("¿Pertenece a Enjuto3D Premium? (1=si, 2=no): ");
        int premium = teclado.nextInt();

        double precioGramo = 0;

        switch (material) {
            case 1:
                precioGramo = 0.2;
                break;
            case 2:
                precioGramo = 0.3;
                break;
            case 3:
                precioGramo = 0.5;
                break;
            case 4:
                precioGramo = 0.7;
                break;
        }

        double total = peso * precioGramo;

        if (posprocesado == 1) {
            total += 3;
        }

        if (premium == 2) {
            total += 2;
        }

        System.out.println();
        System.out.printf("El coste total de la pieza es: %.2f €%n", total);
    }
}
