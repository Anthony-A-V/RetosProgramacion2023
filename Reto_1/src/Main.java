import java.util.Scanner;

public class Main {
    /**
     * Reto #1: EL "LENGUAJE HACKER"
     * <p>
     * Escribe un programa que reciba un texto y transforme lenguaje natural a
     * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
     * se caracteriza por sustituir caracteres alfanuméricos.
     * - Utiliza esta tabla (<a href="https://www.gamehouse.com/blog/leet-speak-cheat-sheet/">
     * https://www.gamehouse.com/blog/leet-speak-cheat-sheet/</a>)
     * con el alfabeto y los números en "leet".
     * (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
     */
    public static void main(String[] args) {

        System.out.println("Ingrese un texto:");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        System.out.println("Texto en lenguaje hacker:");
        System.out.println(lenguajeHacker(texto.toUpperCase()));
    }

    public static String lenguajeHacker(String texto) {

        StringBuilder cadena = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {

            char caracter = texto.charAt(i);

            switch (caracter) {
                case 'A' -> cadena.append("4");
                case 'B' -> cadena.append("I3");
                case 'C' -> cadena.append("[");
                case 'D' -> cadena.append(")");
                case 'E' -> cadena.append("3");
                case 'F' -> cadena.append("|=");
                case 'G' -> cadena.append("&");
                case 'H' -> cadena.append("#");
                case 'I' -> cadena.append("1");
                case 'J' -> cadena.append(",_|");
                case 'K' -> cadena.append(">|");
                case 'L' -> cadena.append("1");
                case 'M' -> cadena.append("/\\/\\");
                case 'N' -> cadena.append("^/");
                case 'O' -> cadena.append("0");
                case 'P' -> cadena.append("|*");
                case 'Q' -> cadena.append("(_,)");
                case 'R' -> cadena.append("I2");
                case 'S' -> cadena.append("5");
                case 'T' -> cadena.append("7");
                case 'U' -> cadena.append("(_)");
                case 'V' -> cadena.append("\\/");
                case 'W' -> cadena.append("\\/\\/");
                case 'X' -> cadena.append("><");
                case 'Y' -> cadena.append("j");
                case 'Z' -> cadena.append("2");
                case '1' -> cadena.append("L");
                case '2' -> cadena.append("R");
                case '3' -> cadena.append("E");
                case '4' -> cadena.append("A");
                case '5' -> cadena.append("S");
                case '6' -> cadena.append("b");
                case '7' -> cadena.append("T");
                case '8' -> cadena.append("B");
                case '9' -> cadena.append("g");
                case '0' -> cadena.append("o");
                case ' ' -> cadena.append(" ");
            }
        }
        return cadena.toString();
    }
}