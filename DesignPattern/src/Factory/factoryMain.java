package Factory;

public class factoryMain {
	public static void main(String args[]) {
	Cricket cri1= Factorypro.getCricket("bat");
	cri1.toss();
	
	Cricket cri2= Factorypro.getCricket("BOWL");
	cri2.toss();
	
	//Cricket cri3= Factorypro.getCricket("weather");
	//cri3.toss();
	
	
	
	}
}
