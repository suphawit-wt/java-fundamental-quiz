import java.util.Scanner;

public class Quiz_Loop_27 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();

		kb.close();

		int K = numberValue;

		System.out.println("----------- Result -----------");
		for (int i = 1; i <= numberValue; i++) {
			for (int j = 1; j <= K; j++) {
				System.out.print(j);
			}

			K--;

			System.out.println();
		}

	}
}