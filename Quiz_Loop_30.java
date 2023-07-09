import java.util.Scanner;

public class Quiz_Loop_30 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();
		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = numberValue; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}

			System.out.println();
		}

	}
}