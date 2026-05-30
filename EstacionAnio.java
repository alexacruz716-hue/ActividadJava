import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Invierno");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Primavera");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Verano");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Otoño");
                break;

            default:
                System.out.println("Mes inválido");
        }

        sc.close();
    }
}