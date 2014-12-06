public class Kantine {
    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod kantineaanbod;
    
    /**
    * Constructor
    */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }
    
    /**
     * In deze methode wordt het Kantine Aanbod opgehaalt
     * @return Kantine Aanbod
     */
    public KantineAanbod getKantineAanbod(){
        return kantineaanbod;
    }
    
    /**
     * In deze methode wordt het kantine aanbod toegewezen
     * @param kantineaanbod 
     */
    public void setKantineAanbod(KantineAanbod kantineaanbod){
        this.kantineaanbod = kantineaanbod;
    }
    
    /**
    * Deze methode handelt de rij voor de kassa af.
    */
    public void verwerkRijVoorKassa() {
        while(kassarij.erIsEenRij()) {
            kassa.rekenAf(kassarij.eerstePersoonInRij());
        }
    }
    
   /**
    * In deze methode wordt een Persoon en Dienblad
    * gemaakt en aan elkaar
    * gekoppeld. Maak twee Artikelen aan en plaats 
    * deze op het dienblad.   
    * Tenslotte sluit de Persoon zich aan bij de rij 
    * voor de kassa.
    */
    public void loopPakSluitAan() {
        //nieuwe objecten aanmaken en persoon dienblad laten pakken
        Persoon persoon = new Persoon();
        Dienblad dienblad = new Dienblad();
        persoon.pakDienblad(dienblad);
        
        //artikelen aanmaken
        Artikel art1 = new Artikel();
        Artikel art2 = new Artikel();
        
        //persoon artikelen laten pakken
        persoon.getDienblad().voegToe(art1);
        persoon.getDienblad().voegToe(art2);
        
        //persoon laten aansluiten
        kassarij.sluitAchteraan(persoon);
    }
    
   /**
    * In deze methode kiest een Persoon met een dienblad
    * de artikelen in artikelnamen.
    * @param persoon
    * @artikelnamen
    */ 
   public void loopPakSluitAan(Persoon persoon, String[] artikelnamen) {
       Dienblad dienblad = new Dienblad();
       persoon.pakDienblad(dienblad);
       for (int i = 0; i < artikelnamen.length; i++) {
            persoon.getDienblad().voegToe(
                kantineaanbod.getArtikel(artikelnamen[i])
            );
       }
       kassarij.sluitAchteraan(persoon);
   }
    
    
    /**
    * Deze methode haalt de kassa op
    * @return de kassa
    */
   public Kassa getKassa(){
      return kassa; 
   }
}
