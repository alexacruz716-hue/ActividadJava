import java.util.Scanner;

public class SecuenciaCuadrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();

        int i = 1;

        System.out.println("Cuadrados desde 1 hasta " + numero + ":");

        do {
            System.out.println(i + "² = " + (i * i));
            i++;
        } while (i <= numero);

        sc.close();
    }
}