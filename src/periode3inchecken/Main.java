package periode3inchecken;

public class Main  {

		
		   public static void main(String[] args) {
		        Locatie locatie = new Locatie("Nijmegen", 4, 9);
		        Locatie locatie2 = new Locatie("Arnhem", 4, 7);
		        Kaart kaart = new Kaart();
		        Poort poort = new Poort();   
		        Geldautomaat automaat = new Geldautomaat();
		        automaat.kaartInvoeren(kaart);
		        automaat.saldoOpwaarderenTot(10.00);
		        automaat.kaartUitwerpen();
		        poort.inchecken(kaart);
		        double afstand = locatie.berekenAfstandTot(locatie2);
		        System.out.println("Afstand tussen " + locatie.naam + " en " + locatie2.naam + " is: " + afstand);
		        poort.uitchecken(kaart, afstand);
		    }
		}
		 


 
 