import java.util.Scanner;

public class Quiz_Array_03 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberOfInput, sum = 0;

		System.out.print("Please Insert Number of Input : ");
		numberOfInput = kb.nextInt();

		int[] numberArray = new int[numberOfInput];

		int maxInt = Integer.MAX_VALUE;

		System.out.println("----------- Insert " + numberOfInput + " Number -----------");
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print("Please Insert Number Value : ");
			numberArray[i] = kb.nextInt();
			if (numberArray[i] < maxInt) {
				maxInt = numberArray[i];
			}
		}

		kb.close();

		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] != maxInt) {
				sum = sum + numberArray[i];
			}
		}

		System.out.println("----------- Result -----------");
		System.out.println(sum);
	}
}