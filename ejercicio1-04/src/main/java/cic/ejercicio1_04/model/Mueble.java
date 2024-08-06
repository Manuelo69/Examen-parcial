package cic.ejercicio1_04.model;

public class Mueble {

    private String nombre;
    private String color;
    private double precio;
    private boolean compuerta;

    public Mueble(String nombre, String color, double precio, boolean compuerta) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.compuerta = compuerta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isCompuerta() {
        return compuerta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCompuerta(boolean compuerta) {
        this.compuerta = compuerta;
    }

    @Override
    public String toString() {
        return "Mueble{" +
                "nombre='" + nombre + '\'' + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }

}
