
/**
 * Write a description of class KantineSimulatie here.
 * 
 * @author  Marwijnn de Kuijper
 * @version 1 19-11-2014
 */
public class KantineSimulatie{
    private Kantine kantine;
    /**
     * Constructor
     */
    public KantineSimulatie(){
        kantine=new Kantine();
    }
    
    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen){
         for(int i = 0; i < dagen; i++){
            for(int j=0;j<10+i;j++){
                this.kantine.loopPakSluitAan();
            }
            this.kantine.verwerkRijVoorKassa();
            System.out.println("Dag " + (i+1) + ":");
            System.out.println("   Totale opbrengst: " +
                        this.kantine.hoeveelheidGeldInKassa());
            System.out.println("   Totaal verkocht: " + 
                        this.kantine.aantalArtikelen());
            this.kantine.resetKassa();
        }
    } 
}
