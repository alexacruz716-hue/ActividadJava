import java.util.Scanner;

public class InformacionTema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. BTS");
        System.out.println("2. Naruto");
        System.out.println("3. Java");
        System.out.println("4. Tesla");
        System.out.println("5. México");

        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();

        switch(opcion) {

            case 1:
                System.out.println("BTS es una agrupación surcoreana formada por siete integrantes.");
                break;

            case 2:
                System.out.println("Naruto es un anime y manga creado por Masashi Kishimoto.");
                break;

            case 3:
                System.out.println("Java es un lenguaje de programación orientado a objetos.");
                break;

            case 4:
                System.out.println("Tesla es una empresa dedicada a vehículos eléctricos.");
                break;

            case 5:
                System.out.println("México es un país ubicado en América del Norte.");
                break;

            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}