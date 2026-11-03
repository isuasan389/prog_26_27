package U3.Tarea1_FUNCIONES;

import java.util.Scanner;

public class main_disenar_funcion_eco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int n = teclado.nextInt();

        //Conexión: Llamamos al método de la otra clase usando su nombre
        disenar_funcion_eco.imprimirEco(n);

        teclado.close();
    }
}
