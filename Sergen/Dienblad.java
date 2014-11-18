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
    
    /**
    * Methode om aantal artikelen op dienblad te tellen
    * @return Het aantal artikelen 
    */
    public int getAantalArtikelen() {
        return artikelen.size();
    }
    
    /**
    * Methode om de totaalprijs van de artikelen 
    * op dienblad uit te rekenen
    * @return De totaalprijs
    */
    public double getTotaalPrijs() {
        int prijs = 0;
        for(Artikel a : artikelen){
            prijs += a.getPrijs();
        }
        return prijs;
    }
}
