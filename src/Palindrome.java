
public class Palindrome {
	private String strText ="";

	public Palindrome(String palindrome){
	this.strText=palindrome;
}

	public boolean isItPalindrome(){
		boolean result=false;
		char charfromLeft;
		char charFromRight;
		for(int i=0; i<strText.length()-1;i++){
			
			charfromLeft=strText.charAt(i);
			charFromRight=strText.charAt(strText.length()-1-i);
			
			if(!(charfromLeft==charFromRight)){
				result=false;
			}else{
				result=true;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		Palindrome palindrome = new Palindrome("racecar");
		boolean palidromeResult = palindrome.isItPalindrome();
		System.out.println(palidromeResult);
	}

}
