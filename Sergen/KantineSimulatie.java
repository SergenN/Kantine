import java.util.*;
import java.text.*;

public class KantineSimulatie {
    // kantine
    private Kantine kantine;
    
    // kantineaanbod
    private KantineAanbod kantineaanbod;
    
    // random generator
    private Random random;
    
    // aantal artikelen
    private int aantal_artikelen;
    
    // artikelen
    private ArrayList<String> artikelnamen;
    //private static final String[] artikelnamen = new String[] {"Koffie", "Broodje pindakaas", "Broodje kaas", "Appelsap"};
    
    // prijzen
    private ArrayList<Double> artikelprijzen;
    //private static double[] artikelprijzen = new double[]{1.50, 2.10, 1.65, 1.65};
    
    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT = 10000;
    private static final int MAX_ARTIKELEN_PER_SOORT = 20000;
    
    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG = 50;
    private static final int MAX_PERSONEN_PER_DAG = 100;
    
    // minimum en maximum aantal personen per dag
    private static final int AANTAL_STUDENTEN = 89;
    private static final int AANTAL_DOCENTEN = 10;
    private static final int AANTAL_MEDEWERKERS = 1;
    
    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON = 1;
    private static final int MAX_ARTIKELEN_PER_PERSOON = 4;
    
    /**
    * Constructor
    */
    public KantineSimulatie(){
        aantal_artikelen = 0;
        artikelnamen = new ArrayList<String>();
        artikelprijzen = new ArrayList<Double>();
        kantine = new Kantine();
        random = new Random();
    }
    
    public boolean initArtikelen(){
        if(artikelprijzen.size() == 0) return false;
        
        int[] hoeveelheden = getRandomArray(aantal_artikelen, MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
        double[] prijzen = new double[artikelprijzen.size()];
        String[] namen = new String[artikelnamen.size()];
        
        Iterator<Double> dIter = artikelprijzen.iterator();
        int i = 0;
        while(dIter.hasNext()){
            prijzen[i] = dIter.next().doubleValue();
             i++;
        }
        
        Iterator<String> sIter = artikelnamen.iterator();
        i = 0;
        while(sIter.hasNext()){
            namen[i] = sIter.next();
             i++;
        }
         
        kantineaanbod = new KantineAanbod(namen, prijzen, hoeveelheden);
        kantine.setKantineAanbod(kantineaanbod);
        return true;
    }
    
    /**
     * Methode om artikelen toe te voegen;
     * @param artikel
     */
    public void addArtikel(String artikelNaam, double prijs){
        artikelnamen.add(aantal_artikelen, artikelNaam);
        artikelprijzen.add(aantal_artikelen++, prijs);
    }
    /**
    * Methode om een array van random getallen liggend tussen min en max
    * van de gegeven lengte te genereren
    * @param lengte
    * @param min
    * @param max
    * @return De array met random getallen
    */
    private int[] getRandomArray(int lengte, int min, int max) {
    int[] temp = new int[lengte];
        for(int i = 0; i < lengte; i++) {
            temp[i] = getRandomValue(min, max);
        }
    return temp;
    }
    
    /**
    * Methode om een random getal tussen min(incl) en
    * max(incl) te genereren.
    * @param min
    * @param max
    * @return Een random getal
    */
    private int getRandomValue(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
    
    /**
    * Methode om op basis van een array van indexen voor de array
    * artikelnamen de bijhorende array van artikelnamen te maken
    * @param indexen
    * @return De array met artikelnamen
    */
    private String[] geefArtikelNamen(int[] indexen) {
    String[] artikelen = new String[indexen.length];
        for(int i = 0; i < indexen.length; i++) {
            artikelen[i] = artikelnamen.get(indexen[i]);
        }
    return artikelen;
    }
    
    /**
    * Deze methode simuleert een aantal dagen in het
    * verloop van de kantine
    * @param dagen
    */
    public void simuleer(int dagen) {
        if(!initArtikelen()){
            System.out.println("Geen Artikelen gevonden");
            return;
        }
        
        DecimalFormat f = new DecimalFormat("##.00");
        double[] dagOmzet = new double[dagen];
        int[] aantalVerkocht = new int[dagen];
        
        for(int i = 0; i < dagen; i++) {
            int aantalpersonen = getRandomValue(MIN_PERSONEN_PER_DAG, MAX_PERSONEN_PER_DAG);
            
            for(int j = 0; j < aantalpersonen; j++) {
                
                Persoon persoon = null;
                int kans = getRandomValue(1, 100);
                if (kans == 1){
                    persoon = new KantineMedewerker();
                } else if (kans <= 11) {
                    persoon = new Docent();
                } else {
                    persoon = new Student();
                }
                
                System.out.println(persoon.toString());
                
                Dienblad dienblad = new Dienblad();
                persoon.pakDienblad(dienblad);
                
                // bedenk hoeveel artikelen worden gepakt
                int aantalartikelen = getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON);
                
                // genereer de “artikelnummers”, dit zijn indexen van de artikelnamen array
                int[] tepakken = getRandomArray(aantalartikelen, 0, aantal_artikelen-1);
                
                // vind de artikelnamen op basis van de indexen hierboven
                String[] artikelen = geefArtikelNamen(tepakken);
                
                // loop de kantine binnen, pak de gewenste artikelen, sluit aan
                kantine.loopPakSluitAan(persoon, artikelen);
                
            }
            // verwerk rij voor de kassa
            kantine.verwerkRijVoorKassa();
            
            aantalVerkocht[i] = kantine.getKassa().aantalArtikelen();
            dagOmzet[i] = kantine.getKassa().hoeveelheidGeldInKassa();
            
            // druk de dagtotalen af en hoeveel personen binnen zijn gekomen
            System.out.println("Hoeveelheid personen binnengekomen: " + aantalpersonen);
            System.out.println("Hoeveelheid Artikelen verkocht: " + kantine.getKassa().aantalArtikelen());
            System.out.println("Hoeveelheid geld verdiend: €" + f.format(kantine.getKassa().hoeveelheidGeldInKassa()) + "\n");
            
            // reset de kassa voor de volgende dag
            kantine.getKassa().resetKassa();
            aantalBijwerken();
        }
        
        System.out.println("Gemiddelde hoeveelheid artikelen verkocht: " + Administratie.berekenGemiddeldAantal(aantalVerkocht));
        System.out.println("Gemiddelde hoeveelheid omzet gemaakt: €" + f.format(Administratie.berekenGemiddeldeOmzet(dagOmzet)));
        System.out.println("Gemiddelde omzet per dag: ");
        double[] gemiddeldeDagOmzet = Administratie.berekenDagOmzet(dagOmzet);
        for (int i = 0; i < gemiddeldeDagOmzet.length; i++){
            System.out.println("Dag " + (i + 1) + ": €" + f.format(gemiddeldeDagOmzet[i]));
        }
        
    }
    
    /**
     * check of alle artikelen nog op voorraad zijn, zo niet dan aanvullen.
     */
    private void aantalBijwerken(){
        for(int i = 0; i < artikelnamen.size(); i++){
            if (kantine.getKantineAanbod().getVooraad(artikelnamen.get(i)) < MIN_ARTIKELEN_PER_SOORT) {
                kantine.getKantineAanbod().vooraadAanvullen(artikelnamen.get(i), 10000);
            }
        }
    }
}