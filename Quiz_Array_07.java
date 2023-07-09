import java.util.Scanner;

public class Quiz_Array_07 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Please Insert Number of Input1 : ");
		int numberOfInput1 = kb.nextInt();

		System.out.print("Please Insert Number of Input2 : ");
		int numberOfInput2 = kb.nextInt();

		int[] numberArray1 = new int[numberOfInput1];

		int[] numberArray2 = new int[numberOfInput2];

		System.out.println("-- Option 'u' : Show Distinct Number --");
		System.out.println("-- Option 'i' : Show Duplicate Number --");
		System.out.print("Please Select Option 'u' or 'i' : ");
		char option = kb.next().charAt(0);

		String distinctNumber = "";

		for (int i = 0; i < numberOfInput1; i++) {
			System.out.print("Please Insert Number Value for Input1 : ");
			numberArray1[i] = kb.nextInt();
			distinctNumber += numberArray1[i] + " ";
		}

		for (int i = 0; i < numberOfInput2; i++) {
			System.out.print("Please Insert Number Value for Input2 : ");
			numberArray2[i] = kb.nextInt();
		}

		kb.close();

		if (option == 'u') {
			for (int i = 0; i < numberOfInput2; i++) {

				int count = 0;

				for (int j = 0; j < numberOfInput1; j++) {
					if (numberArray2[i] == numberArray1[j]) {
						count++;
					}
				}

				if (count == 0) {
					distinctNumber += numberArray2[i] + " ";
				}

			}

			System.out.println("----------- Result -----------");
			System.out.println("----- Distinct Number is -----");
			System.out.println(distinctNumber);
		}

		if (option == 'i') {
			System.out.println("----------- Result -----------");
			System.out.println("----- Duplicate Number is -----");
			for (int i = 0; i < numberOfInput1; i++) {
				for (int j = 0; j < numberOfInput2; j++) {
					if (numberArray1[i] == numberArray2[j]) {
						System.out.print(numberArray1[i] + " ");
					}
				}
			}
		}

	}
}