import java.util.Scanner;

public class Quiz_Array_01 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberOfInput, higherCount = 0, lowerCount = 0;
		double avg = 0;

		System.out.print("Please Insert Number of Input : ");
		numberOfInput = kb.nextInt();

		int[] numberArray = new int[numberOfInput];

		System.out.println("----------- Insert " + numberOfInput + " Number -----------");
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print("Please Insert Number Value : ");
			numberArray[i] = kb.nextInt();
		}

		kb.close();

		for (int i = 0; i < numberArray.length; i++) {
			avg += numberArray[i];
		}

		avg = avg / (double) numberOfInput;

		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] < avg) {
				lowerCount += 1;
			} else {
				higherCount += 1;
			}
		}

		System.out.println("----------- Result -----------");
		System.out.println("Average : " + avg);
		System.out.println("Lower Count : " + lowerCount);
		System.out.println("Higher Count : " + higherCount);
	}
}