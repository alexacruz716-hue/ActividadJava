import java.util.Scanner;

public class Palindromo {

    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replace(" ", "");

        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        return texto.equals(invertida);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String texto = sc.nextLine();

        if (esPalindromo(texto)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es palíndromo.");
        }
    }
}