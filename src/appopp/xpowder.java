package appopp;

import java.util.ArrayList;
import java.util.Scanner;

public class xpowder {

    public static void main(String[] args) {

        ArrayList<String> nombresProductos = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();
        double subtotal = 0;
        double total = 0;

        System.out.println("Bienvenido a la tienda de suplementos deportivos");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos a comprar (maximo 4): ");
        int cantidadProductos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            String nombreProducto = scanner.nextLine();
            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            double precio = Double.parseDouble(scanner.nextLine());

            nombresProductos.add(nombreProducto);
            precios.add(precio);
        }

        System.out.println("Listo, ahora vamos a realizar la compra:");

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese la cantidad de " + nombresProductos.get(i) + ": ");
            int cantidad = Integer.parseInt(scanner.nextLine());
            subtotal += precios.get(i) * cantidad;
        }

        total = subtotal + (subtotal * 0.07);

        System.out.println("El subtotal es: " + subtotal);
        System.out.println("El total a pagar es: " + total);
    }
}
