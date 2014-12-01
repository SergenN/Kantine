import java.util.Stack;
import java.util.Iterator;

public class Dienblad {
    private Stack<Artikel> artikelen;
    
    /**
    * Constructor
    */
    public Dienblad() {
        this.artikelen = new Stack<Artikel>();
    }
    
    /**
    * Methode om artikel aan dienblad toe te voegen
    * @param artikel
    */
    public void voegToe(Artikel artikel) {
        artikelen.push(artikel);
    }
    
    /**
    * Methode om iterator van artikelen op te halen
    * @return Iterator<Artikel>  
    */
   public Iterator<Artikel> getArtikelIterator(){
       return artikelen.iterator();
   }
}
