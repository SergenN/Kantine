public class Administratie {
    
    private static final int DAYS_IN_WEEK = 7; 
    
    /**
     * Private constructor
     */
    private Administratie(){}
    
    /**
     * Deze methode berekent van de int array aantal de
     * gemiddelde waarde
     * @param aantal
     * @return het gemiddelde
     */
    public static double berekenGemiddeldAantal(int[] aantal) {
        if (aantal.length == 0) return 0;
        
        int sum = 0;
        for(int enkelAantal : aantal){
            sum += enkelAantal;
        }
        
        return ((double)sum) / aantal.length;
    }
    
    /**
     * Deze methode berekent van de double array omzet de
     * gemiddelde waarde
     * @param omzet
     * @return Het gemiddelde
     */
    public static double berekenGemiddeldeOmzet(double[] omzet) {
        if (omzet.length == 0) return 0;
        
        double sum = 0.0;
        for (double enkelOmzet : omzet){
            sum += enkelOmzet;
        }
        
        return sum / omzet.length;
    }
    
    /**
     * Methode om dagomzet uit te rekenen
     * @param omzet
     * @return array ((days_in_week) elementen) met dagomzetten
     */
    public static double[] berekenDagOmzet(double[] omzet) {
        double[] temp = new double[DAYS_IN_WEEK];
        for(int i = 0; i < DAYS_IN_WEEK; i++) {
            int j = 0;
            while( (i + (DAYS_IN_WEEK * j)) < omzet.length) {
                temp[i] += omzet[i + DAYS_IN_WEEK * j];
                j++;
            }
        }
        return temp;
    }
}

