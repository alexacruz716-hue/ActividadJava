import java.util.Scanner;

public class VerificarVoto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Es elegible para votar.");
        } else {
            System.out.println("No es elegible para votar.");
        }

        sc.close();
    }
}