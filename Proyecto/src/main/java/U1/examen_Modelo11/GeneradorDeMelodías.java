package U1.examen_Modelo11;

public class GeneradorDeMelodías {
    static void main(String[] args) {
// 1. Calculamos la longitud total de la melodía
// Queremos múltiplos de 4 entre 4 y 28.
// Generamos un número entre 1 y 7, y lo multiplicamos por 4.
        int longitudMelodia = ((int)(Math.random() * 7) + 1) * 4;

        String primeraNota = "";

// 2. Bucle para generar cada nota
        for (int i = 1; i <= longitudMelodia; i++) {

            String nota = "";
            int notaAleatoria = (int)(Math.random() * 7); // Genera de 0 a 6

            switch (notaAleatoria) {
                case 0: nota = "do"; break;
                case 1: nota = "re"; break;
                case 2: nota = "mi"; break;
                case 3: nota = "fa"; break;
                case 4: nota = "sol"; break;
                case 5: nota = "la"; break;
                case 6: nota = "si"; break;
            }

            // Guardamos la primera nota generada para poder repetirla al final
            if (i == 1) {
                primeraNota = nota;
            }

            // Si estamos en la última vuelta, forzamos a que la nota sea la primera
            if (i == longitudMelodia) {
                nota = primeraNota;
            }

            // Imprimimos la nota
            System.out.print(nota + " ");

            // 3. Controlamos las barras separadoras de compás
            // Cada 4 notas (múltiplo de 4) hay que poner una barra
            if (i % 4 == 0) {
                if (i == longitudMelodia) {
                    // Si es la última nota, cerramos con doble barra
                    System.out.print("||");
                } else {
                    // Si es un compás intermedio, barra simple
                    System.out.print("| ");
                }
            }
        }
        System.out.println(); // Salto de línea final

    }
}
