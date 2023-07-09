import java.util.Scanner;

public class Quiz_Loop_11 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue = 0;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();

		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = 1; i <= numberValue; i++) {
			if (i % 5 == 0) {
				System.out.print("X");
			} else {
				System.out.print("*");
			}
		}

	}
}