package org.example;
import java.util.ArrayList;

class  Plato {
    private String nombreCompleto;
    private int precio;
    private Boolean esBebida;
    private ArrayList<Ingrediente> ing;

    public Plato(String nombreCompleto, int precio, Boolean esBebida) {
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

    public ArrayList<Ingrediente> getIngrediente(){
        return ing;
    }

    public void agregarIngrediente(Ingrediente i) {
        if (i != null ){
            this.ing.add(i);
        }
    }
}
