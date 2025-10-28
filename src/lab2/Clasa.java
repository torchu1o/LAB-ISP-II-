package lab2;

import java.util.ArrayList;
import java.util.List;

public class Clasa {
    private int capacitate;
    private NumarClasa numarClasa;
    private char litera;
    private List<Elev> elevi;

    public Clasa(int capacitate, NumarClasa numarClasa, char litera) {
        this.capacitate = capacitate;
        this.numarClasa = numarClasa;
        this.litera = litera;
        this.elevi = new ArrayList<>();
    }

    public void adaugaElev(Elev elev) {
        if (elevi.size() < capacitate) {
            elevi.add(elev);
        } else {
            System.out.println("Clasa este plina!");
        }
    }

    public void eliminaElev(Elev elev) {
        elevi.remove(elev);
    }

    public int getTotalElevi() {
        return elevi.size();
    }

    public NumarClasa getNumarClasa() {
        return numarClasa;
    }

    public char getLitera() {
        return litera;
    }

    public List<Elev> getElevi() {
        return elevi;
    }

    @Override
    public String toString() {
        return numarClasa + String.valueOf(litera);
    }
}
