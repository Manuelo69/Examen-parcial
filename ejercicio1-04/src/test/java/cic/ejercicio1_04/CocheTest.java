package cic.ejercicio1_04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cic.ejercicio1_04.model.Coche;

public class CocheTest {

    private Coche coche;

    @BeforeEach
    public void setUp() {
        coche = new Coche("Coche1", "Negro", 30000.0, "Toyota", false);
    }

    @Test
    public void testGetMarca() {
        assertEquals("Toyota", coche.getMarca());
    }

    @Test
    public void testSetMarca() {
        coche.setMarca("Honda");
        assertEquals("Honda", coche.getMarca());
    }

    @Test
    public void testToString() {
        String expected = "Coche [marca=Toyota, nombre=Coche1, color=Negro, precio=30000.0]";
        assertEquals(expected, coche.toString());
    }

    @Test
    public void testAbrir() {
        coche.abrir();
        assertTrue(coche.isCompuerta());
    }

    @Test
    public void testCerrar() {
        coche.cerrar();
        assertFalse(coche.isCompuerta());
    }

}
