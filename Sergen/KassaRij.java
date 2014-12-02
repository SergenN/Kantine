import java.util.LinkedList;

public class KassaRij {
    public LinkedList<Persoon> personen;
    /**
    * Constructor
    */
    public KassaRij() {
        personen = new LinkedList<Persoon>();
    }
    
    /**
    * Persoon sluit achter in de rij aan
    * @param persoon
    */
    public void sluitAchteraan(Persoon persoon) {
        personen.addLast(persoon);
    }
    
    /**
    * Indien er een rij bestaat, de eerste Persoon uit
    * de rij verwijderen en retourneren. 
    * Als er niemand in de rij staat geeft deze null terug.
    * @return Eerste persoon in de rij of null
    */
    public Persoon eerstePersoonInRij() {
        if(erIsEenRij()){
            Persoon toReturn = personen.getFirst();
            personen.removeFirst();
            return toReturn;
        }
        return null;
    }
    
    /**
    * Methode kijkt of er personen in de rij staan. 
    * @return Of er wel of geen rij bestaat
    */
    public boolean erIsEenRij() {
        return (personen.size() > 0);
    }
}
