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
        Iterator<Artikel> iterator = persoon.getDienblad().
                                             getArtikelIterator();
        Betaalwijze betaalwijze = persoon.getBetaalwijze();
        if (betaalwijze == null) {
            System.out.println("ERROR: Geen betaalwijze");
            return;
        }
        KortingskaartHouder kortingskaart = null;
        if (persoon instanceof KortingskaartHouder){
            kortingskaart = (KortingskaartHouder) persoon;
        }
        
        
          
        System.out.println("betaalwijze : " + betaalwijze.getClass().getName());
        while(iterator.hasNext()){
                double korting = 0;
                double prijs = iterator.next().getPrijs();
                if(kortingskaart != null){
                    korting = prijs * kortingskaart.geefKortingsPercentage();
                    if (korting > kortingskaart.geefMaximum() && kortingskaart.heeftMaximum()) 
                        korting = kortingskaart.geefMaximum();
                }
                
                if(betaalwijze.betaal(prijs)){
                      geldInKassa = BigDecimal.valueOf(geldInKassa).add(
                        BigDecimal.valueOf(prijs - korting)).doubleValue();
                      artikelenVerkocht++;
                }else{
                    System.out.println("ERROR: kan artikel niet betalen");
                }
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

