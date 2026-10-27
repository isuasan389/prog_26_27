package U1.EXAMEN;
import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Alquiler de bicicletas Pedalea Facil");
        System.out.print("Tipo de bicicletas: (1=Urbana, 2=Montaña, 3=Eléctrica):");


        double tipo_bicicleta = teclado.nextDouble();

        System.out.print("Numero de horas: ");
        int hora = teclado.nextInt();

// Si la hora es inválida, enseñamos el error y evitamos la logica con un else.
        if (hora < 0 || hora > 23) {
            System.out.println("Error: la hora introducida no es correcta.");
        } else {
            System.out.print("¿Es fin de semana? (1=sí, 2=no): ");
            int fin_de_semana = teclado.nextInt();

            System.out.print("¿Quiere casco? (1=sí, 2=no): ");
            int casco = teclado.nextInt();

            System.out.print("¿Es socio? (1=sí, 2=no): ");
            int socio = teclado.nextInt();

            // 1. Determinamos el tipo de tarifa
            boolean horas = false;
            boolean Diacompleto = false;
            if (hora >= 23 || hora <= 6 || fin_de_semana == 1) {
                Diacompleto = true;

            }

            // 2. Establecer precios
            double Alquiler = Diacompleto ? 15.00 : 00.00;
            double Recargo_fin_de_semana = Diacompleto ? 00.00 : 00.00;
            double Casco = Diacompleto ? 2.00 : 00.00;
            double Descuento_Socio = 00.00;
            double Total_a_pagar;
        }
    }
}
