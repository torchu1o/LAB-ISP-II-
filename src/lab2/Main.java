package lab2;

public class Main {
    public static void main(String[] args) {
        Scoala scoala = new Scoala();

        Clasa clasa1A = new Clasa(3, NumarClasa.I, 'A');
        Clasa clasa2B = new Clasa(2, NumarClasa.II, 'B');

        scoala.adaugaClasa("1A", clasa1A);
        scoala.adaugaClasa("2B", clasa2B);

        scoala.adaugaElevInClasa("1A", new Elev("Andrei", Gen.Masculin));
        scoala.adaugaElevInClasa("1A", new Elev("Maria", Gen.Feminin));
        scoala.adaugaElevInClasa("2B", new Elev("Ioana", Gen.Feminin));

        scoala.afisareInfo();

        System.out.println("\nStergem elevul Andrei...");
        scoala.eliminaElevDupaNume("Andrei");
        scoala.afisareInfo();

        System.out.println("\nStergem clasa 2B...");
        scoala.eliminaClasa("2B");
        scoala.afisareInfo();
    }
}

