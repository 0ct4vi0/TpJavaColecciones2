package org.example;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class menuRestaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        ArrayList<Plato> platoMenu = new ArrayList<>();
        boolean esBebida= false;
//        Plato platoMenu = new Plato();
//--------inicio del primer bucle---------------------
        while (true) {
            System.out.println("quiere cargar una bebida o un solido? ");
            String tipo = sc.nextLine();
            if (tipo.equals("Bebida")||tipo.equals("bebida")){
                cargaBebida();
            }
            System.out.println("ingrese el nombre del plato: ");
            String nombre = sc.nextLine();

        }


    }

    public static void  cargaBebida(){
        System.out.println("ingrese el nombre de la bebida: ");
        String nombre = sc.nextLine;
    }

    class  Ingrediente{
        private String nombre;
        private double cantidad;
        private  String unidadMebida;

        public Ingrediente(String nombre,double cantidad,String unidadMebida){
            this.nombre=nombre;
            this.cantidad=cantidad;
            this.unidadMebida= unidadMebida;
        }

        public String getNombre() {
            return nombre;
        }

        public double getCantidad() {
            return cantidad;
        }

        public String getUnidadMebida() {
            return unidadMebida;
        }
    }
    class  Plato{
        private String nombreCompleto;
        private double precio;
        private  boolean esBebida;
        private ArrayList<Ingrediente>ing;

        public Plato(String nombreCompleto,double precio,boolean esBebida){
            this.nombreCompleto = nombreCompleto;
            this.precio = precio;
            this.esBebida = esBebida;
            this.ing =new ArrayList<>();
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
//    // metodo Nota ---------------------------------------
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