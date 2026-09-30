package U1.Tarea5b;


import java.time.LocalTime;
import java.util.Scanner;

public class ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime una hora?:");
        LocalTime horaActual = null;
        int hora = teclado.nextInt();

        String saludo;

        //Buenos dias: DE 6 A 12

        if (hora >= 6 && hora <= 12) {
            saludo = "Buenos dias";

            //Buenas tardes: DE 13 A 20

        } else if (hora >= 13 && hora <= 20) {
            saludo = "buenas tardes";

        } else {
            saludo = "Buenas noches";
        }
            System.out.println(saludo);






    }
}
