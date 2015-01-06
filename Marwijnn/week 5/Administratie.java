
/**
 * Write a description of class Administratie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administratie {
    /**
    * Deze methode berekent van de int array aantal de
    * gemiddelde waarde
    * @param aantal
    * @return het gemiddelde
    */
    private static final int DAYS_IN_WEEK = 7;
   
    public static double berekenGemiddeldAantal(int[] aantal) {
        int totaal = 0;
        for (int i = 0; i < aantal.length; i++){
            totaal += aantal[i];
        }
        
        return ((double) totaal) / aantal.length; 
    }
    
    /**
    * Deze methode berekent van de double array omzet de
    * gemiddelde waarde
    * @param omzet
    * @return Het gemiddelde
    */
    public static double berekenGemiddeldeOmzet(double[] omzet) {
        double totaal = 0;
        for (int i = 0; i < omzet.length; i++){
            totaal += omzet[i];
        }
        
        return totaal / omzet.length;
    }
    
    /**
    * Methode om dagomzet uit te rekenen
    * @param omzet
    * @return array (7 elementen) met dagomzetten
    */
    public static double[] berekenDagOmzet(double[] omzet) {
        double[] temp=new double[DAYS_IN_WEEK];
        for(int i=0;i<DAYS_IN_WEEK;i++) {
            int j=0;
            while( omzet.length > (i + DAYS_IN_WEEK * j) ) {
                temp[i]+=omzet[i+DAYS_IN_WEEK*j];
                j++;
            }
        }
        return temp;
    }
}