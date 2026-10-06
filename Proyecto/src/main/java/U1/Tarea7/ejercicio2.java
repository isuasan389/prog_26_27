package U1.Tarea7;

public class ejercicio2 {
    static void main(String[] args) {
        int edad = 20;
        int nivel_de_estudios = 3;
        int ingresos = 0;

        boolean jasp = edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000;
        System.out.println("Si los datos proporcionados son los correctos es: " + jasp);
    }
}
