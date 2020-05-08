package Task_2;

public class Numbers {
	
	public static int LeastCommonMultiple(int num1, int num2) {
		return (num1 * num2) / GreatestCommonDivisior(num1, num2);
	}
	
	public static int GreatestCommonDivisior(int num1, int num2) {
		if (num1 % num2 == 0) {
			return num2;
		} else if(num2 % num1 == 0) {
			return num1;
		}
		
		if (num1 > num2) {
			return GreatestCommonDivisior(num1 % num2, num2);
		} else {
			return GreatestCommonDivisior(num1 , num2 % num1);
		}
		
	}

}
