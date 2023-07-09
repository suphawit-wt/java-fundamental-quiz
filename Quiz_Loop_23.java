import java.util.Scanner;

public class Quiz_Loop_23 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue1, numberValue2;

		System.out.print("Please Insert Number Value 1 : ");
		numberValue1 = kb.nextInt();

		System.out.print("Please Insert Number Value 2 : ");
		numberValue2 = kb.nextInt();
		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = 1; i <= numberValue1; i++) {
			for (int k = 1; k <= numberValue2; k++) {
				for (int j = 1; j <= numberValue2; j++) {
					System.out.print(i);
				}
				System.out.print(" ");
			}

			System.out.println();
		}

	}
}