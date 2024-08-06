package cic.ejercicio1_04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cic.ejercicio1_04.model.Cama;

public class CamaTest {

    private Cama cama;

    @BeforeEach
    public void setUp() {
        cama = new Cama("Cama1", "Azul", 200.0, 2, true);
    }

    @Test
    public void testGetPlazas() {
        assertEquals(2, cama.getPlazas());
    }

    @Test
    public void testSetPlazas() {
        cama.setPlazas(3);
        assertEquals(3, cama.getPlazas());
    }

    @Test
    public void testToString() {
        String expected = "Cama{nombre='Cama1', color='Azul', precio=200.0, plazas=2}";
        assertEquals(expected, cama.toString());
    }

}
