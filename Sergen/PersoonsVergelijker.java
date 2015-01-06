public class PersoonsVergelijker {

    public static void main(String[] args){
        Persoon persoon1 = new Persoon();
        Persoon persoon2 = new Persoon();
        System.out.println("equals : " + persoon1.equals(persoon2));
        boolean equals = persoon1 == persoon2;
        System.out.println("==" + equals);
    }
    
}
