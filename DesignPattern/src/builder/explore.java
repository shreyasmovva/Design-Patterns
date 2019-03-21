package builder;

public class explore {

	public static void main(String args[]) {
		
		Driver explorer;
		product a,b;
		
		CricketBuilder allr=new allRounder();
		CricketBuilder wek=new keeper();
		
		explorer=new Driver();
		
		explorer.setBuilder(allr);
	    explorer.construct();
	    a = explorer.getproduct();
	    System.out.println(a);

	    explorer.setBuilder(wek);
	    explorer.construct();
	    b = explorer.getproduct();
	    System.out.println(b);
		
	}
}
