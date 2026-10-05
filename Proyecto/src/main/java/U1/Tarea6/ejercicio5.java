package U1.Tarea6;

import java.util.Scanner;

public class ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        // Pedir el valor al usuario

        System.out.print("Dime el valor del radio de una circunferencia:");
        double valor = teclado.nextDouble();
        teclado.nextLine();

        // Seleccionar la opcion

        System.out.println("Selecciona una opción:");

        String menu = teclado.nextLine();
        switch(menu) {
            case "1":System.out.println("1.Calcular diametro:"); break;
            case "2":System.out.println("2.Calcular perimetro:"); break;
            case "3":System.out.println("3.Calcular area:"); break;
        }
    }
}
