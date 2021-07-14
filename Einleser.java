import java.util.Scanner;

/**
 * short description of this program
 *
 * @author Sairam Vijayakumar
 * @version 1.0
 * @date 2020-05-06
 */
public class Einleser {

    // declare attributes
    static Scanner scanner;

    /**
     * constructor: initialize attributes
     */
    public Einleser(){
        scanner = new Scanner(System.in);
    }
    /**
     * Checkt ob sich ein Double im Scanner befindet, falls ja, liest er den Int ein und gibt ihn zurück.
     * Falls kein Int eingegeben wird, wird eine Fehlermeldung ausgegeben und nochmals eingelesen.

     */
    public double readDouble(){
        while (!scanner.hasNextDouble()){
            Line();
            System.out.println("Bitte geben sie eine Zahl ein");
            Line();
            scanner.next();
        }
        double zahl = scanner.nextDouble();
        return zahl;
    }
    /**
     * Checkt ob sich ein Integer im Scanner befindet, falls ja, liest er den Int ein und gibt ihn zurück.
     * Falls kein Int eingegeben wird, wird eine Fehlermeldung ausgegeben und nochmals eingelesen.
     */
    public int readInt(){
        while (!scanner.hasNextInt()){
            System.out.println("Bitte geben sie eine Ganzzahl ein");
            scanner.next();
        }
        int zahl = scanner.nextInt();
        return zahl;
    }

    public boolean readBooleanDeutsch(){
        boolean bool;
        String eingabe = scanner.next();


        if(eingabe.equalsIgnoreCase("Ja")){
            bool = true;

        }else if (eingabe.equalsIgnoreCase("Nein")) {
            bool = false;

        }else  {

            System.out.println("Bitte geben sie \"Ja\" oder \"Nein\" ein");
            bool = readBooleanDeutsch();

        }
        return bool;
    }
    /**
     * Liest den ersten Buchstabe auf der Kommandozeile ein.
     * Falls kein Buchstabe (a-Z) vorhanden wird eine Fehlermeldung ausgegeben und eine erneute Einlesung findet statt.
     * Ist die Eingabe leer, wird eine Fehlermeldung ausgegeben und die Einlesung erneut gestartet.
     */
    public char readChar() {
        String input = scanner.nextLine();

        if(!input.isEmpty() && input.charAt(0) != ' '){
            char d = input.charAt(0);
            while (d != 'M' && d != 'W') {
                System.out.println("Ihre Eingabe ist Falsch! Bitte geben sie \"M\" oder \"W\" ein");
                d = scanner.nextLine().charAt(0);
            }
            return d;
        }else {
            Line();
            System.out.println("Leere Eingabe und Leerschläge sind nicht zulässig, bitte geben Sie etwas ein.");
            Line();
            return readChar();
        }
    }
    /**
     * Liest den ersten Buchstabe auf der Kommandozeile ein.
     * Falls kein Buchstabe (a-Z) vorhanden wird eine Fehlermeldung ausgegeben und eine erneute Einlesung findet statt.
     * Ist die Eingabe leer, wird eine Fehlermeldung ausgegeben und die Einlesung erneut gestartet.
     */

    public char readChar2() {
        String input = scanner.next();

        if(!input.isEmpty() && input.charAt(0) != ' '){
            char d = input.charAt(0);
            while (d != 'x' && d != 'a') {
                System.out.println("Ihre Eingabe ist Falsch! Bitte geben sie \"x\" oder \"a\" ein");
                d = scanner.nextLine().charAt(0);
            }
            return d;
        }else {
            Line();
            System.out.println("Leere Eingabe und Leerschläge sind nicht zulässig, bitte geben Sie etwas ein.");
            Line();
            return readChar();
        }
    }
    /**
     * Liest den ersten Buchstabe auf der Kommandozeile ein.
     * Falls kein Buchstabe (a-Z) vorhanden wird eine Fehlermeldung ausgegeben und eine erneute Einlesung findet statt.
     * Ist die Eingabe leer, wird eine Fehlermeldung ausgegeben und die Einlesung erneut gestartet.
     */

    public char readChar3() {
        String input = scanner.next();

        if(!input.isEmpty() && input.charAt(0) != ' '){
            char d = input.charAt(0);
            while (d != 'x') {
                System.out.println("Ihre Eingabe ist Falsch! Bitte geben sie \"x\" ein");
                d = scanner.nextLine().charAt(0);
            }
            return d;
        }else {
            Line();
            System.out.println("Leere Eingabe und Leerschläge sind nicht zulässig, bitte geben Sie etwas ein.");
            Line();
            return readChar();
        }
    }
    /**
     * Liest einen String von System.in ein.
     */
    public String readString(){

        while (! scanner.hasNext()){
            System.out.println("Text > ");
            scanner.nextLine();
        }
        String text = scanner.nextLine();
        return text;
    }
    /**
     * Zeichnet eine Linie aus Strichen für die schöne grafische Darstellung.
     */
    public void Line() {
        System.out.println("-------------------------------------------------------------------------------------");
    }
}