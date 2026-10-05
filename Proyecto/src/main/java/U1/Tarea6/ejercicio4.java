package U1.Tarea6;

import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero de tipo byte:");
        byte numero1 = teclado.nextByte();
        System.out.print("Introduce el segundo numero de tipo byte:");
        byte numero2 = teclado.nextByte();

        byte menor = numero2;
        if (numero1 < menor) {
            menor = numero1;
        } else {
            
        }
        System.out.println("El valor del menor es: " + menor);

        // PARTE CON OPERADOR CONDICIONAL AHORA

        byte operadorCondicional = (numero1 < menor) ? menor : numero1;
        System.out.println("El valor del menor con el operador condicional es: " + menor);
    }
}

