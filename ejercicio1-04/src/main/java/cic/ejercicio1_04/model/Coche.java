package cic.ejercicio1_04.model;

public class Coche extends Mueble implements Compuerta {

    private String marca;

    public Coche(String nombre, String color, double precio, String marca, boolean compuerta) {
        super(nombre, color, precio, compuerta);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche [marca=" + getMarca() + ", nombre=" + getNombre() + ", color=" + getColor()
                + ", precio=" + getPrecio() + "]";
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
