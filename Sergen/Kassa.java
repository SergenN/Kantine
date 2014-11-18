import java.util.ArrayList;

public class Kassa {
    private KassaRij kassaRij;
    private double geldInKassa = 0;
    private int artikelenVerkocht = 0;
    /**
    * Constructor
    */
    public Kassa(KassaRij kassarij) {
        this.kassaRij = kassarij;
    }
    
    /**
    * vraag het aantal artikelen en de totaalprijs op.
    * De implementatie wordt later vervangen 
    * door een echte betaling door de persoon. 
    * @param persoon die moet afrekenen
    */
    public void rekenAf(Persoon persoon) {
        int artikelen = persoon.getAantalArtikelen();
        double prijs = persoon.getTotaalPrijs();
        
        System.out.println("ARTS: "+artikelen+"  PRS: "+prijs);
        
        geldInKassa += prijs;
        artikelenVerkocht += artikelen;
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
}

