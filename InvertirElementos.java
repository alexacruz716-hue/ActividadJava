import java.util.Scanner;

public class InvertirElementos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Arreglo invertido:");

        for (int i = 5; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}