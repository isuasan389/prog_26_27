package U1.examen_Modelo7;

import java.util.Scanner;

public class probparejainfiel {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int puntos = 0;
        String respuesta;

// 1. Guardamos todas las preguntas en un array (vector) de textos para no repetir código
        String[] preguntas = {
                "1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.",
                "2. Ha aumentado sus gastos de vestuario",
                "3. Ha perdido el interés que mostraba anteriormente por ti",
                "4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia ( si es mujer)",
                "5. No te deja que mires la agenda de su teléfono móvil",
                "6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante",
                "7. Últimamente, se preocupa más en cuidar la línea y/o estar bronceado/a",
                "8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo",
                "9. Has notado que últimamente se perfuma más",
                "10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo"
        };

        System.out.println("Test de infidelidad. Por favor, contesta con 'verdadero' o 'falso':\n");

// 2. Recorremos el array de preguntas con un bucle
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(preguntas[i]);
            respuesta = teclado.nextLine();

            // Si la respuesta es "verdadero" (ignorando mayúsculas/minúsculas), sumamos 3 puntos
            if (respuesta.equalsIgnoreCase("verdadero")) {
                puntos += 3;
            }
        }

        System.out.println("\n--- RESULTADO (Puntos: " + puntos + ") ---");

// 3. Comprobamos la puntuación obtenida mediante condicionales
        if (puntos >= 0 && puntos <= 10) {
            System.out.println("Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if (puntos >= 11 && puntos <= 22) {
            System.out.println("Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (puntos > 22 && puntos <= 30) {
            System.out.println("Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}
