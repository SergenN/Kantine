public class Persoon {
    private long BSN;
    private String voornaam, achternaam;
    private int dag, maand, jaar;
    private char geslacht = 'N';
    private Dienblad dienblad;

    public Persoon(){
        setVoornaam("Onbekend");
        setAchternaam("Onbekend");
        setBSN(1111111);
        setGeboorteDatum(0,0,0);
        setGeslacht("???");
    }
    
    public Persoon(long BSN, String voornaam, String achternaam, int dag, int maand, int jaar, String geslacht) {
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setBSN(BSN);
        setGeboorteDatum(dag, maand, jaar);
        setGeslacht(geslacht);
    }
    
    public void drukAf(){
        System.out.println("Voornaam: "+ getVoornaam());
        System.out.println("Achternaam: "+ getAchternaam());
        System.out.println("GeboorteDatum: "+ getGeboorteDatum());
        System.out.println("Geslacht: "+ getGeslacht());
        System.out.println("Burgerserivenummer: "+ getBSN());
    }
    
    public long getBSN(){
        return BSN;
    }
    
    public String getVoornaam(){
        return voornaam;
    }
    
    public String getAchternaam(){
        return achternaam;
    }
   
    public String getGeboorteDatum() {
        String temp;
        if (dag==0 && maand==0 && jaar==0) {
            temp="Onbekend";
        } else {
            temp=dag+"/"+maand+"/"+jaar;
        }
        return temp;
    }
    
    public String getGeslacht(){
        if (geslacht == 'M'){
            return "Man";
        }
        if (geslacht == 'V'){
            return "Vrouw";
        }
        return "Onbekend";
    }
    
    public void setAchternaam(String achternaam){
        this.achternaam = achternaam;
    }
    
    public void setVoornaam(String voornaam){
        this.voornaam = voornaam;
    }
    
    public void setGeslacht(String geslacht){
        if(geslacht.equalsIgnoreCase("man")){
            this.geslacht = 'M';
        } else if (geslacht.equalsIgnoreCase("vrouw")){
            this.geslacht = 'V';
        }
    }
    
    public void setBSN(long BSN){
        this.BSN = BSN;
    }
    
    public void setGeboorteDatum(int dag, int maand, int jaar){
        if (!isCorrecteDatum(dag, maand, jaar)){
            dag = 0;
            maand = 0;
            jaar = 0;
        }
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }
    
    private boolean isCorrecteDatum(int dag, int maand, int jaar){
        if (jaar < 1900 || jaar > 2100) {//jaar fout
            return false;
        }
        
        if (maand < 1 || maand > 12){//maand fout
            return false;
        }
        
        if (dag < 1 || dag > 31) {//dag fout
            return false;
        }
        
        if ((maand == 4 || maand == 6 || maand == 9 || maand == 11) && dag > 30){//april, juni, september en november mogen niet meer dan 30 dagen hebben
            return false;
        }
        
        if (maand == 2){ // als februari
            if (isSchrikkeljaar(jaar) && dag > 29) {// en schrikkeljaar dan max 29 dagen
                return false;
            } else if (dag > 28){// geen schrikkeljaar max 28 dagen
                return false;
            }
        }
        
        return true;//alles goed
    }
    
    private boolean isSchrikkeljaar(int jaar){
        return jaar%100 == 0 ? jaar%400 == 0 : jaar%4 == 0;
    }
    
    /**
    * Methode om dienblad te koppelen aan een persoon
    * @param dienblad
    */
    public void pakDienblad(Dienblad dienblad) {
        this.dienblad = dienblad;
    }
    
    /**
    * Methode om artikel te pakken en te plaatsen op het dienblad
    * @param artikel
    */
    public void pakArtikel(Artikel artikel) {
        dienblad.voegToe(artikel);
    }
    
    /**
    * Methode om de totaalprijs van de artikelen 
    * op dienblad dat bij de persoon hoort uit te rekenen
    * @return De totaalprijs
    */
    public double getTotaalPrijs() {
        return dienblad.getTotaalPrijs();
    } 
    
    /**
    * Methode om het aantal artikelen op dienblad dat bij de 
    * persoon hoort te tellen
    * @return Het aantal artikelen
    */
    public int getAantalArtikelen() {
        return dienblad.getAantalArtikelen();
    }
}
