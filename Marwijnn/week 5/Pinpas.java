public class Pinpas extends Betaalwijze {
    private double kredietlimiet;
    /**
     * Methode om kredietlimiet te zetten
     * @param kredietlimiet
     */
    
    public void setKredietLimiet(double kredietlimiet) {
        if (kredietlimiet < 0) kredietlimiet = 0;
        this.kredietlimiet = kredietlimiet;
    }
    
    /** 
     * Methode om betaling af te handelen
     */
    public boolean betaal(double tebetalen) {
        if (kredietlimiet < tebetalen) return false;
        if (saldo < tebetalen) return false;
        saldo -= tebetalen;
        return true;
    } 
}
