import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en pesos mexicanos: ");
        double pesos = sc.nextDouble();

        System.out.println("\n1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");

        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();

        double resultado = 0;

        switch(opcion) {
            case 1: resultado = pesos / 18.5; break;
            case 2: resultado = pesos / 20.5; break;
            case 3: resultado = pesos * 1.80; break;
            case 4: resultado = pesos * 8.20; break;
            case 5: resultado = pesos * 73.00; break;
            case 6: resultado = pesos / 12.0; break;
            case 7: resultado = pesos / 5.0; break;
            case 8: resultado = pesos / 13.5; break;
            case 9: resultado = pesos * 2.0; break;
            case 10: resultado = pesos * 55.0; break;
            default:
                System.out.println("Opción no válida.");
                sc.close();
                return;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}