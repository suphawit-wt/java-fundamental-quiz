import java.util.Scanner;

public class Quiz_Array_23 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int nB1, nB2;

		nB1 = kb.nextInt();
		nB2 = kb.nextInt();

		char nB3[][] = new char[nB1][nB2];
		char nB4[][] = new char[nB1 + 2][nB2 + 2];
		int nB5[][] = new int[nB1 + 2][nB2 + 2];

		kb.nextLine();

		for (int i = 0; i < nB1; i++) {
			nB3[i] = kb.nextLine().toCharArray();
		}

		kb.close();

		for (int i = 1; i < nB1 + 1; i++) {
			for (int j = 1; j < nB2 + 1; j++) {
				nB4[i][j] = (nB3[i - 1][j - 1]);
			}
		}

		int sM = 0;

		for (int i = 0; i < nB1 + 2; i++) {
			for (int j = 0; j < nB2 + 2; j++) {
				if (nB4[i][j] == 'S') {
					nB5[i][j] = 1;
					if (nB4[i - 1][j - 1] == 'L')
						nB5[i - 1][j - 1] = 1;
					if (nB4[i - 1][j] == 'L')
						nB5[i - 1][j] = 1;
					if (nB4[i - 1][j + 1] == 'L')
						nB5[i - 1][j + 1] = 1;
					if (nB4[i][j - 1] == 'L')
						nB5[i][j - 1] = 1;
					if (nB4[i][j] == 'L')
						nB5[i][j] = 1;
					if (nB4[i][j + 1] == 'L')
						nB5[i][j + 1] = 1;
					if (nB4[i + 1][j - 1] == 'L')
						nB5[i + 1][j - 1] = 1;
					if (nB4[i + 1][j] == 'L')
						nB5[i + 1][j] = 1;
					if (nB4[i + 1][j + 1] == 'L')
						nB5[i + 1][j + 1] = 1;
				}
			}
		}

		for (int k = 0; k < nB1 + 2; k++) {
			for (int i = 0; i < nB1 + 2; i++) {
				for (int j = 0; j < nB2 + 2; j++) {
					if (nB5[i][j] == 1) {
						if (nB4[i - 1][j - 1] == 'L')
							nB5[i - 1][j - 1] = 1;
						if (nB4[i - 1][j] == 'L')
							nB5[i - 1][j] = 1;
						if (nB4[i - 1][j + 1] == 'L')
							nB5[i - 1][j + 1] = 1;
						if (nB4[i][j - 1] == 'L')
							nB5[i][j - 1] = 1;
						if (nB4[i][j] == 'L')
							nB5[i][j] = 1;
						if (nB4[i][j + 1] == 'L')
							nB5[i][j + 1] = 1;
						if (nB4[i + 1][j - 1] == 'L')
							nB5[i + 1][j - 1] = 1;
						if (nB4[i + 1][j] == 'L')
							nB5[i + 1][j] = 1;
						if (nB4[i + 1][j + 1] == 'L')
							nB5[i + 1][j + 1] = 1;
					}
				}
			}
		}

		for (int i = 0; i < nB1 + 2; i++) {
			for (int j = 0; j < nB2 + 2; j++) {
				if (nB5[i][j] == 1)
					sM++;
			}
		}

		System.out.println(sM);
	}
}