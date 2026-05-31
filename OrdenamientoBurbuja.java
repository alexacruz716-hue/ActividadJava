import java.util.Scanner;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números desea ingresar?: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = 0; j < numeros.length - 1 - i; j++) {

                if (numeros[j] > numeros[j + 1]) {

                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        System.out.println("\nArreglo ordenado en forma ascendente:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}