package cic.ejercicio1_04.model;

public class Cama extends Mueble implements Compuerta {

    private int plazas;

    public Cama(String nombre, String color, double precio, int plazas, boolean compuerta) {
        super(nombre, color, precio, compuerta);
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
                ", plazas=" + this.plazas +
                '}';
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
