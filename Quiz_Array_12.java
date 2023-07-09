import java.util.Scanner;

public class Quiz_Array_12 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Please Insert Number of Input[X][Y] : ");
		int numberOfInputXY = kb.nextInt();

		int numberArray2D[][] = new int[numberOfInputXY][numberOfInputXY];

		for (int i = 0; i < numberOfInputXY; i++) {
			for (int j = 0; j < numberOfInputXY; j++) {
				System.out.print("Please Insert Number Value for Input[" + i + "][" + j + "]: ");
				numberArray2D[i][j] = kb.nextInt();
			}
		}

		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = 0; i < numberOfInputXY; i++) {
			for (int j = 0; j < numberOfInputXY; j++) {
				System.out.print(numberArray2D[j][i] + " ");
			}

			System.out.println();
		}

	}
}