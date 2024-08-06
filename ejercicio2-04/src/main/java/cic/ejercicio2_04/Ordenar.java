package main.java.cic.ejercicio2_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ordenar implements Comparable<Elemento> {

    Map<String, Integer> map;
    Set<Integer> treeSet;

    public Ordenar() {
        this.map = new HashMap<String, Integer>();
        this.treeSet = new TreeSet<Integer>();
    }

}
