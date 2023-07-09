import java.util.Scanner;

public class Quiz_Loop_34 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue;

		numberValue = kb.nextInt();
		kb.close();

		int zZ = numberValue + (numberValue - 1);

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

			System.out.println();
		}

	}
}