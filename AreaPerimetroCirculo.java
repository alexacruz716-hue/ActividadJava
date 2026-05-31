import java.util.Scanner;

public class AreaPerimetroCirculo {

    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}