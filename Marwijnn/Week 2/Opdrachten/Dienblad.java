
/**
 * Write a description of class Dienblad here.
 * 
 * @author Marwijnn de Kuijper 
 * @version 1 19-11-2014
 */
import java.util.LinkedList;

public class Dienblad{
    private LinkedList<Artikel> artikelen;//Linkedlist? moet stack zijn!
    private int aantalArtikelen;
    private double totaalPrijs;
    

    /**
     * Constructor
     */
    public Dienblad(){
        this.artikelen = new LinkedList<Artikel>();
        this.aantalArtikelen = 0;
        this.totaalPrijs = 0;
    }
    
    /**
     * Methoe om artikelen aan dienblad toe te voegen
     * @param artikel
     */
    public void voegToe(Artikel artikel){
        this.artikelen.add(artikel);
        this.totaalPrijs += artikel.getPrijs();
        this.aantalArtikelen++;
    }
     
    /**
     * Methode om aantal artikelen op dienblad te tellen
     * @return Het aantal arikelen
     */
    public int getAantalArtikelen(){
        return this.aantalArtikelen;
    }
    
    /**
     * Methode om de totaalprijs van de artikelen
     * op dienblad uit te rekenen
     * @return De totaalprijs
     */
    public double getTotaalPrijs(){
        return this.totaalPrijs;//Klopt niet zie javadoc
    }
}
