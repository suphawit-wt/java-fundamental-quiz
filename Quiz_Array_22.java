import java.util.Scanner;

public class Quiz_Array_22 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int numberOfInput;

		numberOfInput = kb.nextInt();

		String[] nB = new String[numberOfInput + 1];
		char[][][] cC = new char[10][numberOfInput][numberOfInput];

		for (int i = 0; i < nB.length; i++) {
			nB[i] = kb.nextLine();
		}

		for (int i = 1; i < numberOfInput + 1; i++) {
			for (int j = 0; j < numberOfInput; j++) {
				cC[0][i - 1][j] = (nB[i].charAt(j));
			}
		}

		String c = kb.next();
		kb.close();

		char D[] = new char[c.length()];

		for (int i = 0; i < c.length(); i++) {
			D[i] = c.charAt(i);
		}

		for (int i = 0; i < c.length(); i++) {
			for (int x = 0; x < numberOfInput; x++) {
				for (int y = 0; y < numberOfInput; y++) {
					if (D[i] == 'H') {
						cC[i + 1][x][y] = cC[i][numberOfInput - x - 1][y];
					} else if (D[i] == 'V') {
						cC[i + 1][x][y] = cC[i][x][numberOfInput - y - 1];
					} else if (D[i] == 'L') {
						cC[i + 1][x][y] = cC[i][y][numberOfInput - x - 1];
					} else if (D[i] == 'R') {
						cC[i + 1][x][y] = cC[i][numberOfInput - y - 1][x];
					}
				}
			}
		}

		for (int i = 0; i < numberOfInput; i++) {
			for (int j = 0; j < numberOfInput; j++) {
				System.out.print(cC[c.length()][i][j]);
			}

			System.out.println();
		}

	}
}