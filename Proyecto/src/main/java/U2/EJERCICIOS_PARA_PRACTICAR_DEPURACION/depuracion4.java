package U2.EJERCICIOS_PARA_PRACTICAR_DEPURACION;

import java.util.Scanner;

public class depuracion4 {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num;

        System.out.println("Introduce el número");
        num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El número " + num + " no es primo");

        }
    }
    public static boolean esPrimo (int num) {
        boolean esPrimo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return esPrimo;
    }
}
