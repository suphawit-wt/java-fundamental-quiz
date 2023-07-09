import java.util.Scanner;

public class Quiz_Loop_36 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();
		kb.close();

		int K = numberValue;
		int nZ = numberValue - 1;

		System.out.println("----------- Result -----------");
		for (int i = 1; i <= nZ; i++) {
			for (int q = 1; q <= i; q++) {
				System.out.print(q);
			}

			System.out.println();
		}

		for (int i = 1; i <= numberValue; i++) {
			for (int j = 1; j <= K; j++) {
				System.out.print(j);
			}

			System.out.println();
			K--;
		}

	}
}