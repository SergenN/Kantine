public class Dienblad {
  private ArrayList<Artikel> artikelen;

  /**
   * Constructor
   */
  public Dienblad() {
      this.artikelen = new ArrayList();
  }

  /**
   * Methode om artikel aan dienblad toe te voegen
   * @param artikel
   */
  public void voegToe(Artikel artikel) {
    artikelen.add(artikel);
  }

  /**
   * Methode om aantal artikelen op dienblad te tellen
   * @return Het aantal artikelen 
   */
  public int getAantalArtikelen() {
    return artikelen.length;
  }

  /**
   * Methode om de totaalprijs van de artikelen 
   * op dienblad uit te rekenen
   * @return De totaalprijs
   */
  public double getTotaalPrijs() {
      int prijs = 0;
    for(Artikel a : artikelen){
        prijs += a.getPrijs();
    }
    return prijs;
}
