import java.util.Scanner;

public class Quiz_Array_26 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int numberOfInput1, numberOfInput2, numberOfInput3, numberOfInput4;

		System.out.print("Please Insert Number of Input 1 : ");
		numberOfInput1 = kb.nextInt();

		System.out.print("Please Insert Number of Input 2 : ");
		numberOfInput2 = kb.nextInt();

		System.out.print("Please Insert Number of Input 3 : ");
		numberOfInput3 = kb.nextInt();

		System.out.print("Please Insert Number of Input 4 : ");
		numberOfInput4 = kb.nextInt();

		String TT[] = new String[numberOfInput1 + 1];
		char cX[][] = new char[numberOfInput1 + 1][numberOfInput2];
		String cC[] = new String[numberOfInput1 * numberOfInput3];

		for (int i = 0; i < numberOfInput3 * numberOfInput1; i++) {
			cC[i] = "";
		}

		for (int i = 0; i <= numberOfInput1; i++) {
			System.out.print("Please Insert String Value : ");
			TT[i] = kb.nextLine();
		}

		kb.close();

		for (int i = 1; i <= numberOfInput1; i++) {
			for (int j = 0; j < numberOfInput2; j++) {
				cX[i - 1][j] = TT[i].charAt(j);
			}
		}

		for (int i = 0; i < numberOfInput1; i++) {
			for (int j = 0; j < numberOfInput2; j++) {
				for (int y = 0; y < numberOfInput4; y++) {
					cC[i] += cX[i][j];
				}
			}
		}

		System.out.println("----------- Result -----------");
		for (int i = 0; i < numberOfInput1; i++) {
			for (int j = 0; j < numberOfInput3; j++) {
				System.out.println(cC[i]);
			}
		}

	}
}