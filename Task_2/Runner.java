package Task_2;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		final String regex = " ";
		System.out.println("Введите два целых числа через пробел!");
		try (Scanner scanner = new Scanner(System.in)){
			int[] arr = Arrays.stream(scanner.nextLine().trim().split(regex)).mapToInt(Integer::parseInt).toArray();
			System.out.println("Наибольший общий делитель: " + Numbers.GreatestCommonDivisior(arr[0], arr[1]));
			System.out.println("Наименьшее общее кратное: " + Numbers.LeastCommonMultiple(arr[0], arr[1]));
		} catch (NumberFormatException e) {
			e.getMessage();
		}

	}

}
