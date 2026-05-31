import java.util.Scanner;

public class ConvertirNombres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;

        do {

            System.out.print("Ingrese un nombre en minúsculas (o 'salir'): ");
            nombre = sc.nextLine();

            if (!nombre.equalsIgnoreCase("salir")) {
                System.out.println("Nombre en mayúsculas: "
                        + nombre.toUpperCase());
            }

        } while (!nombre.equalsIgnoreCase("salir"));

        System.out.println("Programa finalizado.");

        sc.close();
    }
}