package cic.ejercicio2_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ordenar implements Comparable<Ordenar> {

    Map<String, Integer> map;
    Set<Integer> treeSet;

    public Ordenar() {
        this.map = new HashMap<String, Integer>();
        this.treeSet = new TreeSet<Integer>();
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public Set<Integer> getTreeSet() {
        return treeSet;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public void anadirNumeros() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value % 2 == 0) {
                value += key.length();
                treeSet.add(value);
            } else {
                treeSet.add(value);
            }
        }
    }

    @Override
    public int compareTo(Ordenar o) {
        return Integer.compare(this.map.size(), o.map.size());
    }

}
