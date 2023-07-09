import java.util.Scanner;

public class Quiz_Loop_08 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int count = 0;
		String aQ = "", aQ2 = "";

		for (;;) {
			if (aQ.equals("q")) {
				kb.close();
				break;
			}

			aQ2 = aQ2 + aQ;

			System.out.print("Please Insert Word or 'q' to QUIT : ");
			aQ = kb.next();
		}

		aQ2 = aQ2.toUpperCase();

		for (int i = 0; i < aQ2.length(); i++) {
			System.out.print(aQ2.charAt(i) + " ");
			if (aQ2.charAt(i) == 'A' || aQ2.charAt(i) == 'E' || aQ2.charAt(i) == 'I' || aQ2.charAt(i) == 'O'
					|| aQ2.charAt(i) == 'U') {
				count += 1;
			}
		}

		System.out.println();
		System.out.println("----------- Vowel Counting Result -----------");
		System.out.println(count);
	}
}