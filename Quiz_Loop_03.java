import java.util.Scanner;

public class Quiz_Loop_03 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberOfInput = 0, numberValue, Result = 0;

		System.out.print("Please Insert Number of Input : ");
		numberOfInput = kb.nextInt();

		kb.close();

		for (int i = 1; i <= numberOfInput; i++) {
			numberValue = (int) Math.pow(i, 2);
			Result += numberValue;
		}

		System.out.println("----------- Result -----------");
		System.out.println(Result);
	}
}