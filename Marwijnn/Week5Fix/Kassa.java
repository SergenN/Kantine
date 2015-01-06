import java.util.ArrayList;
import java.util.Iterator;
import java.math.BigDecimal;

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
        
        double korting = 0;
        double totaalPrijs = getTotaalPrijs(persoon);
        
        if (persoon instanceof KortingskaartHouder) {
            KortingskaartHouder houder = (KortingskaartHouder)persoon;
            korting = totaalPrijs - (totaalPrijs / 100 * houder.geefKortingsPercentage());
            if (houder.heeftMaximum() && (korting > houder.geefMaximum())){
                korting = houder.geefMaximum();
            }
        }
        
        Betaalwijze betaalwijze = persoon.getBetaalwijze();
        if (betaalwijze == null) {
            System.out.println("ERROR: Geen betaalwijze");
            return;
        }
        
        System.out.println("betaalwijze : " + betaalwijze.getClass().getName());
        if(betaalwijze.betaal(totaalPrijs - korting)){
            geldInKassa = BigDecimal.valueOf(geldInKassa).add(BigDecimal.valueOf(totaalPrijs - korting)).doubleValue();
            artikelenVerkocht += getAantalArtikelen(persoon);
        } else {
            System.out.println("ERROR: kan artikel niet betalen");
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
    
       /**
    * Methode om aantal artikelen op dienblad te tellen
    * @return Het aantal artikelen 
    */
    public int getAantalArtikelen(Persoon persoon) {
        int i = 0;
        Iterator<Artikel> artikelen = persoon.getDienblad().getArtikelIterator();
        while(artikelen.hasNext()) {
            i++;
            artikelen.next();
        }
        return i;
    }
    
    /**
    * Methode om de totaalprijs van de artikelen 
    * op dienblad uit te rekenen
    * @return De totaalprijs
    */
    public double getTotaalPrijs(Persoon persoon) {
        double prijs = 0;
        Iterator<Artikel> artikelen = persoon.getDienblad().getArtikelIterator();
        while(artikelen.hasNext()){
            Artikel artikel = artikelen.next();
            prijs += artikel.getPrijs();
        }
        return prijs;
    }
}

