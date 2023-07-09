import java.util.Scanner;

public class Quiz_Array_20 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int numberOfInputX, numberOfInputY;

		System.out.print("Please Insert Number of Input[X][Y] at [X] : ");
		numberOfInputX = kb.nextInt();

		System.out.print("Please Insert Number of Input[X][Y] at [Y] : ");
		numberOfInputY = kb.nextInt();

		char[][] arrmn = new char[numberOfInputX][numberOfInputY];

		for (int i = 0; i < numberOfInputX; i++) {
			for (int j = 0; j < numberOfInputY; j++) {
				System.out.print("Please Insert Char Value for Input[" + i + "][" + j + "]: ");
				arrmn[i][j] = kb.next().charAt(0);
			}
		}

		kb.close();

		for (int i = numberOfInputX - 1; i >= 0; i--) {
			for (int j = 0; j < numberOfInputY; j++) {
				if (arrmn[i][j] == '*' && i != numberOfInputX - 1) {
					arrmn[i + 1][j] = '*';
				}
			}
		}

		System.out.println("----------- Result -----------");
		for (int i = 0; i < numberOfInputX; i++) {
			for (int j = 0; j < numberOfInputY; j++) {
				System.out.print(arrmn[i][j] + " ");
			}

			System.out.println();
		}

	}
}