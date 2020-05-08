package Task_1;

public class Number {
	private int number;

	public Number(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
	public boolean isNumEven() {
		return number % 2 == 0;
	}
	
	public boolean isNumPrime() {
		boolean flag = false;
		for (int i = 2; i*i <= number ; i++) {
			if (number % i == 0) {
				flag = true;
				
			}
		}
		return flag;
		
	}
}
