package U3.Tarea1_FUNCIONES;

import java.util.Scanner;

public class main_disenar_funcion_enteros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los numeros para que sean comprendidos: ");
        int resultado = teclado.nextInt();

        //Conexión: Llamamos a la funcion.
        diseñar_funcion_enteros.imprimir(resultado);

        teclado.close();
    }
}
