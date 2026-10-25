package U1.EntregableModelo4;

public class barajafrancesa_al_azar {
    static void main(String[] args) {
        int palo = (int) (Math.random() * 4) + 1;
        int carta = (int) (Math.random() * 13) + 1;

        switch (palo) {
            case 1:
                System.out.println("Palo - picas");
                break;
            case 2:
                System.out.println("Palo - corazones");
                break;
            case 3:
                System.out.println("Palo - diamantes");
                break;
            case 4:
                System.out.println("Palo - tréboles");
                break;
        }

        if (carta == 1) {
            System.out.println("Carta: A");
        } else if (carta >= 2 && carta <= 10) {
            System.out.println("Carta: " + carta);
        } else if (carta == 11) {
            System.out.println("Carta: J");
        } else if (carta == 12) {
            System.out.println("Carta: Q");
        } else {
            System.out.println("Carta: K");
        }
    }
}
