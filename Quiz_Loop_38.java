import java.util.Scanner;

public class Quiz_Loop_38 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();
		kb.close();

		int zZ = numberValue + (numberValue - 1);

		System.out.println("----------- Result -----------");
		for (int i = numberValue; i > 0; i--) {
			for (int j = 1; j <= zZ; j++) {
				if (i == 1) {
					System.out.print("*");
				} else if (j == numberValue || j >= i && j <= zZ - (i - 1)) {
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
			for (int j = 1; j <= zZ; j++) {
				if (j == numberValue || j > i && j <= zZ - i) {
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