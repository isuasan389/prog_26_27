package U1.ENTREGABLE_PRUEBA_EXAMEN;

import java.util.Scanner;

public class TaxiVeloz {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a Taxi Veloz");
        System.out.print("Kilómetros recorridos: ");
        double km = teclado.nextDouble();

        System.out.print("Hora de inicio (0-23): ");
        int hora = teclado.nextInt();

// Si la hora es inválida, mostramos error y evitamos el resto de la lógica con un bloque else
        if (hora < 0 || hora > 23) {
            System.out.println("Error: la hora introducida no es correcta.");
        } else {
            System.out.print("¿Es festivo? (1=sí, 2=no): ");
            int festivo = teclado.nextInt();

            System.out.print("¿Carrera al aeropuerto? (1=sí, 2=no): ");
            int aeropuerto = teclado.nextInt();

            // 1. Determinar el tipo de tarifa
            boolean esNocturna = false;
            if (hora >= 22 || hora <= 6 || festivo == 1) {
                esNocturna = true;
            }

            // 2. Establecer precios
            double tarifaBajada = esNocturna ? 3.50 : 2.50;
            double tarifaKm = esNocturna ? 1.30 : 1.10;

            // 3. Calcular importe parcial (bajada + km)
            double importeRecorrido = km * tarifaKm;
            double subtotal = tarifaBajada + importeRecorrido;
            boolean cobraMinimo = false;

            if (subtotal < 7.00) {
                subtotal = 7.00;
                cobraMinimo = true;
            }

            // 4. Añadir aeropuerto si procede
            double suplemento = (aeropuerto == 1) ? 5.00 : 0.00;
            double total = subtotal + suplemento;

            // 5. Imprimir factura
            System.out.println();
            System.out.println("Tarifa aplicada: " + (esNocturna ? "nocturna" : "diurna"));
            System.out.printf("Bajada de bandera: %.2f €\n", tarifaBajada);
            System.out.printf("Recorrido (%.1f km): %.2f €\n", km, importeRecorrido);

            if (cobraMinimo) {
                System.out.println("Se aplica la tarifa mínima de 7,00 €");
            }

            System.out.printf("Suplemento aeropuerto: %.2f €\n", suplemento);
            System.out.printf("Total a pagar: %.2f €\n", total);
        }
    }
}
