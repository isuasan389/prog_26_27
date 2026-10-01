package U1.Tarea5b;

import java.util.Scanner;

public class ejercicio7 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        int nota1 = teclado.nextInt();
        System.out.print("Introduce la segunda nota: ");
        int nota2 = teclado.nextInt();
        System.out.print("Introduce la tercera nota: ");
        int nota3 = teclado.nextInt();

        int suma = nota1 + nota2 + nota3;
        int media = suma / 3;
        System.out.println("La nota media es: " + media);


        switch(media) {

            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente"); break;
            case 5:
                System.out.println("Suficiente"); break;
            case 6:
                System.out.println("Bien"); break;
            case 7:
            case 8:
                System.out.println("Notable"); break;
            case 9:
            case 10:
                System.out.println("Sobresaliente"); break;


        }
        System.out.println(media);


    }
}
