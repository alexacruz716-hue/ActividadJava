import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        double num1, num2, resultado;
        char continuar;

        do {
            System.out.println("----- CALCULADORA -----");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            System.out.print("Ingrese el primer número: ");
            num1 = sc.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            num2 = sc.nextDouble();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            System.out.print("¿Desea continuar? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa finalizado.");

        sc.close();
    }
}