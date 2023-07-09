import java.util.Scanner;

public class Quiz_Array_11 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberOfInputXY, count1 = 0, count2 = 0;

		System.out.print("Please Insert Number of Input[X][Y] : ");
		numberOfInputXY = kb.nextInt();

		int[][] numberArray2D = new int[numberOfInputXY][numberOfInputXY];

		for (int i = 0; i < numberArray2D.length; i++) {
			for (int j = 0; j < numberArray2D.length; j++) {
				System.out.print("Please Insert Number Value for Input[" + i + "][" + j + "]: ");
				numberArray2D[i][j] = kb.nextInt();
			}
		}

		kb.close();

		for (int i = 0; i < numberArray2D.length; i++) {
			for (int j = 0; j < numberArray2D.length; j++) {
				if ((i == j) && (numberArray2D[i][j] == 1)) {
					count1++;
				} else {
					if ((i != j) && (numberArray2D[i][j] == 0)) {
						count2++;
					}
				}
			}
		}

		System.out.println("----------- Result -----------");
		if (count1 == numberOfInputXY && count2 == numberOfInputXY * (numberOfInputXY - 1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}