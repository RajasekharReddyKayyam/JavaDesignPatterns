package CreationalDesignPattern;

public class BuilderPattern {
	public static void main(String[] args) {
		User u= new UserBuilder().setname("raj").getuser();
	System.out.println(u);
	}

}
