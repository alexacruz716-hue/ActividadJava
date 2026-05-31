import java.util.Scanner;

public class ComparacionCadenas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = sc.nextLine();

        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = sc.nextLine();

        if (cadena1.length() == cadena2.length()) {
            System.out.println("Las cadenas tienen la misma longitud.");
        } else {
            System.out.println("Las cadenas tienen diferente longitud.");
        }

        if (cadena1.equals(cadena2)) {
            System.out.println("El contenido de las cadenas es igual.");
        } else {
            System.out.println("El contenido de las cadenas es diferente.");
        }

        sc.close();
    }
}