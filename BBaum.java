public class BBaum {
    private Knoten wurzel;

    public BBaum() {
        setWurzel(null);
    }

    public BBaum(Knoten wurzel) {
        this.setWurzel(wurzel);
    }

    public Knoten getWurzel() {
        return wurzel;
    }

    public void setWurzel(Knoten wurzel) {
        this.wurzel = wurzel;
    }

    // Methode: addKnoten (Knoten) - Knoten wird an Baum angehangen (rekursiv)
    public void addKnoten(Knoten knoten) {
        addKnotenRC(knoten, wurzel);
    }
    
    //rechts = kleiner
    // Methode: addKnoten (Knoten, Knoten) - Knoten wird an Baum angehangen (rekursiv)
    public void addKnotenRC(Knoten knoten){
        addKnotenRC(knoten, wurzel);
    }
    
    public void addKnotenRC(Knoten knoten, Knoten wurzel) {
        if (wurzel == null) {
            this.setWurzel(knoten);
        } else {
            if (knoten.getInhalt() <= wurzel.getInhalt()) {
                if (wurzel.getLeft() == null) {
                    wurzel.setLeft(knoten);
                } else{
                    addKnotenRC(knoten, wurzel.getLeft());
                }
            } else if (knoten.getInhalt() > wurzel.getInhalt()) {
                if (wurzel.getRight() == null) {
                    wurzel.setRight(knoten);
                } else{
                    addKnotenRC(knoten, wurzel.getRight());
                }
            }
        }
    }
    
    public void addKnotenIT(Knoten knoten){
        Knoten Verk = wurzel;
        boolean kontrolle; 
        if(wurzel == null){
            this.setWurzel(wurzel);
        }else{
            while(kontrolle = false){
                if(knoten.getInhalt() <= Verk.getInhalt()){
                    if(Verk.getLeft() == null){
                        Verk.setLeft(knoten);
                    }else{
                        Verk = Verk.getLeft();
                        kontrolle = true;
                    }
                }else if(knoten.getInhalt() > Verk.getInhalt()){
                    if(Verk.getRight() == null){
                        Verk.setRight(knoten);
                        kontrolle = true;
                    }else{
                        Verk = Verk.getRight();
                    }                    
                }
            }             
        }
    }

    
    public void deleteKnoten(Knoten knoten) {
        
    }

    // Methode: ausgebenPre (Knoten) - Baum wird in Pre-Order ausgegeben     
    public void ausgebenPre(Knoten k) {
        if (k != null) {
            System.out.print(k.getInhalt()+ " ");
            ausgebenPre(k.getLeft());
            ausgebenPre(k.getRight());
        }
    }

    // Methode: ausgebenPost (Knoten) - Baum wird in Post-Order ausgegeben 
    public void ausgebenPost(Knoten k) {
        if (k != null) {
            ausgebenPost(k.getLeft());
            ausgebenPost(k.getRight());
            System.out.print(k.getInhalt() + " ");
        }
    }

    // Methode: ausgebenIn (Knoten) - Baum wird in In-Order ausgegeben
    public void ausgebenIn(Knoten k) {
        if (k != null) {
            ausgebenIn(k.getLeft());
            System.out.print(k.getInhalt()+ " ");
            ausgebenIn(k.getRight());
        }
    }

    public Knoten getByPfad(boolean[] directions) {
        return null;
    }

    public Knoten[] getKnotenPre() {
        return null;
    }

    public Knoten[] getKnotenPost() {
        return null;
    }

    public Knoten[] getKnotenIn() {
        return null;
    }

    public int berechneWidth() {
        return 0;
    }

    public int berechneDepth() {
        return 0;
    }

    public void clear() {
        setWurzel(null);
    }
    
    public void search(int gesucht){
        search(wurzel,gesucht);        
    }
    
    public void search(Knoten wurzel, int gesucht){
        if(wurzel != null){
            if(gesucht < wurzel.getInhalt()){
                search(wurzel.getLeft(),gesucht);
            }else if(gesucht > wurzel.getInhalt()){
                    search(wurzel.getRight(),gesucht);
            }else if (gesucht == wurzel.getInhalt()){
                System.out.println("Knoten gefunden von dem Wert:  " + gesucht);
            }
        }
        else{
            System.out.println("Suche erfolglos");
        }
    }
}
