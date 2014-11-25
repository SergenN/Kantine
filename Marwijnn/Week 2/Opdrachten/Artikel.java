
/**
 * Write a description of class Artikel here.
 * 
 * @author Marwijnn de Kuijper 
 * @version 1 17-11-2014
 */
public class Artikel
{
    // instance variables - replace the example below with your own
    private int prijs;//double price!
    private String naam;
    
    public Artikel(){
        setPrijs(0);
        setNaam("Onbekend");
    }
    
    public Artikel(String naam, int prijs)
    {
        // initialise instance variables
        this.prijs = prijs;
        this.naam = naam;
    }
    
    public int getPrijs(){
        return this.prijs;
    }
    
    public String getNaam(){
        return this.naam;
    }
    
    public void setNaam(String naam){
        this.naam = naam;
    }
    
    public void setPrijs(int prijs){
        if (prijs < 0)  this.prijs = 0;
        else            this.prijs = prijs;
    }
    
    public void drukAf(){
        System.out.println("Naam : " + naam + " Prijs : " + prijs);
    }

}
