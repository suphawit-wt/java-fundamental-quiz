import java.util.Scanner;

public class Quiz_Array_08 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberOfInput1, numberOfInput2;

		System.out.print("Please Insert Number of Input1 : ");
		numberOfInput1 = kb.nextInt();

		System.out.print("Please Insert Number of Input2 : ");
		numberOfInput2 = kb.nextInt();

		char[] option = new char[numberOfInput1];

		int[] numberArray1 = new int[numberOfInput1];

		int[] numberArray2 = new int[numberOfInput2];

		for (int i = 0; i < numberOfInput1; i++) {
			System.out.print("Please Insert '*' or '-' : ");
			option[i] = kb.next().charAt(0);

			if (option[i] == '*') {
				numberArray1[i] = 1;
			} else if (option[i] == '-') {
				numberArray1[i] = 0;
			}

		}

		for (int i = 0; i < numberOfInput2; i++) {
			System.out.print("Please Insert Number Value for Input2 : ");
			numberArray2[i] = kb.nextInt();
		}

		kb.close();

		for (int i = 0; i < numberOfInput2; i++) {
			for (int j = 0; j < numberOfInput1; j++) {
				if (numberArray2[i] - 1 == j) {
					numberArray1[j]++;
				}
			}
		}

		System.out.println("----------- Result -----------");
		for (int i = 0; i < numberOfInput1; i++) {
			if (numberArray1[i] % 2 == 1) {
				System.out.print("on ");
			} else {
				System.out.print("off ");
			}
		}

	}
}