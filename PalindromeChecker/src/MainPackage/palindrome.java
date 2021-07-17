package MainPackage;

public class palindrome {
	
	public static void isStringPalindrome(String s) {
		String original = s;
		String temp = "";
		
		for(int x = original.length() - 1; x >= 0; x--) {
			temp = temp + original.charAt(x);
		}
		
		if(original.equalsIgnoreCase(temp)) {
			System.out.println("string is polindrome");
		}else {
			System.out.println("string is not polindrome");
		}
	}
	
	public static void main(String []args) {
		isStringPalindrome("kasur ini rusak");
	}
	
}
