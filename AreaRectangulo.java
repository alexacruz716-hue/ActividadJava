import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        System.out.print("Ingrese la base del rectángulo: ");
        base = teclado.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        altura = teclado.nextDouble();

        area = base * altura;

        System.out.println("El área del rectángulo es: " + area);

        teclado.close();
    }
}