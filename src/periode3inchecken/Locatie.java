package periode3inchecken;

public class Locatie  {
	   String naam;
	    double x;
	    double y;
	 
	    public Locatie(String naam, double x, double y) {
	        this.naam = naam;
	        this.x = x;
	        this.y = y;
	    }
	 
	    public double berekenAfstandTot(Locatie andereLocatie) {
	        double somX = andereLocatie.x - this.x;
	        double somY = andereLocatie.y - this.y;
	        return Math.sqrt(somX * somX + somY * somY);
	    }
	}