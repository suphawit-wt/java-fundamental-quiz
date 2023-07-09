import java.util.Scanner;

public class Quiz_Loop_24 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue1, numberValue2;

		System.out.print("Please Insert Number Value 1 : ");
		numberValue1 = kb.nextInt();

		System.out.print("Please Insert Number Value 2 : ");
		numberValue2 = kb.nextInt();

		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = 1; i <= numberValue2; i++) {
			for (int j = 1; j <= numberValue1; j++) {
				if (i == 1 || i == numberValue2) {
					System.out.print("+");
				} else {
					if (j == 1 || j == numberValue1) {
						System.out.print("+");
					} else {
						System.out.print("-");
					}

				}
			}

			System.out.println();
		}

	}
}