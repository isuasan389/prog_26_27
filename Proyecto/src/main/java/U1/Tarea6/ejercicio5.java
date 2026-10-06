package U1.Tarea6;

import java.util.Scanner;

public class ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        // Pedir el valor al usuario

        System.out.print("Dime el valor del radio de una circunferencia:");
        double radio = teclado.nextDouble();
        teclado.nextLine();

        // Seleccionar la opcion

       System.out.println("\n--- MENU DE OPCIONES ---");
        System.out.println("1.Calcular diametro");
        System.out.println("2.Calcular perimetro");
        System.out.println("3.Calcular area");
        System.out.print("Elige una opcion (1-3):");
        int opcion = teclado.nextInt();

        // OPERACIONES PARA CALCULAR

        switch(opcion) {
            case 1:
                double diametro = 2 * radio;
                System.out.println("El diametro es:" + diametro); break;
            case 2:
                double perimetro = 2 * Math.PI * radio;
                System.out.println("El perimetro es: " + perimetro); break;
            case 3:
                double area =  Math.PI * radio * radio;
                System.out.println("El valor del area es: " + area); break;
                
        }

    }
}
