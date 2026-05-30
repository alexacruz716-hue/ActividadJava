import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Ingrese su peso en kilogramos: ");
        peso = teclado.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        altura = teclado.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Su IMC es: " + imc);

        teclado.close();
    }
}