package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Score {
    private Vak vak;
    private double cijfer;
    private int behaaldePunten;

    public Score(Vak vak, double cijfer) {
        this.vak = vak;
        this.cijfer = cijfer;
        if (cijfer >= vak.getCesuur()) {
            behaaldePunten = vak.getPunten();
        } else {
            behaaldePunten = 0;
        }
    }

    public Vak getVak() {
        return vak;
    }

    public double getCijfer() {
        return cijfer;
    }

    public int getBehaaldePunten() {
        return behaaldePunten;
    }
}
