package builder;

public class product {

	private String bat,bowl,field;


	public void setBat(String newbat) {
		this.bat = newbat;
	}



	public void setBowl(String newbowl) {
		this.bowl = newbowl;
	}

	

	public void setField(String newfield) {
		this.field = newfield;
	}
	
	
	public String toString() {
		return new String("\nbat"+ bat +"\nbowl"+ bowl+"\nfield"+field);
	}
	
}
