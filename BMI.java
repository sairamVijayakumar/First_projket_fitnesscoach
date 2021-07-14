/**
 * short description of this program
 *
 * @author Sairam Vijayakumar
 * @version 1.0
 * @date 2020-05-04
 */
public class BMI {
    private char geschlecht;
    private double gewicht;
    private double hoehe;
    private double resultat;

    Einleser einleser = new Einleser();

    public BMI(){

    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    /**
     * Methode zur berechnung der BMI
     */
    public double getResultat() {
        return resultat = gewicht / (hoehe * hoehe);
    }

    /**
     * Gibt eine Tabelle für den User aus.
     */
    public void bmiTabelle(){
        einleser.Line();
        System.out.println();
        System.out.println("Hier noch eine Tabele für Sie um ihr Werte zu Vergleichen.");
        System.out.println("----------------------------------------------------------");
        System.out.println("|               |   BMI männlich   |    BMI weiblich     |");
        System.out.println("----------------------------------------------------------");
        System.out.println("|Untergewicht   |      >20         |        >19          |");
        System.out.println("----------------------------------------------------------");
        System.out.println("|Normalgewicht  |     20-25        |       19-24         |");
        System.out.println("----------------------------------------------------------");
        System.out.println("|Übergewicht    |      26<         |        25<          |");
        System.out.println("----------------------------------------------------------");
        System.out.println();
    }
}
