import java.util.*;
/**
 * Beschreiben Sie hier die Klasse BaumTest.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BaumTest{
    public static void main (String args[]){
        Knoten a = new Knoten(0);
        Knoten b = new Knoten(15);
        Knoten c = new Knoten(36);
        Knoten d = new Knoten(7);
        Knoten e = new Knoten(21);
        Knoten f = new Knoten(34);
        Knoten g = new Knoten(41);
        Knoten h = new Knoten(3); 
        Knoten i = new Knoten(11);
        Knoten j = new Knoten(16);
        Knoten k = new Knoten(25);
        Knoten l = new Knoten(33);

        BBaum baum = new BBaum(a);
        
        baum.addKnotenRC(b);
        baum.addKnotenRC(c);
        baum.addKnotenRC(d);
        baum.addKnotenRC(e);
        baum.addKnotenRC(f);
        baum.addKnotenRC(g);
        baum.addKnotenRC(h);
        baum.addKnotenRC(i);
        baum.addKnotenRC(j);
        baum.addKnotenRC(k);
        baum.addKnotenRC(l);
         
        // baum.addKnotenIT(a);
        // baum.addKnotenIT(b);
        // baum.addKnotenIT(c);
        // baum.addKnotenIT(d);
        // baum.addKnotenIT(e);
        // baum.addKnotenIT(f);
        // baum.addKnotenIT(g);
        // baum.addKnotenIT(h);
        // baum.addKnotenIT(i);
        // baum.addKnotenIT(j);
        
        // a.setLeft(b);
        // a.setRight(c);
        // b.setLeft(d);
        // b.setRight(e);
        // c.setLeft(f);
        // c.setRight(g);
        // d.setLeft(h);
        // d.setRight(i);
        // e.setLeft(j);
        // e.setRight(k);
        // f.setLeft(l);

        // System.out.println("Preorder: ");
        // baum.ausgebenPre(baum.getWurzel());
        // System.out.println(" ");
        // System.out.println("Postorder: ");
        // baum.ausgebenPost(baum.getWurzel());
        // System.out.println(" ");
        // System.out.println("Inorder: ");
        
        
        // baum.ausgebenIn(baum.getWurzel());
        // System.out.println(" ");
        // baum.search(1600);
        BBaum baum1 = new BBaum(a);
        autoFillBaumOrder(2501,baum1);
        baum1.ausgebenIn(baum1.getWurzel());
    }
    
    public static void autoFillBaumOrder(int anzahl, BBaum baum){
        Knoten[] knoten = new Knoten [anzahl] ;
        for(int i = 0; i < anzahl; i++){
            knoten[i] = new Knoten(i);
            baum.addKnoten(knoten[i]);
        }
    }
    
    public static void autoFillBaumRandom(int anzahl, BBaum baum){
        Random rand = new Random();
        int ran = rand.nextInt(anzahl);
        Knoten[] knoten = new Knoten [anzahl] ;
        for(int i = 0; i < anzahl; i++){
            knoten[i] = new Knoten(ran);
        }
        //baum.addKnoten(knoten[i]); warum geht das nicht ?
        for(int n = 0; n < anzahl; n++){
            baum.addKnoten(knoten[n]);
        }
    }
}
