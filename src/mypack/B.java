package mypack;

public class B extends A {
// Begin Class
	
	@Override
	public String slogan() {
		return "my slogan is : B";
	}
	
	// B Class will inherit slogan1() from A Class
	
	/*@Override
	public String slogan1() {
		return "my slogan1 is : B";
	}*/
	
	public String slogan2() {
		return "my slogan2 is : B";
	}
	
// End Class
}
