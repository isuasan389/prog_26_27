package U1.Tarea5b;

import java.util.Scanner;

public class ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0.");
        System.out.print("Por favor, introduzca el valor de a: ");
        int Valora = teclado.nextInt();
        System.out.print("Ahora introduzca el valor de b: ");
        int Valorb = teclado.nextInt();

        double resultado = (double) Valorb / Valora;
        System.out.println(resultado);

    }
}
