package cic.ejercicio2_04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrdenarTest {

    private Ordenar ordenar;

    @BeforeEach
    public void setUp() {
        ordenar = new Ordenar();
    }

    @Test
    public void testAnadirNumeros() {
        Map<String, Integer> map = ordenar.getMap();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        ordenar.anadirNumeros();
        TreeSet<Integer> expectedSet = new TreeSet<>();
        expectedSet.add(1);
        expectedSet.add(5);
        expectedSet.add(3);
        assertEquals(expectedSet, ordenar.getTreeSet());
    }

}
