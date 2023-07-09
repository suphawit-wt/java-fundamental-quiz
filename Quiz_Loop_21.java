import java.util.Scanner;

public class Quiz_Loop_21 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue1, numberValue2, halfNumberValue2;

		System.out.print("Please Insert Number Value 1 : ");
		numberValue1 = kb.nextInt();

		System.out.print("Please Insert Number Value 2 : ");
		numberValue2 = kb.nextInt();
		kb.close();

		halfNumberValue2 = numberValue2 / 2;

		System.out.println("----------- Result -----------");
		for (int i = 1; i <= numberValue1; i++) {
			for (int j = 1; j <= halfNumberValue2; j++) {
				System.out.print(">");
			}

			for (int k = 1; k <= halfNumberValue2; k++) {
				System.out.print("<");
			}

			System.out.println();
		}

	}
}