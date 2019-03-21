package builder;

public abstract class CricketBuilder {

	protected product productcri;
	
	public product getProduct() {
		return productcri;
	}
	
	public void createNewproduct() {
		productcri=new product();
	}
	
	abstract void Buildbat();
	abstract void Buildbowl();
	abstract void Buildfeild();
	
}
