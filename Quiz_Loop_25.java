import java.util.Scanner;

public class Quiz_Loop_25 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();

		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = 1; i <= numberValue; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}

			System.out.println();
		}

	}
}