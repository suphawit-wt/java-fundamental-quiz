import java.util.Scanner;

public class Quiz_Loop_01 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int input1, input2 = 0, Result = 0;

		System.out.print("Please Insert Number of Input1 : ");
		input1 = kb.nextInt();

		for (int i = 1; i <= input1; i++) {
			System.out.print("Please Insert Number Value : ");
			input2 = kb.nextInt();

			if (Result == 0) {
				Result = input2;
			}

			if (input2 < Result) {
				Result = input2;
			}
		}

		kb.close();

		System.out.println("----------- Result -----------");
		System.out.println(Result);
	}
}