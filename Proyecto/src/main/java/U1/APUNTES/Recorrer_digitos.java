package U1.APUNTES;

import java.util.Scanner;

public class Recorrer_digitos {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int resultado = 0;
        int potencia = 1; //siempre es 1
        int eliminados = 0;

        //Se hace esto hasta que deje de cumplirse
        do {
            System.out.println("Introduzca un numero entero positivo: ");
            numero = teclado.nextInt();

        //Se hace el do mientras que el numero sea menor a 0
        } while (numero < 0);

        //Recorre los numeros
        while (numero > 0) {
            int digito = numero % 10;

            //Se calculan los digitos eliminados
            if (digito == 0 || digito == 8) {
                eliminados++;

            } else {
                resultado = digito * potencia;
                potencia++;

            }
           //Elimina el numero mas a la derecha (para el while)
            numero = numero / 10;
        }
        System.out.println("El resultado es: " + resultado);
        System.out.println("Los digitos eliminados son: " + eliminados);
    }
}
