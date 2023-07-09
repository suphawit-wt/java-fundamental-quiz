import java.util.Scanner;

public class Quiz_Array_18 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int numberOfInput;

		System.out.print("Please Insert Number of Input : ");
		numberOfInput = kb.nextInt();

		String[] f = new String[numberOfInput];

		for (int i = 0; i < numberOfInput; i++) {
			System.out.print("Please Insert Number Value : ");
			f[i] = kb.next();
		}

		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = numberOfInput - 1; i >= 0; i--) {
			System.out.println(f[i]);
		}

	}
}