import java.util.Scanner;

public class PrecioDescuento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precio, descuento, precioFinal;

        System.out.print("Ingrese el precio del producto: ");
        precio = sc.nextDouble();

        if (precio <= 100) {
            descuento = 0;
        } else if (precio <= 200) {
            descuento = precio * 0.10;
        } else if (precio <= 500) {
            descuento = precio * 0.20;
        } else {
            descuento = precio * 0.25;
        }

        precioFinal = precio - descuento;

        System.out.println("Descuento: $" + descuento);
        System.out.println("Precio final: $" + precioFinal);

        sc.close();
    }
}