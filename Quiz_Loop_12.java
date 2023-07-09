import java.util.Scanner;

public class Quiz_Loop_12 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue, xE = 0, xO = 0, xZ = 0;

		for (;;) {
			System.out.print("Please Insert Number Value or '0' to QUIT : ");
			numberValue = kb.nextInt();

			if (numberValue <= 0) {
				kb.close();
				break;
			}

			if (numberValue % 2 == 0 && numberValue > xE) {
				xE = numberValue;
			}

			if (numberValue % 2 != 0 && numberValue > xO) {
				xO = numberValue;
			}
		}

		if (xO > xE) {
			xZ = (xO - xE);
		} else if (xO < xE) {
			xZ = (xE - xO);
		}

		System.out.println("----------- Result -----------");
		System.out.println(xO);
		System.out.println(xE);
		System.out.println(xZ);
	}
}