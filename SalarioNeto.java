import java.util.Scanner;

public class SalarioNeto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double salarioBruto;
        double porcentajeImpuesto;
        double deducciones;
        double impuesto;
        double salarioNeto;

        System.out.print("Ingrese el salario bruto mensual: ");
        salarioBruto = teclado.nextDouble();

        System.out.print("Ingrese el porcentaje de impuestos: ");
        porcentajeImpuesto = teclado.nextDouble();

        System.out.print("Ingrese las deducciones adicionales: ");
        deducciones = teclado.nextDouble();

        impuesto = salarioBruto * (porcentajeImpuesto / 100);

        salarioNeto = salarioBruto - impuesto - deducciones;

        System.out.println("Impuesto calculado: $" + impuesto);
        System.out.println("Salario neto: $" + salarioNeto);

        teclado.close();
    }
}