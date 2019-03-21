package strategy;

public class result {
	public static void main(String args[]) {
		
		category cat=new category();
		cat.setsports(new in());
		int r1=cat.selectionStrategy(3,4);
		System.out.println("you are"+r1);
		cat.setsports(new in());
		int r2=cat.selectionStrategy(2,4);
		System.out.println("you are"+r2);
		cat.setsports(new in());
		int r3=cat.selectionStrategy(1,4);
		System.out.println("you are"+r3);
		
	}

}
