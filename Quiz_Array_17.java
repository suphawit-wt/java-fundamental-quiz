import java.util.Scanner;

public class Quiz_Array_17 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberOfInput1, numberOfInput2, numberOfInput3;

		System.out.print("Please Insert Number of Input1 : ");
		numberOfInput1 = kb.nextInt();

		System.out.print("Please Insert Number of Input2 : ");
		numberOfInput2 = kb.nextInt();

		System.out.print("Please Insert Number of Input3 : ");
		numberOfInput3 = kb.nextInt();

		int numberArray1[][] = new int[numberOfInput1][numberOfInput2];
		int numberArray2[][] = new int[numberOfInput2][numberOfInput3];
		int numberArray3[][] = new int[numberOfInput1][numberOfInput3];

		for (int i = 0; i < numberOfInput1; i++) {
			for (int j = 0; j < numberOfInput2; j++) {
				System.out.print("Please Insert Number Value for Input1[" + i + "][" + j + "]: ");
				numberArray1[i][j] = kb.nextInt();
			}
		}

		for (int i = 0; i < numberOfInput2; i++) {
			for (int j = 0; j < numberOfInput3; j++) {
				System.out.print("Please Insert Number Value for Input2[" + i + "][" + j + "]: ");
				numberArray2[i][j] = kb.nextInt();
			}
		}

		kb.close();

		for (int i = 0; i < numberOfInput1; i++) {
			for (int j = 0; j < numberOfInput3; j++) {
				for (int k = 0; k < numberOfInput2; k++) {
					numberArray3[i][j] += numberArray1[i][k] * numberArray2[k][j];
				}
			}
		}

		System.out.println("----------- Result -----------");
		for (int i = 0; i < numberOfInput1; i++) {
			for (int j = 0; j < numberOfInput3; j++) {
				System.out.print(numberArray3[i][j] + " ");
			}

			System.out.println();
		}

	}
}