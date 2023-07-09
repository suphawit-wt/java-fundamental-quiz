import java.util.Scanner;

public class Quiz_Loop_07 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberOfInput;

		System.out.print("Please Insert Number of Input : ");
		numberOfInput = kb.nextInt();

		kb.close();

		System.out.println("-------------- Result --------------");
		for (int i = numberOfInput; i >= 0; i--) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
			}
		}

	}
}