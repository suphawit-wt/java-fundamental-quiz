import java.util.Scanner;

public class Quiz_Loop_18 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue, result = 0, tT = 0;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextInt();
		kb.close();

		for (int i = numberValue; i >= 1; i--) {
			if (i == numberValue) {
				tT = numberValue;
				continue;
			}
			if (result == 0) {
				result = tT * i;
			} else {
				result = result * i;
			}
		}

		if (numberValue == 1 || numberValue == 0) {
			result = 1;
		}

		System.out.println("----------- Result -----------");
		System.out.println(result);
	}
}