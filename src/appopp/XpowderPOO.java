package appopp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XpowderPOO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Protein> listaProteinas = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            Protein protein = new Protein();

            System.out.println("Ingrese el nombre de la proteina:");
            protein.setNombre(scanner.nextLine());

            System.out.println("Ingrese la cantidad de aminoacidos:");
            protein.setAminoacidos(Double.parseDouble(scanner.nextLine()));

            boolean respuestaCarbohidratosValida = false;
            while (!respuestaCarbohidratosValida) {
                System.out.println("¿Contiene carbohidratos? (si/no)");
                String respuestaCarbohidratos = scanner.nextLine().toLowerCase();

                if (respuestaCarbohidratos.equals("si") || respuestaCarbohidratos.equals("s")) {
                    protein.setCarbohidratos(true);
                    respuestaCarbohidratosValida = true;
                } else if (respuestaCarbohidratos.equals("no") || respuestaCarbohidratos.equals("n")) {
                    protein.setCarbohidratos(false);
                    respuestaCarbohidratosValida = true;
                } else {
                    System.out.println("Respuesta invalida. Por favor, ingrese 'si' o 'no'.");
                }
            }

            System.out.println("Ingrese el sabor de la proteina:");
            protein.setSabor(scanner.nextLine());

            listaProteinas.add(protein);

            System.out.println("Proteina creada exitosamente.");

            boolean respuestaContinuarValida = false;
            while (!respuestaContinuarValida) {
                System.out.println("¿Desea crear otra proteina? (si/no)");
                String respuestaContinuar = scanner.nextLine().toLowerCase();

                if (respuestaContinuar.equals("si") || respuestaContinuar.equals("s")) {
                    respuestaContinuarValida = true;
                } else if (respuestaContinuar.equals("no") || respuestaContinuar.equals("n")) {
                    respuestaContinuarValida = true;
                    continuar = false;
                } else {
                    System.out.println("Respuesta invalida. Por favor, ingrese 'si' o 'no'.");
                }
            }
        }

        System.out.println("Lista de proteinas creadas:");
        for (Protein protein : listaProteinas) {
            System.out.println("Nombre: " + protein.getNombre());
            System.out.println("Aminoácidos: " + protein.getAminoacidos());
            System.out.println("Carbohidratos: " + protein.getCarbohidratos());
            System.out.println("Sabor: " + protein.getSabor());
            System.out.println("---------------------------");
        }
        scanner.close();
    }
}
