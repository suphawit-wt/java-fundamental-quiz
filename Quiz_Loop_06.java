import java.util.Scanner;

public class Quiz_Loop_06 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int numberValue, Tn = 0, Ft = 0, cD = 1;

		for (;;) {
			System.out.print("Please Insert Number Value : ");
			numberValue = kb.nextInt();

			if (numberValue == -1) {
				kb.close();
				break;
			}

			if (numberValue > 60) {
				Ft += 1;
			} else {
				Tn += 1;
			}

			cD += 1;
			if (cD == 11) {
				kb.close();
				break;
			}
		}

		System.out.println("-------------- Result --------------");
		System.out.println(Ft);
		System.out.println(Tn);
	}
}