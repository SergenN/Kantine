
/**
 * Write a description of class Persoon here.
 * 
 * @author Marwijnn de Kuijper  
 * @version 1 17-11-2014
 */
public class Persoon
{
    // instance variables - replace the example below with your own
    private int bsn;
    private String voornaam;
    private String achternaam;
    private int dag;
    private int maand;
    private int jaar;
    private char geslacht;
    public Persoon(int bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht){
        setBSN(bsn);
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setGeboorteDatum(dag,maand,jaar);
        setGeslacht(geslacht);
    }
    
    public int getBSN(){
        return bsn;
    }
    
    public String getVoornaam(){
        return voornaam;
    }
    
    public String getAchternaam(){
        return achternaam;
    }
    
    public String getGeboorteDatum(){
        String temp;
        if (dag==0 && maand==0 && jaar==0) {
            temp="Onbekend";
        } else {
            temp=dag+"/"+maand+"/"+jaar;
        }
        return temp;
    }
    
    public String getGeslacht(){
        String result;
        if (geslacht == 'M')        result = "Man";
        else if (geslacht == 'V')   result = "Vrouw";
        else                        result = "Onbekend";
        return result;
    }
    
    public void setGeslacht(char geslacht){
        if (geslacht != 'M' || geslacht != 'V') this.geslacht = 'A';
        else                                    this.geslacht = geslacht;
    }
    
    public void setBSN(int bsn){
        this.bsn = bsn;
    }
    
    public void setVoornaam(String voornaam){
        this.voornaam = voornaam;
    }
    
    public void setAchternaam(String achternaam){
        this.achternaam = achternaam;
    }
    
    public void setGeboorteDatum(int dag, int maand, int jaar){
        boolean error = false;
        if (jaar < 0 || maand < 0 || dag < 0) error = true;
        switch(maand){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            if(dag > 31) error = true;
            break;
            
            case 2:
            if((jaar % 100 == 0)? jaar % 400 == 0 : jaar % 4 == 0){
                if (dag > 29) error = true;
            }else{
                if (dag > 28) error = true;
            }
            break;
            default:
            if (dag > 30) error = true;
        }
        if (error){ 
            this.dag = this.maand = this.jaar = 0;
            return;
        }
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }
    
    public void drukAf(){
        System.out.println( this.getVoornaam() + " " + this.getAchternaam() +
                            "(" + this.getBSN() + ")");
        System.out.println( "geboren op : " + this.getGeboorteDatum());
        System.out.println( "geslacht: " + this.getGeslacht());
    }
}
