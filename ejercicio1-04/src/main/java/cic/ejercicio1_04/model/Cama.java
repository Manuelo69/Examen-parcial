package cic.ejercicio1_04.model;

public class Cama extends Mueble {

    private int plazas;

    public Cama(String nombre, String color, double precio, int plazas) {
        super(nombre, color, precio);
        this.plazas = plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return "Cama{" +
                "nombre='" + getNombre() + '\'' +
                ", color='" + getColor() + '\'' +
                ", precio=" + getPrecio() +
                ", plazas=" + plazas +
                '}';
    }
}
