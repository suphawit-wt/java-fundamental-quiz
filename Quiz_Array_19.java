import java.util.Scanner;

public class Quiz_Array_19 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int numberOfInputX, numberOfInputY, input;

		System.out.print("Please Insert Number of Input[X][Y] at [X] : ");
		numberOfInputX = kb.nextInt();

		System.out.print("Please Insert Number of Input[X][Y] at [Y] : ");
		numberOfInputY = kb.nextInt();

		System.out.print("Please Insert Number Value : ");
		input = kb.nextInt();

		char A[][] = new char[numberOfInputX][numberOfInputY];

		while (input < 0) {
			input += 4;
		}

		for (int i = 0; i < numberOfInputX; i++) {
			for (int j = 0; j < numberOfInputY; j++) {
				System.out.print("Please Insert Char Value for Input[" + i + "][" + j + "]: ");
				A[i][j] = kb.next().charAt(0);
			}
		}

		kb.close();

		System.out.println("----------- Result -----------");
		if (input % 4 == 0) {
			for (int i = 0; i < numberOfInputX; i++) {
				for (int j = 0; j < numberOfInputY; j++) {
					System.out.print(A[i][j] + " ");
				}

				System.out.println();
			}
		} else if (input % 4 == 1) {
			for (int i = 0; i < numberOfInputY; i++) {
				for (int j = numberOfInputX - 1; j >= 0; j--) {
					System.out.print(A[j][i] + " ");
				}

				System.out.println();
			}
		} else if (input % 4 == 2) {
			for (int i = numberOfInputX - 1; i >= 0; i--) {
				for (int j = numberOfInputY - 1; j >= 0; j--) {
					System.out.print(A[i][j] + " ");
				}

				System.out.println();
			}
		} else if (input % 4 == 3) {
			for (int i = numberOfInputY - 1; i >= 0; i--) {
				for (int j = 0; j < numberOfInputX; j++) {
					System.out.print(A[j][i] + " ");
				}

				System.out.println();
			}
		}

	}
}