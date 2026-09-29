package U1.Tarea5a;

import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero entero:");
        int numero1 = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Introduce el segundo numero entero:");
        int numero2 = teclado.nextInt();
        teclado.nextLine();

        int contadorPares = 0;


        // Comprobación del primer numero
        if (numero1 % 2 == 0) {
            System.out.println("El numero" + numero1 + "es PAR");
            contadorPares = contadorPares + 1;

        } else {
            System.out.println("El numero" + numero1 + "es IMPAR");

        // Comprobación del segundo numero
        if (numero2 % 2 == 0) {
            System.out.println("El numero" + numero2 + "es PAR");
            contadorPares = contadorPares + 1;
        } else {
            System.out.println("El numero" + numero2 + "es IMPAR");

            //Resultado
            System.out.println("Cantidad total de numeros pares:" + contadorPares);

        }
        }
    }
}
