import java.util.Scanner;

public class Quiz_Array_10 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberOfInputX, mathAbs, maxInt = Integer.MAX_VALUE;

		System.out.print("Please Insert Number of Input[X][3] : ");
		numberOfInputX = kb.nextInt();

		int numberArray2D[][] = new int[numberOfInputX][3];

		for (int i = 0; i < numberOfInputX; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Please Insert Number Value for Input[" + i + "][" + j + "]: ");
				numberArray2D[i][j] = kb.nextInt();
			}
		}

		kb.close();

		for (int x = 0; x < numberOfInputX; x++) {
			for (int y = 0; y < numberOfInputX; y++) {
				for (int z = 0; z < numberOfInputX; z++) {
					if (x != y && y != z && x != z) {

						mathAbs = Math.abs(numberArray2D[x][0] - numberArray2D[y][0])
								+ Math.abs(numberArray2D[x][1] - numberArray2D[y][1])
								+ Math.abs(numberArray2D[x][2] - numberArray2D[y][2]);
						mathAbs += Math.abs(numberArray2D[y][0] - numberArray2D[z][0])
								+ Math.abs(numberArray2D[y][1] - numberArray2D[z][1])
								+ Math.abs(numberArray2D[y][2] - numberArray2D[z][2]);
						maxInt = Math.min(maxInt, mathAbs);
					}
				}
				mathAbs = 0;
			}
		}

		System.out.println("----------- Result -----------");
		System.out.print(maxInt);
	}
}