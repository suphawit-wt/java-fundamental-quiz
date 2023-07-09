import java.util.Scanner;

public class Quiz_Loop_16 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int cT = 1, a1, a2, a3, a4;

		System.out.println("------ Guess Number at Position 1, 2, 3, 4 ------");
		for (;;) {
			if (cT == 11) {
				System.out.println("You lose!! You spend 10 tries.");
				kb.close();
				break;
			}

			System.out.print("Guess Number at Position 1 : ");
			a1 = kb.nextInt();

			System.out.print("Guess Number at Position 2 : ");
			a2 = kb.nextInt();

			System.out.print("Guess Number at Position 3 : ");
			a3 = kb.nextInt();

			System.out.print("Guess Number at Position 4 : ");
			a4 = kb.nextInt();

			if (a1 == 1 && a2 == 3 && a3 == 5 && a4 == 7) {
				System.out.println("1/ 3/ 5/ 7/");
				System.out.println("You win!! You spend " + cT + " tries.");
				kb.close();
				break;
			} else {
				if (a1 == 1) {
					System.out.print("1/ ");
				} else if (a1 == 3 || a1 == 5 || a1 == 7) {
					System.out.print(a1 + "x ");
				} else {
					System.out.print("- ");
				}

				if (a2 == 3) {
					System.out.print("3/ ");
				} else if (a2 == 1 || a2 == 5 || a2 == 7) {
					System.out.print(a2 + "x ");
				} else {
					System.out.print("- ");
				}

				if (a3 == 5) {
					System.out.print("5/ ");
				} else if (a3 == 1 || a3 == 3 || a3 == 7) {
					System.out.print(a3 + "x ");
				} else {
					System.out.print("- ");
				}

				if (a4 == 7) {
					System.out.print("7/");
				} else if (a4 == 1 || a4 == 3 || a4 == 5) {
					System.out.print(a4 + "x");
				} else {
					System.out.print("-");
				}
			}

			System.out.println();
			cT += 1;
		}

	}
}