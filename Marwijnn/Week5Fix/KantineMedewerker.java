
/**
 * Write a description of class KantineMedewerker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KantineMedewerker extends Persoon {
    // instance variables - replace the example below with your own
    private int medewerkersnummer;
    private boolean magachterkassa;

    /**
     * Constructor for objects of class KantineMedewerker
     */
    public KantineMedewerker(){
       super();
       setMedewerkersnummer(0);
       magAchterKassa(false);
    }
    
    /**
     * Methode om het medewerkersnummer toe te wijzen
     * @param medewerkersnummer
     */
    public void setMedewerkersnummer(int medewerkersnummer){
        this.medewerkersnummer = medewerkersnummer;
    }
    
    /**
     * Methode om het medewerkersnummer op te halen
     * @return medewerkersnummer
     */
    public int getMedewerkersnummer(){
        return medewerkersnummer;
    }
    
    /**
     * Methode om te controleren of kantine medewerker acher de kassa mag staan
     * @return magachterkassa
     */
    public boolean magAchterKassa(){
        return magachterkassa;
    }
    
    /**
     * Methode om toetewijzen of medewerker achter kassa mag
     * @param magachterkassa
     */
    public void magAchterKassa(boolean magachterkassa){
        this.magachterkassa = magachterkassa;
    }
    
    /**
     * Methode om de gegevens van KantineMedewerker als string op te halen
     * @return gegevens van KantineMedewerker
     */
    public String toString(){
        return (super.toString() + "\nKantineMedewerker #" + getMedewerkersnummer() + " mag " +
                    (magAchterKassa()?"": "niet") + " achter de kassa" );
    }
    
    public double geefKortingsPercentage(){
        return 0.35;
    }
    
    public boolean heeftMaximum(){
        return false;
    }
    
    public double geefMaximum(){
        return 0;
    }
}
