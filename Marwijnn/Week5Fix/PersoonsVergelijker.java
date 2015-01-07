
/**
 * Write a description of class PersoonsVergelijker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersoonsVergelijker{
    public static void main(String[] args){
        Persoon persoon1 = new Persoon(123456, "Henk", "Henkenson", 2, 1, 1990, "man");
        Persoon persoon2 = new Persoon(123456, "Henk", "Henkenson", 2, 1, 1990, "man");
        System.out.println(persoon1.toString());
        System.out.println(persoon2.toString());
        
        System.out.println("\ntest persoon1 == persoon2");
        System.out.println("Persoon1 en Persoon2 zijn " + 
            ((persoon1 == persoon2)? "": "niet ") + "geijk");
        
        System.out.println("\ntest persoon1.equals(persoon2)");
        System.out.println("Persoon1 en Persoon2 zijn " + 
            ((persoon1.equals(persoon2))? "": "niet ") + "geijk");
            
        System.out.println("\ntest persoon1 == persoon1");
        System.out.println("Persoon1 en Persoon1 zijn " + 
            ((persoon1 == persoon1)? "": "niet ") + "geijk");
    }
}
