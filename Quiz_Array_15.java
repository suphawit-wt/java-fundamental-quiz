import java.util.Scanner;

public class Quiz_Array_15 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int a[][] = { { 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 },
				{ 30, 30, 30, 30, 30 } };

		int nB = 0, nB1 = 0, nB2 = 0;

		do {
			int x = kb.nextInt();
			int y = kb.nextInt();
			if (x == -1 && y == -1) {
				break;
			} else if (a[x - 1][y - 1] == 0) {
				System.out.println("booked");
			} else {
				System.out.println("reserved OK");
				a[x - 1][y - 1] = 0;
			}
		} while (true);

		kb.close();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (a[i][j] == 0) {
					System.out.print(a[i][j] + "  ");
				} else {
					System.out.print(a[i][j] + " ");
				}
			}

			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < 3) {
					if (a[i][j] == 0) {
						nB += 10;
					}
				} else if (i == 3) {
					if (a[i][j] == 0) {
						nB1 += 20;
					}
				} else if (i == 4) {
					if (a[i][j] == 0) {
						nB2 += 30;
					}
				}
			}
		}

		System.out.println("Normal type : " + nB);
		System.out.println("Honeymoon type : " + nB1);
		System.out.println("VIP type : " + nB2);
	}
}