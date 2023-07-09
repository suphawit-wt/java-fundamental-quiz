import java.util.Scanner;

public class Quiz_Array_24 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Please Insert Length of Star : ");
		int numberInput = kb.nextInt();

		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = numberInput * 2 - 1; i > 0; i--) {
			for (int j = numberInput; j > 0; j--) {
				if (i == j || numberInput * 2 == i + j) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}

			System.out.println();
		}

	}
}