import java.util.Stack;

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
    
    public Stack getArtikelen(){
        return artikelen;
    }
}
