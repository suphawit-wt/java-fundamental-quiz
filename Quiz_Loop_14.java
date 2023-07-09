import java.util.Scanner;

public class Quiz_Loop_14 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue1, numberValue2, cP = 0, sM = 0;

		System.out.print("Please Insert Number Value 1 : ");
		numberValue1 = kb.nextInt();

		for (int i = 1; i <= 2 * numberValue1; i++) {
			System.out.print("Please Insert Number Value 2 : ");
			numberValue2 = kb.nextInt();

			if (i % 2 == 0) {
				if (cP > numberValue2) {
					System.out.print(cP);
					sM += cP;
					if (i != 2 * numberValue1) {
						System.out.print(" + ");
					}
				} else {
					System.out.print(numberValue2);
					sM += numberValue2;
					if (i != 2 * numberValue1) {
						System.out.print(" + ");
					}
				}
			}

			cP = numberValue2;
		}

		kb.close();

		System.out.println("----------- Result -----------");
		System.out.print(" = " + sM);
	}
}