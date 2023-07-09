import java.util.Scanner;

public class Quiz_Array_28 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int numberOfInputX, numberOfInputY, cC1 = 0, cC2 = 2;

		System.out.print("Please Insert Number of Input[X][Y] at [X] : ");
		numberOfInputX = kb.nextInt();

		System.out.print("Please Insert Number of Input[X][Y] at [Y] : ");
		numberOfInputY = kb.nextInt();

		char numberArray2D[][] = new char[numberOfInputX][numberOfInputY];

		// kb.nextLine();

		for (int i = 0; i < numberOfInputX; i++) {
			System.out.print("Please Insert String Value : ");
			numberArray2D[i] = kb.nextLine().toCharArray();
		}

		kb.close();

		for (int i = 0; i < numberOfInputX; i++) {
			for (int j = 0; j < numberOfInputY / 2; j++) {
				if (!(numberArray2D[i][j] == numberArray2D[i][numberOfInputY - 1 - j])) {
					cC1++;
				}
			}
		}

		if (cC1 > 0) {
			cC1 = 0;
			cC2 = 1;
		}

		for (int i = 0; i < numberOfInputY; i++) {
			for (int j = 0; j < numberOfInputX / 2; j++) {
				if (!(numberArray2D[j][i] == numberArray2D[numberOfInputX - j - 1][i])) {
					cC1++;
				}
			}
		}

		if (cC1 > 0 && cC2 == 1) {
			cC2 = 0;
		} else if (cC1 > 0 && cC2 == 2) {
			cC2 = 1;
		} else if (cC2 == 1) {
			cC2 = 2;
		} else if (cC2 == 2) {
			cC2 = 3;
		}

		System.out.println("----------- Result -----------");
		if (cC2 == 0) {
			System.out.println("Asymmetry");
		} else if (cC2 == 1) {
			System.out.println("Vertical Symmetry");
		} else if (cC2 == 2) {
			System.out.println("Horizontal Symmetry");
		} else if (cC2 == 3) {
			System.out.println("Vertical and Horizontal Symmetry");
		}

	}
}