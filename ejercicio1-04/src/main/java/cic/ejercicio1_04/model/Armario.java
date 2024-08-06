package cic.ejercicio1_04.model;

public class Armario extends Mueble implements Compuerta {

    private int puertas;

    public Armario(String nombre, String color, double precio, int puertas, boolean compuerta) {
        super(nombre, color, precio, compuerta);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Armario [getPuertas()=" + getPuertas() + ", getNombre()=" + getNombre() + ", getColor()=" + getColor()
                + ", getPrecio()=" + getPrecio() + "]";
    }

    @Override
    public void abrir() {
        this.setCompuerta(true);
    }

    @Override
    public void cerrar() {
        this.setCompuerta(false);
    }

}
