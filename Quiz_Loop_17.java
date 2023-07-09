import java.util.Scanner;

public class Quiz_Loop_17 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue1, numberValue2, sum = 0;

		System.out.print("Please Insert Number Value 1 : ");
		numberValue1 = kb.nextInt();

		System.out.print("Please Insert Number Value 2 : ");
		numberValue2 = kb.nextInt();

		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = numberValue1; i <= numberValue2; i++) {
			System.out.print(i);
			if (i != numberValue2) {
				System.out.print(" ");
			}
			if (i % 2 != 0) {
				sum += i;
			}
		}

		System.out.println();
		System.out.println("----------- Summary -----------");
		System.out.print(sum);
	}
}