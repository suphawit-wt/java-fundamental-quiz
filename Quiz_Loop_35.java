import java.util.Scanner;

public class Quiz_Loop_35 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();
		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = numberValue; i > 0; i--) {
			for (int j = 1; j <= numberValue; j++) {
				if (i == 1) {
					System.out.print("*");

				} else if (j == numberValue || j >= i) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			if (i != 1) {
				System.out.println();
			}
		}

		for (int i = 0; i < numberValue; i++) {
			for (int j = 1; j <= numberValue; j++) {
				if (j == numberValue || j > i) {
					if (i != 0) {
						System.out.print("*");
					}
				} else {
					System.out.print("-");
				}
			}

			System.out.println();
		}

	}
}