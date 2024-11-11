package org.example;
class  Ingrediente{
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