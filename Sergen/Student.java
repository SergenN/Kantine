public class Student extends Persoon {
    
    private int studentnummer;
    private String studierichting;
    
    /**
     * Constructor for objects of class Student
     */
    public Student(){
        super();
        setStudentnummer(0);
        setStudierichting("Onbekend");
    }
    
    /**
     * Constructor for objects of class Student
     */
    public Student(long BSN, String voornaam, String achternaam, int dag, int maand, int jaar, String geslacht, int studentnummer, String studierichting){
        super(BSN, voornaam, achternaam, dag, maand, jaar, geslacht);
        setStudentnummer(studentnummer);
        setStudierichting(studierichting);
    }
    
    /**
     * verander de studentnummer van dit object
     * @param studentnummer nieuwe studentnummer
     */
    public void setStudentnummer(int studentnummer){
        this.studentnummer = studentnummer;
    }
    
    /**
     * verkrijg de studentnummer van dit object
     * @return studentnummer van het object
     */
    public int getStudentnummer(){
        return studentnummer;
    }
    
    /**
     * verander de studierichting van dit object
     * @param studierichting nieuwe studierichting
     */
    public void setStudierichting(String studierichting){
        this.studierichting = studierichting;
    }
    
    /**
     * verkrijg de studierichting van dit object
     * @return studierichting van het object
     */
    public String getStudierichting(){
        return studierichting;
    }
    
    /**
     * druk de studierichting en studentnummer van dit object af
     */
    @Override
    public void drukAf(){
        System.out.println("Studierichting: " + getStudierichting());
        System.out.println("Studentnummer: " + getStudentnummer());
    }
}
