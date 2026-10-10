package U1.Tarea8a;

import java.util.Scanner;

public class ejercicio9 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int alturaMax = 0;
        int etiquetaMax = 0;
        int etiqueta = 0;

        System.out.println("Introduce la altura de un arbol en cm (-1 para terminar): ");
        int cms = teclado.nextInt();


        while(cms != -1) {

            if (cms > alturaMax) {
                alturaMax = cms;
                etiquetaMax = etiqueta;
            }
            etiqueta++;

            System.out.println("Introduce la altura del arbol en cm (-1 para terminar)");
            cms = teclado.nextInt();
        }
        System.out.println("El arbol mas alto es el arbol " + etiquetaMax + " con " + alturaMax + " cm. ");


    }
}