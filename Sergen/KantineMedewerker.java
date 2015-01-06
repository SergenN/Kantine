public class KantineMedewerker extends Persoon implements KortingskaartHouder{
    
    private int medewerkersnummer;
    private boolean kassaGeschikt;
    private double kortingPercentage;
    private boolean heeftMaximum;
    private double maximum;
    
    /**
     * Constructor for objects of class KantineMedewerker
     */
    public KantineMedewerker(){
        super();
        setKassaGeschikt(false);
        setMedewerkersnummer(0);
    }
    
    /**
     * Constructor for objects of class KantineMedewerker
     */
    public KantineMedewerker(long BSN, String voornaam, String achternaam, int dag, int maand, int jaar, String geslacht, int medewerkersnummer, boolean kassaGeshikt){
        super(BSN, voornaam, achternaam, dag, maand, jaar, geslacht);
        setMedewerkersnummer(medewerkersnummer);
        setKassaGeschikt(kassaGeschikt);
    }
    
    /**
     * Verkrijg de medewerkers nummer van dit object
     * @return medewerkersnummer    nummer van medewerker
     */
    public int getMedewerkersnummer(){
        return medewerkersnummer;
    }
    
    /**
     * Wijzig de medewerkersnummer van dit object
     * @param medewerkersnummer 
     */
    public void setMedewerkersnummer(int medewerkersnummer){
        this.medewerkersnummer = medewerkersnummer;
    }
    
    /**
     * Check of dit object kassageschikt is (achter de kassa mag)
     * @return kassaGeschikt true als de medewerker achter de kassa mag staan
     */
    public boolean isKassaGeschikt(){
        return kassaGeschikt;
    }
    
    /**
     * wijzig de kassageschiktheid van dit object
     * @param kassaGeschikt true als de medewerker achter de kassa mag staan
     */
    public void setKassaGeschikt(boolean kassaGeschikt){
        this.kassaGeschikt = kassaGeschikt;
    }
    
    /*
     * Druk de kassageschiktheid en medewerkersnummer van dit object af
     *
    @Override
    public void drukAf(){
        System.out.println("Medewerkersnummer: " + getMedewerkersnummer());
        System.out.println("Kan achter de kassa: " + isKassaGeschikt());
    }*/
    @Override
    public String toString(){
        return super.toString() + "\nMedewerkersnummer: " + getMedewerkersnummer() + "/nKan achter de kassa: " + isKassaGeschikt();
    }
    
    /**
     * methode om kortingspercentage op te vragen
     */
    public double geefKortingsPercentage(){
        return kortingPercentage;
    }
    
    /**
     * methode om op te vragen of er maximum per keer aan de korting zit
     */
    public boolean heeftMaximum(){
        return heeftMaximum;
    }
    
    /**
     * methode om het maximum kortingsbedrag op te vragen
     */
    public double geefMaximum(){
        return maximum;
    }
}