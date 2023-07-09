import java.util.Scanner;

public class Quiz_Loop_39 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue;
		String b1 = "...*...",
				b2 = "..*.*..",
				b3 = ".*...*.",
				b4 = "*.....*";

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();
		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = 1; i <= numberValue; i++) {
			System.out.print(b1);
		}
		System.out.println();

		for (int i = 1; i <= numberValue; i++) {
			System.out.print(b2);
		}
		System.out.println();

		for (int i = 1; i <= numberValue; i++) {
			System.out.print(b3);
		}
		System.out.println();

		for (int i = 1; i <= numberValue; i++) {
			System.out.print(b4);
		}

	}
}