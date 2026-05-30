import java.util.Scanner;

public class VocalesConsonantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letra;

        do {
            System.out.print("Ingrese una letra o espacio para terminar: ");
            String entrada = sc.nextLine();

            if (entrada.equals(" ")) {
                break;
            }

            letra = entrada.charAt(0);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.println("Es una vocal.");
            } else {
                System.out.println("Es una consonante.");
            }

        } while (true);

        System.out.println("Programa finalizado.");

        sc.close();
    }
}