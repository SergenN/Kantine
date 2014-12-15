import java.util.*;

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
     * verkrijg alle artikelen op het dienblad.
     * @return Stack<artikelen>
     */
    public Iterator<Artikel> getArtikelen(){
        return artikelen.iterator();
    }
}
