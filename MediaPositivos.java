import java.util.Scanner;

public class MediaPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero, suma = 0, media;
        int contador = 0;

        System.out.println("Ingrese números positivos. Para terminar ingrese un número negativo.");

        while (true) {
            System.out.print("Ingrese un número: ");
            numero = sc.nextDouble();

            if (numero < 0) {
                break;
            }

            suma = suma + numero;
            contador++;
        }

        if (contador > 0) {
            media = suma / contador;
            System.out.println("La media de los números positivos es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        sc.close();
    }
}