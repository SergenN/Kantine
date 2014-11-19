
/**
 * Write a description of class Artikel here.
 * 
 * @author Marwijnn de Kuijper 
 * @version 1 17-11-2014
 */
public class Artikel
{
    // instance variables - replace the example below with your own
    private int prijs;
    private String naam;

    public Artikel(String naam, int prijs)
    {
        // initialise instance variables
        this.prijs = prijs;
        this.naam = naam;
    }
    
    public int getPrijs(){
        return prijs;
    }
    
    public String getNaam(){
        return naam;
    }
    
    public void setNaam(String naam){
        this.naam = naam;
    }
    
    public void setPrijs(int prijs){
        this.prijs = prijs;
    }
    
    public void drukAf(){
        System.out.println("Naam : " + naam + " Prijs : " + prijs);
    }

}
