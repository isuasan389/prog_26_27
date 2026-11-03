package U3.Tarea1_FUNCIONES;

import java.util.Scanner;
public class disenar_funcion_eco {
    public static void imprimirEco (int n) {
        Scanner teclado = new Scanner(System.in);

        int i = 0;
        do {
            System.out.println("Eco");
            i++;

        } while (n > i);
    }

}
