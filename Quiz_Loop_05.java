import java.util.Scanner;

public class Quiz_Loop_05 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue, oddNumber = 0, evenNumber = 0;

		for (;;) {
			System.out.print("Please Insert Number Value : ");
			numberValue = kb.nextInt();

			if (numberValue == -1) {
				kb.close();
				break;
			}

			if (numberValue % 2 == 0) {
				evenNumber += 1;
			} else {
				oddNumber += 1;
			}

		}

		System.out.println("-------------- Result --------------");
		System.out.println("------- Odd Number Count is -------");
		System.out.println(oddNumber);

		System.out.println("------- Even Number Count is -------");
		System.out.println(evenNumber);
	}
}
