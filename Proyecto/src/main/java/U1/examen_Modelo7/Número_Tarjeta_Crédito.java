package U1.examen_Modelo7;

import java.util.Scanner;

public class Número_Tarjeta_Crédito {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de cuenta:");
        String cuenta = teclado.nextLine();

        boolean valido = true;

// 1. Comprobamos la longitud total del String
// 4 (entidad) + 1 (-) + 4 (sucursal) + 1 (-) + 2 (control) + 1 (-) + 10 (cuenta) = 23 caracteres
        if (cuenta.length() != 23) {
            valido = false;
        } else {
            // 2. Comprobamos que los guiones y los números estén en su sitio
            for (int i = 0; i < cuenta.length(); i++) {
                char c = cuenta.charAt(i);
                // Posiciones donde deben ir los guiones
                if (i == 4 || i == 9 || i == 12) {
                    if (c != '-') {
                        valido = false;
                        break;
                    }
                } else {
                    // El resto deben ser números
                    if (c < '0' || c > '9') {
                        valido = false;
                        break;
                    }
                }
            }

            // 3. Comprobamos que el banco sea ERESUNPRIMO (empiece por 2222)
            if (valido) {
                String entidad = cuenta.substring(0, 4);
                if (!entidad.equals("2222")) {
                    valido = false;
                }
            }

            // 4. Comprobamos que los 10 últimos números formen un número primo
            if (valido) {
                // Extraemos los últimos 10 caracteres a partir de la posición 13
                String ultimos10 = cuenta.substring(13);

                // Usamos Long en lugar de Integer porque un número de 10 dígitos
                // puede ser mayor que el máximo que soporta int (2.147.483.647)
                long numeroCuenta = Long.parseLong(ultimos10);

                boolean esPrimo = true;
                if (numeroCuenta < 2) {
                    esPrimo = false;
                } else {
                    // Un truco de rendimiento básico para buscar primos:
                    // iterar solo hasta la raíz cuadrada del número (i * i <= numeroCuenta)
                    for (long i = 2; i * i <= numeroCuenta; i++) {
                        if (numeroCuenta % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }

                if (!esPrimo) {
                    valido = false;
                }
            }
        }

// 5. Resultado final
        if (valido) {
            System.out.println("Es un número de cuenta válido.");
        } else {
            System.out.println("No es un número de cuenta válido.");
        }
    }
}
