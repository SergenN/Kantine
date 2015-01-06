public class Pinpas extends Betaalwijze {
    
    private double kredietlimiet;
    
    /**
     * Methode om kredietlimiet te zetten
     * @param kredietlimiet
     */
    public void setKredietLimiet(double kredietlimiet) {
        this.kredietlimiet = kredietlimiet;
    }
    
    /**
     * Methode om betaling af te handelen
     */
    public void betaal(double tebetalen) throws TeWeinigGeldException{
        if (saldo >= tebetalen || kredietlimiet <= (saldo - tebetalen)){
            setSaldo(saldo - tebetalen);
            return;
        }
        throw new TeWeinigGeldException("Te weinig geld!");
    }
}