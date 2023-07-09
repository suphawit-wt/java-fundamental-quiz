import java.util.Scanner;

public class Quiz_Loop_13 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue1, numberValue2, tT = 0, TT = 1, TT2 = 1;

		System.out.print("Please Insert Number Value 1 : ");
		numberValue1 = kb.nextInt();

		if (numberValue1 != 0) {
			for (;;) {
				System.out.print("Please Insert Number Value 2 or '0' to QUIT : ");
				numberValue2 = kb.nextInt();

				if (numberValue2 != numberValue1 && TT2 < TT) {
					TT2 = TT;
					TT = 1;
				}

				if (numberValue2 == 0) {
					kb.close();
					break;
				}

				if (numberValue2 == numberValue1 && numberValue2 == tT) {
					TT += 1;
				}

				tT = numberValue2;
			}

			System.out.println("----------- Result -----------");
			System.out.println(TT2);
		}

	}
}