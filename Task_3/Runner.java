package Task_3;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Введите предложение: ");
		Scanner sc = new Scanner(System.in);
		Words words = new Words(sc.nextLine());
		words.doSmth();
		System.out.println("Количество слов в строке: " + words.getC());
		System.out.println("Сортируем слова: " + words.getWords());

	}

}
