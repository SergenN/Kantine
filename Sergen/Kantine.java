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
    * In deze methode kiest een Persoon met een dienblad
    * de artikelen in artikelnamen.
    * @param persoon
    * @artikelnamen
    */
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen) {
        for (String artikelnaam : artikelnamen){
            persoon.getDienblad().voegToe(kantineaanbod.getArtikel(artikelnaam));
        }
        kassarij.sluitAchteraan(persoon);
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
     * verkrijg de kassa die bij deze kantine hoort
     * @return Kassa
     */
    public Kassa getKassa(){
        return kassa;
    }
    
    /**
     * zet de kantineaanbod
     */
    public void setKantineAanbod(KantineAanbod kantineaanbod){
        this.kantineaanbod = kantineaanbod;
    }
    
    /**
     * verkrijg de kantineaanbod
     * @return KantineAanbod
     */
    public KantineAanbod getKantineAanbod(){
        return kantineaanbod;
    }
}
