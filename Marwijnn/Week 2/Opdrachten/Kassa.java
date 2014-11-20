
/**
 * Write a description of class Kassa here.
 * 
 * @author Marwijnn de Kuijper
 * @version 1 19-11-2014
 */
public class Kassa {
    private int artikelAantal;
    private int hoeveelheidGeld;
    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij){
        resetKassa();
    }
    
    /** 
     * vraag het aantal artikelen en de totaalprijs op.
     * De implementatie wordt later vervangen
     * door een echte betaling door de persoon.
     * @param persoon die moet afrekenen
     */
    public void rekenAf(Persoon persoon){
        this.hoeveelheidGeld += persoon.getTotaalPrijs();
        this.artikelAantal += persoon.getAantalArtikelen();
    }
    
    /**
     * Geeft het aantal artikelen dat de kassa
     * heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden
     * is aangeroepen.
     * @return aantal artikelen
     */
    public int aantalArtikelen(){
        return this.artikelAantal; 
    }
    
    /**
     * Geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa
     * is aangeroepen.
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa(){
        return this.hoeveelheidGeld; 
    }
    
    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa(){
        this.hoeveelheidGeld = 0;
        this.artikelAantal = 0;
    }
}