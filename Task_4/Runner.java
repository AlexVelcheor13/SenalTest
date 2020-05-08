package Task_4;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("Введите предложение: ");
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		System.out.println("Введите слово для поиска: ");
		
		String str2 = sc.nextLine();
		
		Word  word = new Word(str1);
		
		System.out.println("Количество повторений слова " + str2 + " равно: " + word.Count(str2));

	}

}
