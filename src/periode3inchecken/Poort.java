package periode3inchecken;

public class Poort {
    private double instaptarief = 1.80;
    
    public double getInstaptarief() {
        return instaptarief;
    }
 
    public boolean inchecken(Kaart kaart) {
        if (kaart.geldig && kaart.saldo >= instaptarief) {
            kaart.inchecken = true;
            kaart.saldo -= instaptarief;  
            System.out.println("Ingecheckt via poort. Nieuw saldo: €" + kaart.saldo);
            return true;
        } else {
            System.out.println("Inchecken mislukt: kaart ongeldig of te weinig saldo.");
            return false;
        }
    }
}