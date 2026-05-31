import java.time.LocalDate;
import java.util.Scanner;

public class ConversionFechas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una fecha (YYYY-MM-DD): ");
        String fechaTexto = sc.nextLine();

        LocalDate fecha = LocalDate.parse(fechaTexto);

        System.out.println("Fecha ingresada: " + fecha);
        System.out.println("Una semana después: " + fecha.plusWeeks(1));
        System.out.println("Un mes antes: " + fecha.minusMonths(1));

        sc.close();
    }
}