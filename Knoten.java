import java.util.*;
public class Knoten
{
    private int inhalt;
    private Knoten left;
    private Knoten right;
    
    public Knoten(int inhalt){
        this.inhalt = inhalt;
    }
    
    public Knoten getLeft(){
        return left;
    }
    
    public Knoten getRight(){
        return right;
    }
    
    public int getInhalt(){
        return inhalt;
    }
    
    public void setInhalt(int inhalt){
    }
    
    public void setLeft(Knoten left){
        this.left = left; 
    }
    
    public void setRight(Knoten right){
        this.right = right; 
    }
}