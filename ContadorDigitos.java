import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int contador = 0;
        int auxiliar = Math.abs(numero);

        if (auxiliar == 0) {
            contador = 1;
        } else {
            while (auxiliar > 0) {
                auxiliar = auxiliar / 10;
                contador++;
            }
        }

        System.out.println("El número tiene " + contador + " dígitos.");

        sc.close();
    }
}