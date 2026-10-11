package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio12 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int notas = 0;
        int suspensos = 0;


        while (notas < 5) {
            System.out.println("Introduce una calificacion de un alumno: ");
            int calificacion = teclado.nextInt();


            if (calificacion < 5) {
                suspensos++;
            }
            notas++;
            }
        if (suspensos > 0) {
            System.out.println("Hay algun suspenso. ");
        } else {
            System.out.println("No hay suspensos. ");

        }
        }
    }