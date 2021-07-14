import java.util.Scanner;
/**
 * fitness coach
 *
 * @author Sairam Vijayakumar
 * @version 1.0
 * @date 2020-05-05
 */
public class FitnessApp{



    /**
     * constructor: initialize attributes
     */
    public FitnessApp(){

    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        FitnessApp program = new FitnessApp();
        program.run();

    }

    /**
     * Hauptmethode, hier wird der Benutzerdialog gesteuert.
     */
    private void run() {
        Einleser einleser = new Einleser();
        Fitnessplan fitnessplan = new Fitnessplan();
        BMI bmi = new BMI();
        Ernaehrungsplan ernaehrungsplan = new Ernaehrungsplan();

        einleser.Line();
        System.out.println("Herzlich Willkommen zum Programm Fitness Coach!");
        einleser.Line();

        System.out.println("Geben Sie ihr Geschlecht ein: \"M\" für männlich oder \"W\" für weiblich ein.");
        einleser.Line();
        char geschlecht = einleser.readChar();
        bmi.setGeschlecht(geschlecht);

        einleser.Line();
        System.out.println("Geben die ihre Höhe ein in Meter: z.B \"1.80\"");
        einleser.Line();
        double hoehe = einleser.readDouble();
        bmi.setHoehe(hoehe);

        einleser.Line();
        System.out.println("Geben die ihr Gewicht in Kg ein: z.B \"70.5\"");
        einleser.Line();
        double gewicht = einleser.readDouble();
        bmi.setGewicht(gewicht);

        einleser.Line();
        System.out.println("Ihr BMI ist: " + bmi.getResultat());

        einleser.Line();
        if(bmi.getGeschlecht() == 'M' && bmi.getResultat() <20){
            System.out.println("Sie sind Untergewichtig");
            bmi.bmiTabelle();

        } else if (bmi.getGeschlecht() == 'M' && bmi.getResultat() <25){
            System.out.println("Sie sind Normalgewichtig");
            bmi.bmiTabelle();

        } else if (bmi.getGeschlecht() == 'M' && bmi.getResultat() >25){
            System.out.println("Sie sind Übergewichtig");
            bmi.bmiTabelle();

        } else if (bmi.getGeschlecht() == 'W' && bmi.getResultat() <19){
            System.out.println("Sie sind Untergewichtig");
            bmi.bmiTabelle();

        } else if (bmi.getGeschlecht() == 'W' && bmi.getResultat() <24) {
            System.out.println("Sie sind Normalgewichtig");
            bmi.bmiTabelle();

        } else if (bmi.getGeschlecht() == 'W' && bmi.getResultat() >24) {
            System.out.println("Sie sind Übergewichtig");
            bmi.bmiTabelle();
        }

        einleser.Line();
        System.out.println("So nun kommen wir zum 2. Teil!");
        System.out.println("Hier geht es darum für Sie ein Trainingplan zu erstellen/wählen!");
        einleser.Line();

        System.out.println("Möchten Sie einen Trainingsplan erstellen? (Ja/Nein)");
        einleser.Line();
        boolean eingabe = einleser.readBooleanDeutsch();
        einleser.Line();

        if(eingabe == true){
            System.out.println("Wie viele Trainings Einheiten möchten Sie eingeben?");
            einleser.Line();
            int zahl = einleser.readInt();
            einleser.Line();
            fitnessplan.setZahl(zahl);
            fitnessplan.addFitnessplan(new Fitnessplan());

        }else {
            System.out.println("Wie viel mal trainieren Sie pro Woche?");
            einleser.Line();
            einleser.readInt();
            einleser.Line();
            System.out.println("Möchten Sie mit dem eigenen Körpergewicht trainieren? (Ja/Nein)");
            einleser.Line();
            boolean eingabe1 = einleser.readBooleanDeutsch();
            einleser.Line();

            if (eingabe1 == true) {
                fitnessplan.printFitnessplan2();

            } else {
                fitnessplan.printFitnessplan3();
            }
        }

            einleser.Line();
            System.out.println("Jetzt kommen wir zum Teil 3!");
            System.out.println("Hier geht es darum für Sie einen Ernährungsplan zu erstellen/wählen!");
            einleser.Line();

            System.out.println("Möchten Sie einen Ernährungsplan erstellen? (Ja/Nein)");
            einleser.Line();
            boolean eingabe2 = einleser.readBooleanDeutsch();
            einleser.Line();

        if(eingabe2 == true){
            System.out.println("Wie viele Ernährungs Einheiten möchten Sie eingeben?");
            einleser.Line();
            int zahl = einleser.readInt();

            ernaehrungsplan.setZahl(zahl);
            ernaehrungsplan.addErnaerungsplan(new Ernaehrungsplan());

        } else {
            System.out.println("Sind Sie ein Allesesser?");
            einleser.Line();
            boolean eingabe3 = einleser.readBooleanDeutsch();
            einleser.Line();

            if (eingabe3 == true){
                ernaehrungsplan.printErnaerungsplan2();
            } else {
                System.out.println("Geben Sie \"x\" ein wenn Sie Veganer sind und ein \"a\" wenn sie Vegetarier sind");
                char b = einleser.readChar2();

                if (b == 'x'){
                    ernaehrungsplan.printErnaerungsplan3();

                }else {
                    ernaehrungsplan.printErnaerungsplan4();
                }
            }
        }
        einleser.Line();
        System.out.println("Wir wünschen Ihnen Viel Glück beim Trainieren und beim gesund essen.");
        einleser.Line();

        System.out.println("geben sie \"x\" ein um das Programm zu beenden!");
        einleser.Line();
        char eingabeX = einleser.readChar3();

        if (eingabeX == 'x'){
            System.exit(0);
        }
    }
}