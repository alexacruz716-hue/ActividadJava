import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double num1, num2, num3, promedio;

        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        num3 = teclado.nextDouble();

        promedio = (num1 + num2 + num3) / 3;

        System.out.println("El promedio es: " + promedio);

        teclado.close();
    }
}