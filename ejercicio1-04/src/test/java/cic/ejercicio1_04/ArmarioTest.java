package cic.ejercicio1_04;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        String expected = "Armario [getPuertas()=2, getNombre()=Armario1, getColor()=Rojo, getPrecio()=150.0]";
        assertEquals(expected, armario.toString());
    }

}
