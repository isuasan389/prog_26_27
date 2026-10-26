package U1.examen_Modelo11;

public class LíneasAleatorias {
    static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            // 1. Longitud aleatoria entre 1 y 40
            // Math.random() genera un decimal entre 0.0 y 0.999
            int longitud = (int)(Math.random() * 40) + 1;

            // 2. Carácter aleatorio (6 opciones: del 0 al 5)
            int tipoCaracter = (int)(Math.random() * 6);
            char c = ' ';

            switch (tipoCaracter) {
                case 0: c = '*'; break;
                case 1: c = '-'; break;
                case 2: c = '='; break;
                case 3: c = '.'; break;
                case 4: c = '|'; break;
                case 5: c = '@'; break;
            }

            // 3. Imprimir la línea con la longitud y el carácter elegido
            for (int j = 0; j < longitud; j++) {
                System.out.print(c);
            }

            System.out.println(); // Salto de línea
        }
    }
}
