import java.util.Scanner;

public class Main {
    /**
     * Reto #2: EL PARTIDO DE TENIS
     * <p>
     * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
     * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
     * gane cada punto del juego.
     * <p>
     * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
     * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
     * 15 - Love
     * 30 - Love
     * 30 - 15
     * 30 - 30
     * 40 - 30
     * Deuce
     * Ventaja P1
     * Ha ganado el P1
     * - Si quieres, puedes controlar errores en la entrada de datos.
     * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.
     */

    public static boolean noHayGanador = true;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Partido de Tenis");
        System.out.println("=======================================");

        int puntaje1p = 0, puntaje2p = 0;

        do {
            System.out.println("Ingrese quién ganó puntos: P1 o P2");
            String player = scanner.nextLine();

            if (player.equals("P1")) {
                puntaje1p += 1;

            } else if (player.equals("P2")) {
                puntaje2p += 1;

            } else {
                System.out.println("Dato ingresado incorrecto");
            }

            if (puntaje1p == 5 || puntaje2p == 5) {
                noHayGanador = false;
            }

            resultado(puntaje1p, puntaje2p);
        } while (noHayGanador);
    }

    public static void resultado(int puntaje1p, int puntaje2p) {

        String resultadop1 = "";
        String resultadop2 = "";
        String resultadoTotal = "";

        if (puntaje1p == 3 && puntaje2p == 3) {
            resultadoTotal = "Deuce";
            System.out.println(resultadoTotal);
            System.out.println();
            return;
        }

        if (puntaje1p == 0) {
            resultadop1 = "Love";
        }

        if (puntaje2p == 0) {
            resultadop2 = "Love";
        }

        if (puntaje1p == 1) {
            resultadop1 = "15";
        }

        if (puntaje2p == 1) {
            resultadop2 = "15";
        }

        if (puntaje1p == 2) {
            resultadop1 = "30";
        }

        if (puntaje2p == 2) {
            resultadop2 = "30";
        }

        if (puntaje1p == 3) {
            resultadop1 = "40";
        }

        if (puntaje2p == 3) {
            resultadop2 = "40";
        }

        if (puntaje1p == 4) {
            resultadoTotal = "Ventaja P1";
            System.out.println(resultadoTotal);
            System.out.println();
            return;
        }

        if (puntaje2p == 4) {
            resultadoTotal = "Ventaja P2";
            System.out.println(resultadoTotal);
            System.out.println();
            return;
        }

        if (puntaje1p == 5) {
            resultadoTotal = "Ha ganado P1";
            System.out.println(resultadoTotal);
            System.out.println();
            return;
        }

        if (puntaje2p == 5) {
            resultadoTotal = "Ha ganado P2";
            System.out.println(resultadoTotal);
            System.out.println();
            return;
        }

        resultadoTotal = resultadop1 + " - " + resultadop2;
        System.out.println(resultadoTotal);
        System.out.println();
    }
}