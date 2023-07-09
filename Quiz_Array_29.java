import java.util.Scanner;

public class Quiz_Array_29 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int numberOfInput1X, numberOfInput1Y, numberOfInput2X;

		System.out.print("Please Insert Number of Input1[X][Y] at [X] : ");
		numberOfInput1X = kb.nextInt();

		System.out.print("Please Insert Number of Input1[X][Y] at [Y] : ");
		numberOfInput1Y = kb.nextInt();

		System.out.print("Please Insert Number of Input2[X][2] at [X] : ");
		numberOfInput2X = kb.nextInt();

		int cC1[][] = new int[numberOfInput1X][numberOfInput1Y];
		int cC2[][] = new int[numberOfInput2X][2];

		for (int i = 0; i < numberOfInput1X; i++) {
			for (int j = 0; j < numberOfInput1Y; j++) {
				cC1[i][j] = 0;
			}
		}

		for (int i = 0; i < numberOfInput2X; i++) {
			System.out.print("Please Insert Number Value for Input2[" + i + "][0]: ");
			cC2[i][0] = kb.nextInt();

			System.out.print("Please Insert Number Value for Input2[" + i + "][1]: ");
			cC2[i][1] = kb.nextInt();
		}

		kb.close();

		for (int p = 0; p < numberOfInput2X; p++) {
			for (int i = 0; i < numberOfInput1X; i++) {
				for (int j = 0; j < numberOfInput1Y; j++) {
					if (cC2[p][0] == i + 1 && cC2[p][1] == j + 1) {
						if (i > 0) {
							cC1[i - 1][j]++;
						}

						if (i < numberOfInput1X - 1) {
							cC1[i + 1][j]++;
						}

						cC1[i][j]++;

						if (j > 0) {
							cC1[i][j - 1]++;
						}

						if (j < numberOfInput1Y - 1) {
							cC1[i][j + 1]++;
						}
					}
				}
			}
		}

		System.out.println("----------- Result -----------");
		for (int i = 0; i < numberOfInput1X; i++) {
			for (int j = 0; j < numberOfInput1Y; j++) {
				System.out.print(cC1[i][j] % 2 + " ");
			}

			System.out.println();
		}

	}
}