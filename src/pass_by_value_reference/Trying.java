package pass_by_value_reference;

public class Trying {
// Begin Class
	
	static int var;
	
	public static void main(String[] args) {
	// Begin main()
		
		/*String name = "Salimaamlaaa";
		
		String str = name.replace("aa", "b");
		System.out.println(name+ "\n" +str);*/
		
		
		/*int var = 9;
		printVar();
		
		int n = 50;
		System.out.println(displayNum(n));*/
		
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10) ^ (z=false);
		System.out.println(x+", "+y+", "+z);
		
		System.out.println("*****************");
		
		/*for(int i=0; i<10 ; ) {
			i = i++;
			System.out.println("Hello World");
		}*/
		
		System.out.println("*****************");
		
		byte a = 40, b = 50;
		int sum = (byte) a + b;
		System.out.println(sum);
		
	// End main()
	}
	
	public static Integer displayNum(int n) {
		return ++n;
	}
	
	private static void printVar() {
		int var = 10;
		System.out.println(var++);
	}
	
// End Class
}












