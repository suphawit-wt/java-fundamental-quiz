import java.util.Scanner;

public class Quiz_Loop_02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		long numberOfInput, numberValue;

		System.out.print("Please Insert Number of Input : ");
		numberOfInput = kb.nextLong();

		for (int i = 1; i <= numberOfInput; i++) {
			System.out.print("Please Insert Number Value : ");
			numberValue = kb.nextLong();

			numberValue = (long) Math.pow(numberValue, numberValue);

			System.out.println(numberValue);
		}

		kb.close();
	}
}