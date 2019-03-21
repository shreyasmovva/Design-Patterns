
public class Singleton {

	private static Singleton Instance;
	private Singleton() {
}

public static Singleton getInstance() {
	
	if(Instance==null)
	
		Instance=new Singleton();
		return Instance;
		
	
}

public void show() {
	System.out.println("blahhhhhhhhhhhh");
}


public static void main(String args[]) {
	
	Singleton obj =Singleton.getInstance();
	obj.show();
}
}

