import java.util.Scanner;

public class Quiz_Array_05 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberOfInput, numToCount, count = 0;

		System.out.print("Please Insert Number of Input : ");
		numberOfInput = kb.nextInt();

		int[] numberArray = new int[numberOfInput];

		System.out.println("----------- Insert " + numberOfInput + " Number -----------");
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print("Please Insert Number Value : ");
			numberArray[i] = kb.nextInt();
		}

		System.out.print("Please Insert Number Value to Count : ");
		numToCount = kb.nextInt();

		kb.close();

		for (int i = 0; i < numberArray.length; i++) {
			if (numToCount == numberArray[i]) {
				count += 1;
			}
		}

		System.out.println("----------- Result -----------");
		System.out.print(count);
	}
}