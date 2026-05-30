import java.util.Scanner;

public class ContarLetraA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        System.out.println("La letra 'a' aparece " + contador + " veces.");

        sc.close();
    }
}