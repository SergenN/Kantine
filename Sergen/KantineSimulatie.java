public class KantineSimulatie {
    private Kantine kantine;
    /**
    * Constructor
    */
    public KantineSimulatie() {
        kantine = new Kantine();
    }
    
    /**
    * Deze methode simuleert een aantal dagen in het 
    * verloop van de kantine
    * @param dagen
    */
    public void simuleer(int dagen) {
        for(int i = 0; i < dagen; i++){
            for(int j = 0 ;j < 10 + i; j++){
                kantine.loopPakSluitAan();
            }
            kantine.verwerkRijVoorKassa();
            System.out.println("Dag " + (i+1) + ":");
            System.out.println("Artikelen verkocht: " + kantine.aantalArtikelen());
            System.out.println("Omzet van de dag: " + kantine.hoeveelheidGeldInKassa());
            kantine.resetKassa();
        }
    }
}