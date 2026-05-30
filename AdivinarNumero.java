import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intento;

        System.out.println("Adivina el número entre 1 y 100:");

        do {
            System.out.print("Ingrese su intento: ");
            intento = sc.nextInt();

            if (intento > numeroSecreto) {
                System.out.println("Demasiado alto.");
            } else if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo.");
            } else {
                System.out.println("¡Correcto! Adivinaste el número.");
            }

        } while (intento != numeroSecreto);

        sc.close();
    }
}