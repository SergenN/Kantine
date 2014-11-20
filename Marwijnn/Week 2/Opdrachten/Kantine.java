
/**
 * Write a description of class Kantine here.
 * 
 * @author Marwijnn de Kuijper 
 * @version 1 19-11-2014
 */
public class Kantine{
     private Kassa kassa;
     private KassaRij kassarij;
     
    /**
     * Constructor
     */
    public Kantine(){
        kassarij=new KassaRij();
        kassa=new Kassa(kassarij);
    }
    
    /**
     * In deze methode wordt een Persoon en Dienblad
     * gemaakt en aan elkaar
     * gekoppeld. Maak twee Artikelen aan en plaats
     * deze op het dienblad.
     * Tenslotte sluit de Persoon zich aan bij de rij
     * voor de kassa.
     */
    public void loopPakSluitAan(){
        Persoon persoon = new Persoon();
        this.kassarij.sluitAchteraan(persoon);
    }
    
    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa(){
        while(this.kassarij.erIsEenRij()){
            this.kassa.rekenAf(this.kassarij.eerstePersoonInRij());
        } 
    }
    
    /**
     * Deze methode telt het geld uit de kassa
     * @return hoeveelheid geld in kassa
     */
    public double hoeveelheidGeldInKassa(){ 
        return this.kassa.hoeveelheidGeldInKassa(); 
    }
    
    /**
     * Deze methode geeft het aantal gepasseerde artikelen.
     * @return het aantal gepasseerde artikelen
     */
    public int aantalArtikelen(){
        return this.kassa.aantalArtikelen();
    }
    
    /**
     * Deze methode reset de bijgehouden telling van
     * het aantal artikelen
     * en "leegt" de inhoud van de kassa.
     */
    public void resetKassa(){
        this.kassa.resetKassa();
    } 
}
