package org.example;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class menuRestaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        ArrayList<Plato> platoMenu = new ArrayList<>();
        boolean esBebida;
//--------inicio del primer bucle---------------------
        while (true) {
            System.out.println("ingrese los datos del plato ");
            System.out.println("-----------------------------");
            System.out.println("ingrese el nombre del plato: ");
            String nom = sc.nextLine();
            System.out.println("ingrese el precio del plato: ");
            int pre = sc.nextInt();
            System.out.println("es una bebida? True/False");
            boolean bebida = sc.nextBoolean();


            Plato plato = new Plato( nom, pre,bebida);

// inicio el bucle si el usuario no ingreso una bebida
            if (!bebida) {
                System.out.println("ingrese la cantidad de ingredientes que tiene el plato:");
                int cant = sc.nextInt();
                for (int i = 0; i < cant; i++) {
                    System.out.println("ingrese el nombre del ingrediente: ");
                    String nomIng = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    double cantidad = sc.nextDouble();
                    System.out.print("Ingrese la unidad de medida: ");
                    String unidadMedida = sc.next();

                    Ingrediente ing = new Ingrediente(nomIng, cantidad, unidadMedida);
                    plato.agregarIngrediente(ing);
               }
                sc.nextLine();
                System.out.println("Desea dejar de ingresar ingredientes? S/N");
                String salir = sc.nextLine();
                if (salir.equals("S") || salir.equals("s")) {
                    break;
                }
            } else {
                System.out.println("\n ------ MENU ------ ");
                System.out.println(" "+nom);
                System.out.println(" Precio: $" + pre);
                System.out.println("-----------------------");
                break;
            }
            platoMenu.add(plato);
            System.out.println("Desea dejar de ingresar platos ? S/N");
            String salir = sc.nextLine();
            System.out.println("-------------------------------");
            if (salir.equals("S")||salir.equals("s")){
                break;
            }
        }
//        System.out.println("\n ------ MENU ------ ");
        for (Plato p : platoMenu) {
            System.out.println(p);
        }
    }

//clase ingrediente ----------------------------------------------------
    static class  Ingrediente{
        private String nombre;
        private double cantidad;
        private  String unidadMedida;

        public Ingrediente(String nombre,double cantidad,String unidadMedida){
            this.nombre=nombre;
            this.cantidad=cantidad;
            this.unidadMedida= unidadMedida;
        }

        public String getNombre() {
            return nombre;
        }

        public double getCantidad() {
            return cantidad;
        }

        public String getUnidadMedida() {
            return unidadMedida;
        }

        @Override
        public String toString() {
            return String.format("%-nombre %-cantidad %-unidadMedida", nombre, cantidad, unidadMedida);
        }
    }

//clase plato------------------------------------------------------------
    static class  Plato {
        private String nombreCompleto;
        private int precio;
        private boolean esBebida;
        private ArrayList<Ingrediente> ing;

        public Plato(String nombreCompleto, int precio, boolean esBebida) {
            this.nombreCompleto = nombreCompleto;
            this.precio = precio;
            this.esBebida = esBebida;
            this.ing = new ArrayList<>();
        }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public boolean getEsBebida() {
       return esBebida;
    }

    public int getPrecio() {
        return precio;
    }

    public void agregarIngrediente(Ingrediente i) {
            if (i != null ){
                this.ing.add(i);
            }
        }

        public String toString() {
                StringBuilder menu = new StringBuilder();
                System.out.println("\n ------ MENU ------ ");
                menu.append(String.format("%s\n", nombreCompleto));
                menu.append(String.format("Precio: $ %d\n", precio));

                if (!esBebida) {
                    menu.append("Ingredientes:\n");
                    menu.append(String.format("%-nombre %-cantidad %-unidadMedida\n", "Nombre", "Cantidad", "Unidad de Medida"));
                    for (Ingrediente ingrediente : ing) {
                        menu.append(ingrediente.toString()).append("\n");
                    }
                }

                menu.append("----------------------------------\n");
                return menu.toString();
        }
    }
}
//package org.example;
//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Scanner;
//public class CargaNotas {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random rd = new Random();
//        ArrayList<Alumno> alumnos = new ArrayList<>();
//// inicio del primer bucle-----------------------------
//        while (true) {
//            System.out.println();
//            System.out.println("Ingrese los datos del alumno");
//            System.out.println("------------------------------");
//            System.out.println("Ingrese su nombre completo");
//            String nombreCompleto = sc.nextLine();
//            System.out.println("Ingrese el legajo");
//            long legajo = sc.nextLong();
////            sc.nextLine();
//
//            Alumno alumno = new Alumno(nombreCompleto, legajo);
//
//// inicio del segundo bucle-------------------------------------
//            System.out.println("-------------------------------");
//            System.out.println("carga de datos");
//            System.out.println("-------------------------------");
//            System.out.println("Ingrese el nombre de la catedra ");
//            String catedra = sc.nextLine();
//
//
//            do{
//                sc.nextLine();
//                System.out.println("Ingrese la nota");
//                double notaExamen = sc.nextDouble();
//                Nota nota = new Nota(catedra, notaExamen);
//                alumno.agregarNota(nota);
//
//                sc.nextLine();
//                System.out.println("Desea terminar la carga? S/N");
//                String salirNotas = sc.nextLine();
//                if (salirNotas.equals("S") || salirNotas.equals("s")) {
//                    break;
//                }
//            }while (true);
//// fin del segundo bucle -------------------------------------
//            alumnos.add(alumno);
//            System.out.println("----------------------------------");
//            System.out.println("Desea dejar de cargar los datos del alumno? S/N");
//            String salirAlumnos = sc.nextLine();
//            if (salirAlumnos.equals("S") || salirAlumnos.equals("s")) {
//                break;
//            }
//        }
//
//        System.out.println("Datos del Alumno: ");
//        for (Alumno a : alumnos) {
//            System.out.println(a);
//        }
//    }
//// metodo Nota ---------------------------------------
//    static class Nota {
//        private String catedra;
//        private double notaExamen;
//
//        public Nota(String catedra, double notaExamen) {
//            this.catedra = catedra;
//            this.notaExamen = notaExamen;
//        }
//
//        public String getCatedra() {
//            return catedra;
//        }
//
//        public double getNotaExamen() {
//            return notaExamen;
//        }
//    }
//
//    // metodo Alumno ---------------------------------------
//    static class Alumno {
//        private String nombreCompleto;
//        private long legajo;
//        private ArrayList<Nota> notas;
//
//        public Alumno(String nombreCompleto, long legajo) {
//            this.nombreCompleto = nombreCompleto;
//            this.legajo = legajo;
//            this.notas = new ArrayList<>();
//        }
//
//        public String getNombreCompleto() {
//            return nombreCompleto;
//        }
//
//        public long getLegajo() {
//            return legajo;
//        }
//
//        public void agregarNota(Nota n) {
//            if (n != null) {
//                this.notas.add(n);
//            }
//        }
//
//        public int sumaDeNotas() {
//            if (notas.isEmpty()) {
//                return 0;
//            }
//            int suma = 0;
//            for (Nota n : notas) {
//                suma += (int) n.getNotaExamen();
//            }
//            return suma;
//        }
//
//        public int cantidadDeNotas() {
//            return notas.size();
//        }
//
//        public double promedioDeNotas() {
//            return cantidadDeNotas() == 0 ? 0 : sumaDeNotas() / (double) cantidadDeNotas();
//        }
//
//        public String toString() {
//            return "Nombre: " + nombreCompleto + ", Legajo: " + legajo + ", Promedio: " + promedioDeNotas();
//        }
//    }
//}