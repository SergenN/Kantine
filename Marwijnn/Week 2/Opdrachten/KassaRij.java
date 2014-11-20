
/**
 * Write a description of class KassaRij here.
 * 
 * @author Marwijnn de Kuijper 
 * @version 1 19-11-2014
 */
import java.util.ArrayList;
public class KassaRij{
    private ArrayList<Persoon> personen;
    
    /**
     * Constructor for objects of class KassaRij
     */
    public KassaRij(){
        this.personen = new ArrayList<Persoon>();
    }

    /**
     * Persoon sluit achter in de rij aan
     * @param persoon
     */
    public void sluitAchteraan(Persoon persoon){
        this.personen.add(persoon);
    }
    
    /**
     * Indien er een rij bestaat, de eerste Persoon uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     * @return Eerste persoon in de rij of null
     */ 
    public Persoon eerstePersoonInRij(){
        if(!this.erIsEenRij()) return null;
        Persoon temp = this.personen.get(0);
        this.personen.remove(0);
        return temp;
    }
    
    /**
     * Methode kijkt of er personen in de rij staan.
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij(){
       return (this.personen.isEmpty())? false:true;
    }
    
}
