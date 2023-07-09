import java.util.Scanner;

public class Quiz_Array_27 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int numberOfInput1, numberOfInput2;

		numberOfInput1 = kb.nextInt();
		numberOfInput2 = kb.nextInt();

		int[][] cC1 = new int[numberOfInput1][numberOfInput2];
		int[][] cC2 = new int[100][1];

		for (int i = 0; i < numberOfInput1; i++) {
			for (int j = 0; j < numberOfInput2; j++) {
				cC1[i][j] = kb.nextInt();
			}
		}

		kb.close();

		for (int i = 0; i < numberOfInput1; i++) {
			for (int j = 0; j < numberOfInput2; j++) {
				if (cC1[i][j] > 0) {
					cC2[cC1[i][j]][0]++;
				}
			}
		}

		for (int i = 0; i < 100; i++) {
			if (cC2[i][0] > 0) {
				System.out.printf(i + "%.0f\n", Math.ceil(cC2[i][0] * 0.005));
			}
		}

	}
}