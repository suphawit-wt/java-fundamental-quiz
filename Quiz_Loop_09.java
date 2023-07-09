import java.util.Scanner;

public class Quiz_Loop_09 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double numberValue, sM = 0;

		System.out.print("Please Insert Number Value : ");
		numberValue = kb.nextDouble();

		kb.close();

		for (double i = 1; i <= numberValue; i++) {
			sM += (1 / i);
		}

		System.out.println("----------- Result -----------");
		System.out.printf("%.4f", sM);
	}
}