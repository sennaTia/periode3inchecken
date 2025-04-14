package periode3inchecken;

public class Main  {

	public static void main(String[] args) {
		
        Locatie locatie = new Locatie("nijmegen", 3, 5);
        Locatie locatie2 = new Locatie("arnhem", 4, 5);
        Locatie locatie3 = new Locatie("utrecht", 5,5);
        
 
        Kaart kaart = new Kaart();
        Poort poort = new Poort();   
        poort.inchecken(kaart);
 
       
        double afstand = locatie.berekenAfstandTot(locatie3);
        System.out.println("Afstand tussen " + locatie.naam + " en " + locatie3.naam + " is: " + afstand);
 
        Uitchecken uitcheck = new Uitchecken();
        uitcheck.uitchecken(kaart, afstand);
    }
}

 
 