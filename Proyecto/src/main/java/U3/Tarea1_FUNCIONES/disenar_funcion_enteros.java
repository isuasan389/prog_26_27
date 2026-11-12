package U3.Tarea1_FUNCIONES;

public class disenar_funcion_enteros {

    public static void imprimir (int numero1, int numero2) {
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        if (mayor - menor <= 1) {
            System.out.println("No hay numeros enteros comprendidos entre ellos.");
            return;
        }

        for (int i = menor + 1; i < mayor; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}