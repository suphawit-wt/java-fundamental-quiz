import java.util.Scanner;

public class Quiz_Array_25 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int numberOfInput1, numberOfInput2, count1 = 0, count2 = 0;

		System.out.print("Please Insert Number of Input 1 : ");
		numberOfInput1 = kb.nextInt();

		System.out.print("Please Insert Number of Input 2 : ");
		numberOfInput2 = kb.nextInt();

		String[] hM1 = new String[numberOfInput1 + 1];
		char[][] hM2 = new char[numberOfInput1 + 1][numberOfInput2];

		for (int i = 0; i <= numberOfInput1; i++) {
			System.out.print("Please Insert String Value : ");
			hM1[i] = kb.nextLine();
		}

		kb.close();

		for (int i = 1; i < numberOfInput1 + 1; i++) {
			for (int j = 0; j < numberOfInput2; j++) {
				hM2[i - 1][j] = hM1[i].charAt(j);
			}
		}

		for (int i = 0; i <= numberOfInput1; i++) {
			for (int j = 0; j < numberOfInput2; j++) {
				if (hM2[i][j] == 'o') {
					for (int m = i - 1; m <= i + 1; m++) {
						for (int n = j - 1; n <= j + 1; n++) {
							if (m >= 0 && m < numberOfInput1 && n >= 0 && n < numberOfInput2) {
								if (hM2[m][n] == 'x') {
									count1++;
								}
							}
						}
					}
				}

				if (count1 == 8) {
					count2++;
				}

				count1 = 0;
			}
		}

		System.out.println("----------- Result -----------");
		System.out.print(count2);
	}
}