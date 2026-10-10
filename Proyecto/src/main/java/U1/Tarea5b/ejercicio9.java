package U1.Tarea5b;

import java.util.Scanner;

public class ejercicio9 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el mes de nacimiento (1-12): ");
        int mes = teclado.nextInt();

        System.out.println("Introduce el dia de nacimiento: ");
        int dia = teclado.nextInt();

        String signo = teclado.nextLine();

        switch (mes) {
            case 1: signo = (dia <= 20) ? "Capricornio" : "Acuario";
                break;
            case 2: signo = (dia <= 19) ? "Acuario" : "Piscis";
                break;
            case 3: signo = (dia <= 20) ? "Piscis" : "Aries";
                break;
            case 4: signo = (dia <= 20) ? "Aries" : "Tauro";
                break;
            case 5: signo = (dia <= 20) ? "Tauro" : "Geminis";
                break;
            case 6: signo = (dia <= 20) ? "Geminis" : "Cancer";
                break;
            case 7: signo = (dia <= 22) ? "Cancer" : "Leo";
                break;
            case 8: signo = (dia <= 23) ? "Leo" : "Virgo";
                break;
            case 9: signo = (dia <= 22) ? "Virgo" : "Libra";
                break;
            case 10: signo = (dia <= 22) ? "Libra" : "Escorpio";
                break;
            case 11: signo = (dia <= 21) ? "Escorpio" : "Sagitario";
                break;
            case 12: signo = (dia <= 21) ? "Sagitario" : "Capricornio";
                break;
            default:
                signo = "Mes no valido";

        }
        System.out.println("Tu signo del zodiaco es " + signo);
    }
}
