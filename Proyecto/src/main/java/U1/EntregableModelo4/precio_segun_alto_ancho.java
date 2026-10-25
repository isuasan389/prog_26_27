package U1.EntregableModelo4;

import java.util.Scanner;

public class precio_segun_alto_ancho {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura de la bandera en cm: ");
        int altura = teclado.nextInt();

        System.out.print("Ahora introduzca la anchura: ");
        int anchura = teclado.nextInt();

        System.out.print("¿Quiere escudo bordado? (s/n): ");
        String escudo = teclado.next();

        int superficie = altura * anchura;
        double precioBandera = superficie * 0.01;
        double precioEscudo = 0;

        if (escudo.equals("s")) {
            precioEscudo = 2.50;
        }

        double envio = 3.25;
        double total = precioBandera + precioEscudo + envio;

        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.printf("Bandera de %d cm2: %.2f €%n", superficie, precioBandera);

        if (escudo.equals("s")) {
            System.out.printf("Con escudo: %.2f €%n", precioEscudo);
        } else {
            System.out.printf("Sin escudo: %.2f €%n", precioEscudo);
        }

        System.out.printf("Gastos de envío: %.2f €%n", envio);
        System.out.printf("Total: %.2f €%n", total);
    }
}
