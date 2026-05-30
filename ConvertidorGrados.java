import java.util.Scanner;

public class ConvertidorGrados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        System.out.println("\n1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();

        switch(opcion) {

            case 1:
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
                break;

            case 2:
                double kelvin = celsius + 273.15;
                System.out.println("Temperatura en Kelvin: " + kelvin);
                break;

            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}