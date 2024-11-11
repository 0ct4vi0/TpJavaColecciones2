package org.example;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class menuRestaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        ArrayList<Plato> platoMenu = new ArrayList<>();

//--------inicio del primer bucle---------------------------------------------------------------------------------------

        while (true) {
            System.out.println("ingrese los datos del plato");
            System.out.println("-----------------------------");
            System.out.println("ingrese el nombre del plato o ¨fin¨ para terminar el programa: ");
            String nom = sc.nextLine();

            if (nom.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.println("ingrese el precio del plato: ");
            int pre = sc.nextInt();
            sc.nextLine();

            System.out.println("es una bebida? S/N");
            boolean bebida = sc.nextLine().equalsIgnoreCase("s") || sc.nextLine().equalsIgnoreCase("S");

            Plato plato = new Plato(nom, pre, bebida);

// inicio el bucle si el usuario no ingreso una bebida------------------------------------------------------------------
            if (!bebida) {
                System.out.println("ingrese la cantidad de ingredientes");
                int cant= sc.nextInt();
                sc.nextLine();
                for (int i=0; i < cant; i++){
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("ingrese el nombre del ingrediente: ");
                    String nomIng = sc.nextLine();

                    System.out.print("Ingrese la cantidad: ");
                    double cantidad = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Ingrese la unidad de medida: ");
                    String unidadMedida = sc.next();

                    Ingrediente ing = new Ingrediente(nomIng, cantidad, unidadMedida);
                    plato.agregarIngrediente(ing);
                }
            } else {
                System.out.println("\n ------ MENU ------ ");
                System.out.println(" " + nom);
                System.out.println(" Precio: $" + pre);
                System.out.println("-----------------------");
            }
            platoMenu.add(plato);
        }
        System.out.println("-----------MENÚ----------------");
        for (Plato plato : platoMenu) {
            System.out.println(plato.getNombreCompleto());
            System.out.println("Precio: $ " + plato.getPrecio());
            System.out.println("Ingredientes:");
            System.out.println("Nombre\tCantidad\tUnidad de Medida");
            for (Ingrediente ing : plato.getIngrediente()) {
                System.out.println(ing.getNombre() + "\t" + ing.getCantidad() + "\t" + ing.getUnidadMedida());
            }
            System.out.println("----------------------------------");
        }
    }
}
