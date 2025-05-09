package periode3inchecken;

public class Poort {
    private double instaptarief = 1.80;
    
    public double getInstaptarief() {
        return instaptarief;
    }
 
    public boolean inchecken(Kaart kaart) {
        if (kaart.werkend && kaart.krediet >= instaptarief) {
            kaart.inchecken = true;
            kaart.krediet -= instaptarief;  
            System.out.println("Ingecheckt via poort. Nieuw saldo: €" + kaart.krediet);
            return true;
        } else {
            System.out.println("Inchecken mislukt: kaart ongeldig of te weinig saldo.");
            return false;
        }
    }

public boolean uitchecken(Kaart kaart, double afstand) {
    if (kaart.inchecken) {
        double uitcheckTarief = afstand * 0.50;
        if (kaart.krediet >= uitcheckTarief) {
            kaart.krediet -= uitcheckTarief;
            kaart.krediet += kaart.getInstaptarief(); //
            kaart.inchecken = false;
            System.out.println("Uitgecheckt. Nieuwe saldo: €" + kaart.krediet);
            return true;
        } else {
            System.out.println("Uitchecken mislukt: onvoldoende saldo.");
            return false;
        }
    } else {
        System.out.println("Je hebt niet ingecheckt, dus uitchecken is niet mogelijk.");
        return false;
    }
}
}