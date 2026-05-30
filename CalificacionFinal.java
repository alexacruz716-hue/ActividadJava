import java.util.Scanner;

public class CalificacionFinal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double parciales, proyecto, examen, calificacionFinal;

        System.out.print("Ingrese la calificación de parciales: ");
        parciales = sc.nextDouble();

        System.out.print("Ingrese la calificación del proyecto: ");
        proyecto = sc.nextDouble();

        System.out.print("Ingrese la calificación del examen final: ");
        examen = sc.nextDouble();

        if (parciales < 0 || parciales > 100 ||
            proyecto < 0 || proyecto > 100 ||
            examen < 0 || examen > 100) {

            System.out.println("Error: Las calificaciones deben estar entre 0 y 100.");

        } else {

            calificacionFinal = (parciales * 0.40)
                              + (proyecto * 0.30)
                              + (examen * 0.30);

            System.out.println("Calificación final: " + calificacionFinal);
        }

        sc.close();
    }
}