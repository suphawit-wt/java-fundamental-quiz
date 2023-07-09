import java.util.Scanner;

public class Quiz_Array_13 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int count = 0;

		int numberArray1[][] = new int[3][3];
		int numberArray2[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Please Insert Number Value for Input1[" + i + "][" + j + "]: ");
				numberArray1[i][j] = kb.nextInt();
			}
		}

		kb.close();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				numberArray2[j][i] = numberArray1[i][j];
			}
		}

		System.out.println("-------- Result of Same Value on Row/Column --------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (numberArray1[i][j] == numberArray1[i][j + 1]) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println("All " + numberArray1[i][i] + " on row " + i);
			}

			count = 0;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (numberArray2[i][j] == numberArray2[i][j + 1]) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("All " + numberArray2[i][i] + " on column " + i);
			}

			count = 0;
		}

	}
}