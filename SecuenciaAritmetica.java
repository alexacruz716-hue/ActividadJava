import java.util.Scanner;

public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero = sc.nextInt();

        System.out.print("Ingrese la diferencia: ");
        int diferencia = sc.nextInt();

        System.out.print("Ingrese el número máximo: ");
        int maximo = sc.nextInt();

        System.out.println("Secuencia aritmética:");

        do {
            System.out.println(numero);
            numero = numero + diferencia;
        } while (numero <= maximo);

        sc.close();
    }
}