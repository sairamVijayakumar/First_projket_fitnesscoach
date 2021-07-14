import java.util.Arrays;
/**
 * short description of this program
 *
 * @author Sairam Vijayakumar
 * @version 1.0
 * @date 2020-05-06
 */
public class Fitnessplan {
    private Fitnessplan[] fp = new Fitnessplan[20];
    private String name;
    private int zahl;
    private int cntr = 0;

    Einleser einleser = new Einleser();

    public Fitnessplan(){
    }

    public void setName(String name){
        this.name = name;
    }

    public void setZahl(int zahl){
        this.zahl = zahl;
    }
    /**
     * Methode um eine Einheit hinzuzufügen.
     */
    public void addFitnessplan(Fitnessplan fitnessplan){
        for(cntr = 0; cntr < zahl; cntr++) {
            System.out.println("Geben Sie die  " + (cntr + 1) + ". Trainingseinheit ein.");
            einleser.Line();
            String input = einleser.readString();
            einleser.Line();
            fp[cntr] = new Fitnessplan();
            fp[cntr].setName(input);
        }
        printFitnessplan();
    }
    /**
     * Gibt das Array aus.
     */
    public void printFitnessplan(){
        System.out.println("Hier ist Ihr erstellter Fitnessplan:");
        einleser.Line();
        for (int x = 0; x < zahl; x++) {
            System.out.println("[" + (x + 1) + "] " + fp[x].name);
        }
    }
    /**
     * Gibt das Array aus.
     */
    public void printFitnessplan2(){
         String[] fp1 = new String[]{"10x Kniebeugen","12x Rumpfbeugen","15x Liegestütze","1min Klimmzüge", "1min Planks" };
        for (int x = 0; fp1.length > x; x++) {
            System.out.println("[" + (x + 1) + "] " + fp1[x]);
        }
    }
    /**
     * Gibt das Array aus.
     */
    public void printFitnessplan3(){
        String[] fp2 = new String[]{"Rudergerät","Crosstrainer","Spin-Bike","Ergometer","Stepper"};
        for (int x = 0; fp2.length > x; x++) {
            System.out.println("[" + (x + 1) + "] " + fp2[x]);
        }
    }
}



