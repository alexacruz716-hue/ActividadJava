import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad, numero;
        int positivos = 0, negativos = 0, ceros = 0;

        System.out.print("¿Cuántos números desea ingresar?: ");
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Números mayores que 0: " + positivos);
        System.out.println("Números menores que 0: " + negativos);
        System.out.println("Números iguales a 0: " + ceros);

        sc.close();
    }
}