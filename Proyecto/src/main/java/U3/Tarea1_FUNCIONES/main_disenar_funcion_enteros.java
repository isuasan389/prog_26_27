package U3.Tarea1_FUNCIONES;

import java.util.Scanner;

public class main_disenar_funcion_enteros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero entero: ");
        int numero1 = teclado.nextInt();

        System.out.print("Introduce el segundo numero entero: ");
        int numero2 = teclado.nextInt();

        System.out.println("Los numeros comprendidos entre " + numero1 + " y " + numero2 + " son");

        //Conexión: Llamamos a la funcion.
        disenar_funcion_enteros.imprimir(numero1, numero2);

        teclado.close();
    }
}
