import java.util.Scanner;

public class VerificarEdad {

    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (puedeVotar(edad)) {
            System.out.println("Puede votar.");
        } else {
            System.out.println("No puede votar.");
        }
    }
}