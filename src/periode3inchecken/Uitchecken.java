package periode3inchecken;

public class Uitchecken  {
	   public boolean uitchecken(Kaart kaart, double afstand) {
	        if (kaart.inchecken) {
	            double uitcheckTarief = afstand * 0.50;  
	            if (kaart.krediet >= uitcheckTarief) {
	                
	                kaart.krediet -= uitcheckTarief;
	                kaart.krediet += kaart.getInstaptarief();  
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
	 

