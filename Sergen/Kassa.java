import java.util.Stack;

public class Kassa {
    private KassaRij kassarij;
    private double geldInKassa;
    private int artikelenVerkocht;
    
    /**
    * Constructor
    */
    public Kassa(KassaRij kassarij) {
        this.kassarij = kassarij;
        resetKassa();
    }
    
    /**
    * vraag het aantal artikelen en de totaalprijs op.
    * De implementatie wordt later vervangen 
    * door een echte betaling door de persoon. 
    * @param persoon die moet afrekenen
    */
    public void rekenAf(Persoon persoon) {
        artikelenVerkocht += getAantalArtikelen(persoon);
        geldInKassa += getTotaalPrijs(persoon);
    }
    
    /**
    * Geeft het aantal artikelen dat de kassa 
    * heeft gepasseerd, 
    * vanaf het moment dat de methode resetWaarden 
    * is aangeroepen.
    * @return aantal artikelen
    */
    public int aantalArtikelen() {
        return artikelenVerkocht;
    }
    
    /**
    * Geeft het totaalbedrag van alle artikelen die
    * de kassa zijn gepasseerd, vanaf het moment dat de methode
    * resetKassa 
    * is aangeroepen.
    * @return hoeveelheid geld in de kassa
    */
    public double hoeveelheidGeldInKassa() {
        return geldInKassa;
    }
    
    /**
    * reset de waarden van het aantal gepasseerde artikelen en 
    * de totale hoeveelheid geld in de kassa.
    */
    public void resetKassa() {
        geldInKassa = 0;
        artikelenVerkocht = 0;
    }
    
   /**
    * Methode om aantal artikelen op dienblad te tellen
    * @return Het aantal artikelen 
    */
    public int getAantalArtikelen(Persoon persoon) {
        return persoon.getDienblad().getArtikelen().size();
    }
    
    /**
    * Methode om de totaalprijs van de artikelen 
    * op dienblad uit te rekenen
    * @return De totaalprijs
    */
    public double getTotaalPrijs(Persoon persoon) {
        double prijs = 0;
        Stack<Artikel> artikelen = persoon.getDienblad().getArtikelen();
        for(Artikel a : artikelen){
            prijs += a.getPrijs();
        }
        return prijs;
    }
}

