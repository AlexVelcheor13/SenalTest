package Task_1;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Введите целое числло");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			Number number = new Number(scanner.nextInt());
			String str = "Число " + number.getNumber() + " ";
			if (number.isNumEven()) {
				str = str + "четное, ";
			} else {
				str = str + "нечетное, ";
			}
			if (number.isNumPrime()) {
				str = str + "составное. ";
			} else {
				str = str + "простое. ";
			}
			System.out.println(str);
		} else{ 
			System.out.println("Ошибка ввода");
		}
	}

}
