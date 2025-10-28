package lab2;

import java.util.HashMap;
import java.util.Map;

public class Scoala {
    private Map<String, Clasa> clase;

    public Scoala() {
        clase = new HashMap<>();
    }

    public void adaugaClasa(String id, Clasa clasa) {
        clase.put(id, clasa);
    }

    public void eliminaClasa(String id) {
        clase.remove(id);
    }

    public void adaugaElevInClasa(String id, Elev elev) {
        Clasa c = clase.get(id);
        if (c != null) {
            c.adaugaElev(elev);
        }
    }

    public void eliminaElevDupaNume(String nume) {
        for (Clasa c : clase.values()) {
            c.getElevi().removeIf(e -> e.getNume().equals(nume));
        }
    }

    public int getNumarClase() {
        return clase.size();
    }

    public int getTotalElevi() {
        return clase.values().stream()
                .mapToInt(Clasa::getTotalElevi)
                .sum();
    }

    public void afisareInfo() {
        System.out.println("Scoala are " + getNumarClase() + " clase:");
        for (Map.Entry<String, Clasa> entry : clase.entrySet()) {
            Clasa c = entry.getValue();
            System.out.println("Clasa " + entry.getKey() + " - " + c.getTotalElevi() + " elevi: " + c.getElevi());
        }
        System.out.println("Total elevi: " + getTotalElevi());
    }
}


















