public class Docent extends Persoon implements KortingskaartHouder{
    
    private String afkorting;
    private String afdeling;
    private double kortingPercentage;
    private boolean heeftMaximum;
    private double maximum;
    
    /**
     * Constructor for objects of class Docent
     */
    public Docent(){
        super();
        setAfkorting("Onbekend");
        setAfdeling("Onbekend");
    }
    
    /**
     * Constructor for objects of class Docent
     */
    public Docent(long BSN, String voornaam, String achternaam, int dag, int maand, int jaar, String geslacht, String afkorting, String afdeling){
        super(BSN, voornaam, achternaam, dag, maand, jaar, geslacht);
        setAfkorting(afkorting);
        setAfdeling(afdeling);
    }
    
    /**
     * verkrijg de afdeling van dit object
     * @return afdeling de afdeling van dit object
     */
    public String getAfdeling(){
        return afkorting;
    }
    
    /***
     * verander de afdeling van dit object
     * @param String afdeling van dit object
     */
    public void setAfdeling(String afdeling){
        this.afdeling = afdeling;
    }
    
    /**
     * verkrijg de afkorting van dit object
     * @return afkorting van dit object
     */
    public String getAfkorting(){
        return afkorting;
    }
    
    /**
     * verander de afkorting van dit object
     * @param afkorting van dit object
     */
    public void setAfkorting(String afkorting){
        this.afkorting = afkorting;
    }
    
    /*
     * druk de afkorting en afdeling van dit object af
     *
    @Override
    public void drukAf(){
        System.out.println("afkorting: " + getAfkorting());
        System.out.println("afdeling: " + getAfdeling());
    }*/
    
    @Override
    public String toString(){
        return super.toString() + "\nAfkorting: " + getAfkorting() + "/nAfdeling: " + getAfdeling();
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
