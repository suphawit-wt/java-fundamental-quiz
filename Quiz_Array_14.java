import java.util.Scanner;

public class Quiz_Array_14 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int z = 0, zz = 0, nZ1 = 0, nB1 = 0, w = 0, nW1 = 0, nW2 = 0;

		String T1[][] = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

		String T2[][] = new String[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(T1[i][j] + " ");
			}

			System.out.println();
		}

		for (int p = 0; p < 9; p++) {
			if (p % 2 == 0) {
				System.out.print("Player(X) select position 1-9: ");
				int a = kb.nextInt();
				switch (a) {
					case 1:
						T1[0][0] = "X";
						break;
					case 2:
						T1[0][1] = "X";
						break;
					case 3:
						T1[0][2] = "X";
						break;
					case 4:
						T1[1][0] = "X";
						break;
					case 5:
						T1[1][1] = "X";
						break;
					case 6:
						T1[1][2] = "X";
						break;
					case 7:
						T1[2][0] = "X";
						break;
					case 8:
						T1[2][1] = "X";
						break;
					case 9:
						T1[2][2] = "X";
						break;
				}
			} else {
				System.out.print("Player(O) select position 1-9: ");
				int a = kb.nextInt();
				switch (a) {
					case 1:
						T1[0][0] = "O";
						break;
					case 2:
						T1[0][1] = "O";
						break;
					case 3:
						T1[0][2] = "O";
						break;
					case 4:
						T1[1][0] = "O";
						break;
					case 5:
						T1[1][1] = "O";
						break;
					case 6:
						T1[1][2] = "O";
						break;
					case 7:
						T1[2][0] = "O";
						break;
					case 8:
						T1[2][1] = "O";
						break;
					case 9:
						T1[2][2] = "O";
						break;
				}
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(T1[i][j] + " ");
				}
				System.out.println();
			}

			for (int i = 0; i < 3; i++) {
				if (T1[i][i] == "X") {
					z++;
				} else if (T1[i][i] == "O") {
					zz++;
				}
			}

			for (int i = 0; i < 3; i++) {
				if (T1[i][2 - i] == "X") {
					nZ1++;
				} else if (T1[i][2 - i] == "O") {
					nB1++;
				}
			}

			if (z == 3 || nZ1 == 3) {
				System.out.println("Player X wins");
				break;
			} else if (nB1 == 3 || zz == 3) {
				System.out.println("Player O wins");
				break;
			}

			z = 0;
			nZ1 = 0;
			zz = 0;
			nB1 = 0;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
					if (T1[i][j] == "X") {
						if (T1[i][j] == T1[i][j + 1]) {
							w++;
						}
					} else if (T1[i][j] == "O") {
						if (T1[i][j] == T1[i][j + 1]) {
							nW1++;
						}
					}
				}

				if (w == 2) {
					System.out.println("Player X wins");
					nW2++;
					break;
				} else if (nW1 == 2) {
					System.out.println("Player O wins");
					nW2++;
					break;
				}

				w = 0;
				nW1 = 0;
			}

			if (nW2 == 1) {
				break;
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					T2[j][i] = T1[i][j];
				}
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
					if (T2[i][j] == "X") {
						if (T2[i][j] == T2[i][j + 1]) {
							w++;
						}
					} else if (T2[i][j] == "O") {
						if (T2[i][j] == T2[i][j + 1]) {
							nW1++;
						}
					}
				}
				if (w == 2) {
					System.out.println("Player X wins");
					nW2++;
					break;
				} else if (nW1 == 2) {
					System.out.println("Player O wins");
					nW2++;
					break;
				}

				w = 0;
				nW1 = 0;
			}

			if (nW2 == 1) {
				break;
			}
			if (p == 8) {
				System.out.println("Tie: No winner");
			}
		}

		kb.close();
	}
}