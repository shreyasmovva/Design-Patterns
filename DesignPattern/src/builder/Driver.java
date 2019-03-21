package builder;

public class Driver {

	private CricketBuilder cribul;
	
	public void setBuilder(CricketBuilder newcribul) {
		cribul=newcribul;
	}
	
	public void construct() {
		cribul.createNewproduct();
		cribul.Buildbat();
		cribul.Buildbowl();
		cribul.Buildfeild();
		
	}
	
	
	public product getproduct() {
		return cribul.getProduct();
	}
	
}
