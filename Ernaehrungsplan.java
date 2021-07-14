/**
 * short description of this program
 *
 * @author Sairam Vijayakumar
 * @version 1.0
 * @date 2020-05-06
 */
public class Ernaehrungsplan {
    private Ernaehrungsplan[] ep = new Ernaehrungsplan[20];
    private String name;
    private int zahl;
    private int cntr = 0;

    Einleser einleser = new Einleser();

    public Ernaehrungsplan(){

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
    public void addErnaerungsplan(Ernaehrungsplan ernaehrungsplan){
        for(cntr = 0; cntr < zahl; cntr++) {
            einleser.Line();
            System.out.println("Geben Sie die  " + (cntr + 1) + ". Ernaerungseinheit ein.");
            einleser.Line();
            String input = einleser.readString();
            einleser.Line();
            ep[cntr] = new Ernaehrungsplan();
            ep[cntr].setName(input);
        }
        printErnaerungsplan();
    }
    /**
     * Gibt das Array aus.
     */
    public void printErnaerungsplan(){
        System.out.println("Hier ist Ihr erstellter Fitnessplan:");
        einleser.Line();
        for (int x = 0; x < zahl; x++) {
            System.out.println("[" + (x + 1) + "] " + ep[x].name);
        }
    }
    /**
     * Gibt das Array aus.
     */
    public void printErnaerungsplan2(){
        String[] ep1 = new String[]{"Grüner Tee","Brokkoli","Poulet","Käse","Weizen Brot"};
        for (int x = 0; ep1.length > x; x++) {
            System.out.println("[" + (x + 1) + "] " + ep1[x]);
        }
    }
    /**
     * Gibt das Array aus.
     */
    public void printErnaerungsplan3(){
        String[] ep2 = new String[]{"Basmati Reis","Quinoa","Kichererbsen","Räuchertofu","Sojamilch","Sonnenblumenkerne"};
        for (int x = 0; ep2.length > x; x++) {
            System.out.println("[" + (x + 1) + "] " + ep2[x]);
        }
    }
    /**
     * Gibt das Array aus.
     */
    public void printErnaerungsplan4(){
        String[] ep2 = new String[]{"Milch 0.5l","2 Eier","Nudlen","Kidneybohnen","Kräuterquark"};
        for (int x = 0; ep2.length > x; x++) {
            System.out.println("[" + (x + 1) + "] " + ep2[x]);
        }
    }
}
