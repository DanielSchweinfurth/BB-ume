import java.util.*;
public class BaumTest {
	public static void main (String args[]) {
		
		Knoten a = new Knoten(10);
		BBaum baum1 = new BBaum(a);
		
		
		autoFillBaum(8000,baum1);
		
		baum1.ausgebenIn(baum1.getWurzel());
		
	}
	
	
	public static void autoFillBaum(int anzahl, BBaum baum) {
		Knoten[] knoten = new Knoten [anzahl] ;
		for(int i = 0; i < anzahl; i++) {
			knoten[i] = new Knoten(i);
			
		baum.addKnoten(knoten[i]);
		}
		
		
	}

}
