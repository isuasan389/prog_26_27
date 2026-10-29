package U1.JUEGOS;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JUEGO1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("LA PUERTA MALDITA");
        System.out.println("------------------");
        System.out.println();

        System.out.println("2:17 AM. Estás en tu casa, y tu telefono empieza a sonar... ");
        System.out.println("1.Contestar la llamada");
        System.out.println("2.Rechazar la llamada");
        System.out.println("¿Que quieres hacer?: ");
        int decision = teclado.nextInt();
        //PRIMERA DECISION
        if (decision == 1) {
            System.out.println("Alguien susurra tu nombre mientras golpean fuertemente la puerta extraña que nunca decidiste abrir en tu casa...");
            System.out.println("Te acercas a la puerta con miedo.");
        } else if (decision == 2) {
            System.out.println("Se apagan las luces de tu casa de manera extraña.");
        } else {
            System.out.println("Esa opcion no es válida.");
        //SEGUNDA DECISIÓN
        }
        System.out.println();

        if (decision == 1) {
            System.out.println("1. Abrir la puerta.");
            System.out.println("2. Esconderte.");
            System.out.println("3. Escapar por el garaje.");
            decision = teclado.nextInt();
        } else if (decision == 2) {
            System.out.println("1. Te pones nervioso y escribes un mensaje a tus padres tras llamar a la policia.");
            System.out.println("2. Corres a tu cuarto y te metes en el armario");
            decision = teclado.nextInt();
        } else {
            System.out.println("Esa opción no es valida.");

        }
        System.out.println("FIN DEL JUEGO");
    }
}
