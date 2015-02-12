
public class ReverseString {
	private String originalString="";
	private String reversedString ="";
	
	public ReverseString(String origStr){
		
		this.originalString=origStr;
	}
	public String reveresed(){
		String result="";
		char currentChar;
		for(int i=0;i<originalString.length();i++){
			currentChar=originalString.charAt(originalString.length()-1-i);
			reversedString = reversedString + Character.toString(currentChar);
			
		}
		result= reversedString;
		return result;
		
	}
	public static void main(String[] args) {
		ReverseString rs = new ReverseString("balamory");
		String opt = rs.reveresed();
		System.out.println(opt);
	}

}
