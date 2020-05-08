package Task_5;

public class Polindrome {
	
	public static boolean isPolindrome(int num) {
		String strN = String.valueOf(num);
		String reverse = new StringBuffer(strN).reverse().toString();
		boolean is = strN.equals(reverse);
		return is;
	}
	
}
