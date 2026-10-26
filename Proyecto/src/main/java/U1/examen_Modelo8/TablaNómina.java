package U1.examen_Modelo8;

import java.util.Scanner;

public class TablaNómina {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

// 1. Pedida de datos
        System.out.print("Cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto): ");
        int cargo = teclado.nextInt();

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int diasViaje = teclado.nextInt();

        System.out.print("Estado civil (1 - Soltero, 2 - Casado): ");
        int estadoCivil = teclado.nextInt();

// 2. Cálculos según el cargo
        double sueldoBase = 0;
        if (cargo == 1) {
            sueldoBase = 950.00;
        } else if (cargo == 2) {
            sueldoBase = 1200.00;
        } else if (cargo == 3) {
            sueldoBase = 1600.00;
        }

// 3. Cálculos de dietas y sueldo bruto
        double dietas = diasViaje * 30.00;
        double sueldoBruto = sueldoBase + dietas;

// 4. Cálculos de IRPF según el estado civil
        int porcentajeIRPF = 0;
        if (estadoCivil == 1) {
            porcentajeIRPF = 25;
        } else if (estadoCivil == 2) {
            porcentajeIRPF = 20;
        }

        double retencion = (sueldoBruto * porcentajeIRPF) / 100;
        double sueldoNeto = sueldoBruto - retencion;

// 5. Impresión de la nómina tabulada usando printf
        System.out.println("---------------------------------");
        System.out.printf("| Sueldo base %17.2f |\n", sueldoBase);
        System.out.printf("| Dietas (%2d viajes) %11.2f |\n", diasViaje, dietas);
        System.out.println("---------------------------------");
        System.out.printf("| Sueldo bruto %16.2f |\n", sueldoBruto);
        System.out.printf("| Retención IRPF (%2d%%) %9.2f |\n", porcentajeIRPF, retencion);
        System.out.println("---------------------------------");
        System.out.printf("| Sueldo neto %17.2f |\n", sueldoNeto);
        System.out.println("---------------------------------");
    }
}
