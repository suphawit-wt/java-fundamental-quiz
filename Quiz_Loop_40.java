import java.util.Scanner;

public class Quiz_Loop_40 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue1, numberValue2, aA = 0, aB = 1;

		System.out.print("Please Insert Number Value 1 : ");
		numberValue1 = kb.nextInt();

		System.out.print("Please Insert Number Value 2 : ");
		numberValue2 = kb.nextInt();
		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = 1; i <= numberValue1; i++) {
			for (int j = 1; j <= numberValue2; j++) {
				if (i % 2 != 0) {
					System.out.print(aB + " ");
					aA = aB + numberValue2;
				} else {
					System.out.print(aA + " ");
					aA--;
				}

				aB += 1;
			}

			System.out.println();
		}

	}
}