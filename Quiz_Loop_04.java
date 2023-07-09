import java.util.Scanner;

public class Quiz_Loop_04 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue1, numberValue2, Sum = 0;

		System.out.print("Please Insert Number Value 1 : ");
		numberValue1 = kb.nextInt();

		System.out.print("Please Insert Number Value 2 : ");
		numberValue2 = kb.nextInt();

		kb.close();

		System.out.println("----------- Result -----------");
		for (int i = numberValue1; i <= numberValue2; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
				Sum += i;
			}
		}

		System.out.println();
		System.out.println("----------- Summary -----------");
		System.out.print(Sum);
	}
}