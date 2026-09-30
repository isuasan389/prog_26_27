package U1.Tarea5b;

import java.util.Scanner;

public class ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un dia de la semana: ");
        String diadelasemana = teclado.nextLine();

        switch (diadelasemana) {
            case "Lunes": System.out.println("El lunes a primera tocara base de datos."); break;
            case "Martes": System.out.println("El martes a primera tocara lenguaje de marcas"); break;
            case "Miércoles":
            case "Miercoles":
                System.out.println("El miercoles a primera tocara Entornos de desarrollo "); break;
            case "Jueves": System.out.println("El jueves a primera tocara Sistemas informaticos:"); break;
            case "Viernes": System.out.println ("El viernes a primera tocara IPE I"); break;
            case "Sábado":
            case "Sabado":
                System.out.println("El sabado no hay clases"); break;
            case "Domingo": System.out.println("Ese dia se descansa tambien"); break;

        }
    }
}
