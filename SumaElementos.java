import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            suma += numeros[i];
        }

        System.out.println("La suma total es: " + suma);

        sc.close();
    }
}