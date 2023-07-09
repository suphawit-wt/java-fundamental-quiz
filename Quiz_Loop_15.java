import java.util.Scanner;

public class Quiz_Loop_15 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();
		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = 1; i <= numberValue; i++) {
			System.out.print("*");
		}

		System.out.println();

		for (int i = 1; i <= numberValue - 2; i++) {
			System.out.print("*");
		}

		System.out.println();

		if ((numberValue - 4) >= 0) {
			for (int i = 1; i <= numberValue - 4; i++) {
				System.out.print("*");
			}
		}

	}
}