package U1.ENTREGABLE.Ej1;

import java.util.Scanner;

public class TaxiVeloz {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tarifa = 0;
        int importemin = 7;
        int suplemento = 5;

        System.out.println("Bienvenido a Taxi Veloz.");

        if (tarifa > 22 && tarifa < 6) {
            System.out.println("Se aplica tarifa nocturna");

        } else {
            System.out.println("Se aplica tarifa diurna");


        }
    }
}
