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
// ------------paso los datos a la clase plato---------------------
            Plato plato = new Plato( nom, pre,bebida);
// inicio el bucle si el usuario no ingreso una bebida
            if (!bebida) {
                System.out.println("ingrese la cantidad de ingredientes que tiene el plato:");
                int cantidad = sc.nextInt();
                for (int i = 0; i < cantidad; i++) {
                    System.out.println("ingrese el nombre del ingrediente: ");
                    String nomIng = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    double cant = sc.nextDouble();
                    System.out.print("Ingrese la unidad de medida: ");
                    String unidadMedida = sc.next();
                    sc.nextLine();

                    Ingrediente ing = new Ingrediente(nomIng, cant, unidadMedida);
                    plato.agregarIngrediente(ing);
               }
                System.out.println("Desea dejar de ingresar ingredientes? S/N");
                String salir = sc.nextLine();
                if (salir.equals("S") || salir.equals("s")) {
                    break;
                }
                platoMenu.add(plato);
            } else {
                System.out.println("\n ------ MENU ------ ");
                System.out.println(" "+nom);
                System.out.println(" Precio: $" + pre);
                break;
            }

            System.out.println("Desea dejar de ingresar platos ? S/N");
            String salir = sc.nextLine();
            System.out.println("-------------------------------");
            if (salir.equals("S")||salir.equals("s")){
                break;
            }
        }
        System.out.println("\n ------ MENU ------ ");
        for (Plato p : platoMenu) {
            System.out.println(p);
        }
    }

    static class  Ingrediente{
        private String nombre;
        private double cantidad;
        private  String unidadBebida;

        public Ingrediente(String nombre,double cantidad,String unidadBebida){
            this.nombre=nombre;
            this.cantidad=cantidad;
            this.unidadBebida= unidadBebida;
        }

        public String getNombre() {
            return nombre;
        }

        public double getCantidad() {
            return cantidad;
        }

        public String getUnidadMebida() {
            return unidadBebida;
        }
    }
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

        public void agregarIngrediente(Ingrediente ingrediente) {
            ing.add(ingrediente);
        }

        public String toString() {
            System.out.println("\n ------ MENU ------ ");
            System.out.println(""+nombreCompleto);
            System.out.println("Precio: $"+precio);
            System.out.println("Ingredientes: ");
            System.out.println("Nombre      Cantidad     Unidad de Medida");
            System.out.println();


            return toString();
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