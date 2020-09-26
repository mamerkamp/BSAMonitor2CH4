package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Vak {
    private String naam;
    private int punten;
    private int cesuur;

    public Vak(String naam, int punten, int cesuur) {
        this.naam = naam;
        this.punten = punten;
        this.cesuur = cesuur;
    }

    public String getNaam() {
        return naam;
    }

    public int getPunten() {
        return punten;
    }

    public int getCesuur() {
        return cesuur;
    }
}
