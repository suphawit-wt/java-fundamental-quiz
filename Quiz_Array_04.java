import java.util.Scanner;

public class Quiz_Array_04 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberOfInput;

		System.out.print("Please Insert Number of Input : ");
		numberOfInput = kb.nextInt();

		int[] numberArray = new int[numberOfInput];
		int[] reverseNumberArray = new int[numberOfInput];

		System.out.println("----------- Insert " + numberOfInput + " Number -----------");
		for (int i = 0; i < numberOfInput; i++) {
			System.out.print("Please Insert Number Value : ");
			numberArray[i] = kb.nextInt();
		}

		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = 0; i < numberOfInput; i++) {
			reverseNumberArray[i] = numberArray[numberOfInput - i - 1];
			System.out.println("i[" + i + "] = " + numberArray[i] + " j[" + i + "] = " + reverseNumberArray[i]);
		}

	}
}