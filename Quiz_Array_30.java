import java.util.Scanner;

public class Quiz_Array_30 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int O = 0, X = 0, nZ1 = 0, nZ2 = 0, nZ3 = 0, nZ4 = 0, nW = 0, nW1 = 0, nW2 = 0;

		String nB1[][] = new String[3][3];
		String nB2[][] = new String[3][3];
		String Result = "";

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Please Insert 'O' or 'X' Input[" + i + "][" + j + "]: ");
				nB1[i][j] = kb.next();
				if (nB1[i][j].equals("O")) {
					O++;
				} else if (nB1[i][j].equals("X")) {
					X++;
				}
			}
		}

		kb.close();

		int jj = 0;

		while (jj == 0) {
			jj++;

			for (int i = 0; i < 3; i++) {
				if (nB1[i][i].equals("X"))
					nZ1++;
				else if (nB1[i][i].equals("O"))
					nZ2++;
			}

			for (int i = 0; i < 3; i++) {
				if (nB1[i][2 - i].equals("X"))
					nZ3++;
				else if (nB1[i][2 - i].equals("O"))
					nZ4++;
			}

			if (nZ1 == 3 || nZ3 == 3) {
				Result = ("X WON");
				break;
			}

			else if (nZ4 == 3 || nZ2 == 3) {
				Result = ("O WON");
				break;
			}

			nZ1 = 0;
			nZ3 = 0;
			nZ2 = 0;
			nZ4 = 0;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
					if (nB1[i][j].equals("X")) {
						if (nB1[i][j].equals(nB1[i][j + 1]))
							nW++;
					} else if (nB1[i][j].equals("O"))
						if (nB1[i][j].equals(nB1[i][j + 1]))
							nW1++;
				}
				if (nW == 2) {
					Result = ("X WON");
					nW2++;
					break;
				} else if (nW1 == 2) {
					Result = ("O WON");
					nW2++;
					break;
				}
				nW = 0;
				nW1 = 0;

			}
			if (nW2 == 1)
				break;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					nB2[i][j] = nB1[j][i];
				}
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
					if (nB2[i][j].equals("X")) {
						if (nB2[i][j].equals(nB2[i][j + 1]))
							nW++;
					} else if (nB2[i][j].equals("O"))
						if (nB2[i][j].equals(nB2[i][j + 1]))
							nW1++;
				}

				if (nW == 2) {
					Result = ("X WON");
					nW2++;
					break;
				} else if (nW1 == 2) {
					Result = ("O WON");
					nW2++;
					break;
				}

				nW = 0;
				nW1 = 0;

			}
			if (nW2 == 1)
				break;
			if (nW == 0) {
				Result = ("DRAW");
				break;
			}
		}

		System.out.println("----------- Result -----------");
		System.out.println(O);
		System.out.println(X);
		System.out.println(Result);
	}
}