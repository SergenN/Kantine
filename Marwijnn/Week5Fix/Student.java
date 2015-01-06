
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Persoon{
    private int studentnummer;
    private String studierichting;

    /**
     * Constructor for objects of class Student
     */
    public Student(){
        super();
        setStudentnummer(0);
        setStudierichting("onbekend");
    }
    
    /**
     * methode om het studentnummer toetewijzen
     * @param studentnummer
     */
    public void setStudentnummer(int studentnummer){
        if (studentnummer < 0) studentnummer = 0;
        this.studentnummer = studentnummer;
    }
    
    /**
     * methode om het studentnummer optehalen
     * @return studentnummer
     */
    public int getStudentnummer(){
        return studentnummer;
    }
    
    /**
     * methode om de studierichting aantewijzen
     * @param studierichting
     */
    public void setStudierichting(String studierichting){
        this.studierichting = studierichting;
    }
    
    /**
     * methode om de studierichting op te halen
     * @return studierichting
     */
    public String getStudierichting(){
        return studierichting;
    }
    
    /**
     * Methode om de gegevens van Student op te halen als een String
     * @return gegevens Student
     */
    @Override
    public String toString(){
        return (super.toString() + "\nStudent #" + getStudentnummer() + " studeert " + getStudierichting());
    }
}
