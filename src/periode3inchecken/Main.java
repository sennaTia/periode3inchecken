package periode3inchecken;

public class Main  {

	public static void main(String[] args) {
		
		Kaart kaart = new Kaart();
		Poort poort = new Poort();
		
		poort.inchecken(kaart);
		poort.uitchecken(kaart);
		

	}

}
