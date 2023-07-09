import java.util.Scanner;

public class Quiz_Array_02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] numberArray = new int[10];

		System.out.println("----------- Insert 10 Number -----------");
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print("Please Insert Number Value : ");
			numberArray[i] = kb.nextInt();
		}

		kb.close();

		System.out.println("----------- Result -----------");
		System.out.println("----- Distinct Number is -----");

		int i, j;
		for (i = 0; i < numberArray.length; i++) {
			for (j = 0; j < i; j++) {
				if (numberArray[i] == numberArray[j])
					break;
			}
			if (i == j) {
				System.out.print(numberArray[i] + " ");
			}
		}

	}
}