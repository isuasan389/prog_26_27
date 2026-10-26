package U1.examen_Modelo10;

import java.util.Scanner;

public class InsertarDígito {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = teclado.nextLong();

        System.out.print("Introduzca la posición donde quiere insertar: ");
        int posicion = teclado.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        int digito = teclado.nextInt();

// 1. Contar cuántos dígitos tiene el número original
        long aux = numero;
        int numDigitos = 0;
        while (aux > 0) {
            aux = aux / 10;
            numDigitos++;
        }

// 2. Calcular cuántos dígitos se quedan a la derecha del "corte"
        int digitosDerecha = numDigitos - posicion + 1;

// 3. Crear el divisor para partir el número
        long divisor = 1;
        for (int i = 0; i < digitosDerecha; i++) {
            divisor = divisor * 10;
        }

// 4. Extraer las dos partes
        long parteIzquierda = numero / divisor;
        long parteDerecha = numero % divisor;

// 5. Montar el nuevo número: (Izquierda * 10 + digito) * divisor + Derecha
        long resultado = (parteIzquierda * 10 + digito) * divisor + parteDerecha;

        System.out.println("El número resultante es " + resultado + ".");
    }
}
