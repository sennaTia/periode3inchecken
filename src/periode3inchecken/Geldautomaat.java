package periode3inchecken;

public class Geldautomaat {
	
    private Kaart ingevoerdeKaart;
    
    public void kaartInvoeren(Kaart kaart) {
        this.ingevoerdeKaart = kaart;
        System.out.println("Kaart ingevoerd.");
    }
 
    public void kaartUitwerpen() {
        this.ingevoerdeKaart = null;
        System.out.println("Kaart uitgeworpen.");
    }
 
    public void saldoOpwaarderenTot(double gewenstSaldo) {
        if (ingevoerdeKaart == null) {
            System.out.println("Geen kaart ingevoerd.");
            return;
        }
 
        if (!ingevoerdeKaart.werkend) {
            System.out.println("Kaart is ongeldig.");
            return;
        }
 
        if (gewenstSaldo <= ingevoerdeKaart.krediet) {
            System.out.println("Saldo is al €" + ingevoerdeKaart.krediet + " of hoger. Geen opwaardering nodig.");
            return;
        }
 
        double verschil = gewenstSaldo - ingevoerdeKaart.krediet;
        ingevoerdeKaart.krediet += verschil;
        System.out.println("Saldo opgewaardeerd tot €" + gewenstSaldo + ". Nieuw saldo: €" + ingevoerdeKaart.krediet);
    }
}


