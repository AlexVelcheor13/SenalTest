package Task_5;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Введите число от 1 до 100");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num >= 1 && num <= 100) {
			StringBuilder sb = new StringBuilder();
			for (int j = 1; j <= num; j++) {
				if (Polindrome.isPolindrome(j)) {
					sb.append(j + " ");
				}
			}
			System.out.println("Полиндромы: " + sb);
			
		} else {
			System.out.println("Ooops! Некорректный ввод числа!");
		}

	}

}
