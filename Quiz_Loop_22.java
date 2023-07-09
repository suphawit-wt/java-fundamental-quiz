import java.util.Scanner;

public class Quiz_Loop_22 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();
		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = 1; i <= numberValue; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= numberValue; j++) {
					System.out.print(">");
				}

				System.out.print(" ");

				for (int k = 1; k <= numberValue; k++) {
					System.out.print("<");
				}

				System.out.println();
			} else {
				for (int j = 1; j <= numberValue; j++) {
					System.out.print("<");
				}

				System.out.print(" ");

				for (int k = 1; k <= numberValue; k++) {
					System.out.print(">");
				}

				System.out.println();
			}
		}

	}
}