
/**
 * Write a description of class Docent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docent extends Persoon{
    // instance variables - replace the example below with your own
    private String afkorting;
    private String afdeling;

    /**
     * Constructor for objects of class Docent
     */
    public Docent(){
        super();
        setAfkorting("XXXX");
        setAfdeling("Onbekend");
    }

    /**
     * Methode om afkorting toe te wijzen
     * @oaram afkorting
     */
    public void setAfkorting(String afkorting){
        if (afkorting.length() != 4) return;
        this.afkorting = afkorting;
    }
    
    /**
     * Methode om afkoritng op te halen
     * @return afkorting
     */
    public String getAfkorting(){
        return afkorting;
    }
    
    /**
     * Methode om afdeling toe te wijzen
     * @param afdeling
     */
    public void setAfdeling(String afdeling){
        this.afdeling = afdeling;
    }
    
    /**
     * Methode om afdeling op te halen
     * @return afdeling
     */
    public String getAfdeling(){
        return afdeling;
    }
    
    /**
     * Methode om de gegevens van Docent op het scherm af te drukken
     */
    public void drukAf(){
        System.out.println("Docent (" + getAfkorting() + ") werkt op " + getAfdeling());
    }
    
}
