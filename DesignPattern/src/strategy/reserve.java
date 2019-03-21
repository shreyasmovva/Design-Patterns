package strategy;

public class reserve implements sports {

	@Override
	public int selection(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("reserved players");
		return a*b;
	}

	
	
}
