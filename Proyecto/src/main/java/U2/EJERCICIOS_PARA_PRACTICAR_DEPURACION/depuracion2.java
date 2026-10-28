package U2.EJERCICIOS_PARA_PRACTICAR_DEPURACION;

import java.util.Scanner;

public class depuracion2 {
    static void main(String[] args) {
        int i, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        num = sc.nextInt();

        System.out.println("Mostrando los 10 números posteriores " + num);
        i = num;

        while (i > num + 10) {
            System.out.println("Número posterior " + i);
            i++;
        }
    }
}
