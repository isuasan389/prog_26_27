package U1.EntregableModelo3;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio3 {
    static void main(String[] args) {

                // Para que los decimales salgan con punto (8.00) y no con coma
                Locale.setDefault(Locale.US);
                Scanner teclado = new Scanner(System.in);

                System.out.println("Venta de entradas CineCampa");
                System.out.print("Número de entradas: ");
                int entradas = teclado.nextInt();
                System.out.print("Día de la semana: ");
                String dia = teclado.next().toLowerCase();
                System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
                char tarjeta = teclado.next().toLowerCase().charAt(0);

                double precioIndividual = 8;
                if (dia.equals("miercoles") || dia.equals("miércoles")) {
                    precioIndividual = 5;
                }

                double precioPareja = 11;
                int parejas = 0;
                int individuales = entradas;

                // Solo los jueves hay entradas de pareja
                if (dia.equals("jueves")) {
                    parejas = entradas / 2;
                    individuales = entradas % 2;
                }

                double total = parejas * precioPareja + individuales * precioIndividual;
                double descuento = 0;
                if (tarjeta == 's') {
                    descuento = total * 0.10;
                }
                double aPagar = total - descuento;

                System.out.println();
                System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
                if (parejas > 0) {
                    System.out.println("Entradas de parejas: " + parejas);
                    System.out.printf("Precio por entrada de pareja: %.2f €%n", precioPareja);
                }
                if (individuales > 0) {
                    System.out.println("Entradas individuales: " + individuales);
                    System.out.printf("Precio por entrada individual: %.2f €%n", precioIndividual);
                }
                System.out.printf("Total: %.2f €%n", total);
                System.out.printf("Descuento: %.2f €%n", descuento);
                System.out.printf("A pagar: %.2f €%n", aPagar);
            }
        }
