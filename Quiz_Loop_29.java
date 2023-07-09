import java.util.Scanner;

public class Quiz_Loop_29 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();
		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = numberValue; i >= 1; i--) {
			for (int k = 1; k <= numberValue; k++) {
				System.out.print(i);
			}

			System.out.println();
		}

	}
}