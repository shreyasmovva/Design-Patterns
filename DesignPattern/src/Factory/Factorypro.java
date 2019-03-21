package Factory;

public class Factorypro {

	
	private Factorypro() {
		
	}
	
	public static Cricket getCricket(String str) {
		if (str.equalsIgnoreCase("bat")) {
			return new Bat();
			
		}
		else if (str.equalsIgnoreCase("bowl")) {
			return new Bowl();}
		if (str.equalsIgnoreCase("Weather")) {
			return new weather();}
		return null;
	}
		
}
