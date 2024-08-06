package cic.ejercicio1_04.model;

public class Mueble {

    private String nombre;
    private String material;
    private String color;
    private double precio;

    public Mueble(String nombre, String color, double precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Mueble{" +
                "nombre='" + nombre + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }

}
