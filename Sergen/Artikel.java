/**
 * Write a description of class Artikel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
    
    public Artikel(String naamArtikel, double prijsArtikel){
        setPrijs(prijsArtikel);
        setNaam(naamArtikel);
    }
    
    public void setPrijs(double prijs){
        if (prijs < 0) {
            prijs = 0;
        }
        this.prijs = prijs;
    }
    
    public void setNaam(String naam){
        this.naam = naam;
    }
    
    public String getNaam(){
        return naam;
    }
    
    public double getPrijs(){
        return prijs;
    }
    
    public void drukAf(){
        System.out.println("Naam : " + naam + " Prijs : " + prijs);
    }

        
}
