import java.util.Scanner;

public class Quiz_Loop_32 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();
		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = 1; i <= numberValue; i++) {
			for (int j = 1; j <= numberValue; j++) {
				if (i == 1 || i == numberValue) {
					System.out.print(i);
				} else {
					if (j == 1 || j == numberValue) {
						System.out.print(i);
					} else {
						System.out.print("-");
					}
				}
			}

			System.out.println();
		}

	}
}