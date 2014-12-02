public class Artikel {
    private double prijs;
    private String naam;

    /**
     * Constructor for objects of class Artikel
     */
    public Artikel(){
        setPrijs(1);
        setNaam("Onbekend");
    }
    /**
     * Constructor met parameters
     */
    public Artikel(String naamArtikel, double prijsArtikel){
        setPrijs(prijsArtikel);
        setNaam(naamArtikel);
    }
    
    /**
     * zet de prijs van het artikel
     * @param prijs
     */
    public void setPrijs(double prijs){
        if (prijs < 0) {
            prijs = 0;
        }
        this.prijs = prijs;
    }
    /**
     * zet de naam van het artikel
     * @param naam
     */
    public void setNaam(String naam){
        this.naam = naam;
    }
    /**
     * haal de naam op van het artikel
     * @return de naam van het artikel
     */
    public String getNaam(){
        return naam;
    }
    
    /**
     * haalt de prijs op van het artikel
     * @return prijs
     */
    public double getPrijs(){
        return prijs;
    }
    
    /**
     * drukt het artikel af op het scherm
     */
    public void drukAf(){
        System.out.println("Naam : " + naam + " Prijs : " + prijs);
    }
}
