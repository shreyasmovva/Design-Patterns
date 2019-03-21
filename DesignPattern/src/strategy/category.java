package strategy;

public class category {

	private sports sports;
	
	public void setsports(sports s1) {
		this.sports=s1;
	}
	
	
	public int selectionStrategy(int a,int b) {
		return this.sports.selection(a, b);
	}
}
