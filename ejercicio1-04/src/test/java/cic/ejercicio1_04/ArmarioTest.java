package cic.ejercicio1_04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cic.ejercicio1_04.model.Armario;

public class ArmarioTest {

    private Armario armario;

    @BeforeEach
    public void setUp() {
        armario = new Armario("Armario1", "Rojo", 150.0, 2, true);
    }

    @Test
    public void testGetPuertas() {
        assertEquals(2, armario.getPuertas());
    }

    @Test
    public void testSetPuertas() {
        armario.setPuertas(3);
        assertEquals(3, armario.getPuertas());
    }

    @Test
    public void testToString() {
        String expected = "Armario [Puertas=2, Nombre=Armario1, Color=Rojo, Precio=150.0]";
        assertEquals(expected, armario.toString());
    }

    @Test
    public void testAbrir() {
        armario.abrir();
        assertTrue(armario.isCompuerta());
    }

    @Test
    public void testCerrar() {
        armario.cerrar();
        assertFalse(armario.isCompuerta());
    }

}
