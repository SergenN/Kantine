import java.util.ArrayList;
import java.util.Iterator;

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
        if (persoon.getDienblad() == null) return;
        Iterator<Artikel> iterator = persoon.getDienblad().
                                             getArtikelIterator();
        while(iterator.hasNext()){
                  geldInKassa += iterator.next().getPrijs();
                  artikelenVerkocht++;
             }
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

