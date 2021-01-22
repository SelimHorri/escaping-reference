package pass_by_value_reference;

public class Main {
// Begin Class
	
	// private static int value = 100;
	
	public static void main(String[] args) {
	// Begin main()
		
		int value = 100;
		
		System.out.println("Before : "+ value);
		display(value);
		System.out.println("After : "+ value);
		
		System.out.println("-------------------------------------");
		
		int values[] = {500,600};
		
		System.out.println("Before : "+ values[0]);
		display(values);
		System.out.println("After : "+ values[0]);
		
	// End main()
	}
	
	public static void display(int v) {
	// Begin display()
		
		System.out.println("Inside : "+ ++v);
		
	// End display()
	}
	
	public static void display(int v[]) {
	// Begin display()
		
		v[0] = -3;
		System.out.println("Inside : "+ v[0]);
		
	// End display()
	}
	
// End Class
}
