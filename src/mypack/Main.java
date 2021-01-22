package mypack;

public class Main {
// Begin Class
	
	public static void main(String[] args) {
	// Begin main()
		
		A a = new A();
		System.out.println("A a = new A() : " +a.slogan());
		System.out.println("A a = new A() : " +a.slogan1());
		
		System.out.println("\n--------------");
		
		B b = new B();
		System.out.println("B b = new B() : " +b.slogan());
		System.out.println("B b = new B() : " +b.slogan1());
		System.out.println("B b = new B() : " +b.slogan2());
		
		System.out.println("\n--------------");
		
		A ab = new B();
		System.out.println("A ab = new B() : " +ab.slogan());
		System.out.println("A ab = new B() : " +ab.slogan1());
		// System.out.println("A ab = new B() : " +ab.slogan2()); --COMPILE ERROR--
		
		System.out.println("\n--------------");
		
		try {
			B ba = (B) new A();
			System.out.println("B ba = (B) new A() : " +ba.slogan());
		}
		catch (Exception e) {
			System.out.println("Exception =====>> "+ e.getMessage());
		}
		
		System.out.println("\n--------------------------------");
		
		Slogan mySlogan1 = new A();
		System.out.println("Slogan mySlogan1 = new A() : " +mySlogan1.slogan());
		// System.out.println("Slogan mySlogan1 = new A() : " +mySlogan1.slogan1()); --COMPILE ERROR--
		
		System.out.println("\n--------------------------------");
		
		Slogan mySlogan2 = new B();
		System.out.println("Slogan mySlogan2 = new B() : " +mySlogan2.slogan());
		// System.out.println("Slogan mySlogan2 = new B() : " +mySlogan2.slogan2()); --COMPILE ERROR--
		
	// End main()
	}
	
// End Class
}
