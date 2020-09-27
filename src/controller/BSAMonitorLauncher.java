package controller;

import model.Score;
import model.Vak;

import java.util.Scanner;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class BSAMonitorLauncher {
    static final double HOOGSTEINVOER = 10.0;
    static final double LAAGSTEINVOER = 1.0;
    static final double STUDIEADVIESDELER = 0.833333333;

    public static void main(String[] args) {

        Vak[] vakkenlijst = new Vak[5];
        vakkenlijst[0] = new Vak("Project fasten your seatbelts", 12, 5.5);
        vakkenlijst[1] = new Vak("Programming", 3, 5.5);
        vakkenlijst[2] = new Vak("Databases", 3, 5.5);
        vakkenlijst[3] = new Vak("Personal Skills", 2, 5.5);
        vakkenlijst[4] = new Vak("Project skills", 2, 5.5);

        Score[] scores = new Score[5];

        Scanner keyboard = new Scanner(System.in);
        int studiepunten = 0;

        System.out.println("Voer behaalde cijfers in: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(vakkenlijst[i].getNaam() + ": ");
            double cijfer = keyboard.nextDouble();
            if (cijfer < LAAGSTEINVOER || cijfer > HOOGSTEINVOER){
                System.out.println("Voer een geldige waarde in, ei!");
                System.out.print(vakkenlijst[i].getNaam() + ": ");
                cijfer = keyboard.nextDouble();
            }
            scores[i] = new Score(vakkenlijst[i], cijfer);
            studiepunten = studiepunten + scores[i].getBehaaldePunten();
        }

        int totaalTeBehalenPunten = 0;
        for (int i = 0; i < vakkenlijst.length; i++) {
            totaalTeBehalenPunten = totaalTeBehalenPunten + vakkenlijst[i].getPunten();
        }

        for (int i = 0; i < vakkenlijst.length; i++) {
            System.out.printf("Vak/project: %-40s Cijfer: %3.1f Behaalde punten: %d\n",
                    vakkenlijst[i].getNaam(), scores[i].getCijfer(), scores[i].getBehaaldePunten());
        }

        System.out.println();
        System.out.println("Totaal aantal behaalde studiepunten is: " + studiepunten + "/"
                + totaalTeBehalenPunten);

        if (studiepunten / totaalTeBehalenPunten <= STUDIEADVIESDELER) {
            System.out.println("PAS OP: je ligt op schema voor een negatief BSA!");
        }
    }
}
