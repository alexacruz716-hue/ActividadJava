import java.util.Scanner;

public class ManipulacionTexto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un texto:");
        String texto = sc.nextLine().toLowerCase();

        String palabra = "ingeniería";

        int contador = 0;
        int posicion = 0;

        while ((posicion = texto.indexOf(palabra, posicion)) != -1) {
            contador++;
            posicion += palabra.length();
        }

        System.out.println("La palabra 'ingeniería' aparece "
                + contador + " veces.");

        sc.close();
    }
}