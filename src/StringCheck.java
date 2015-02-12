
public class StringCheck {

	
	public static void main(String[] args) {
		String name= "Sachin";
		String nameTwo = "Sachin";
		nameTwo=name.concat(" Tendulkar");
		System.out.println(nameTwo);
		System.out.println("name hashcode " + name.hashCode());
		System.out.println("name two hashcode " + nameTwo.hashCode());
	}

}
