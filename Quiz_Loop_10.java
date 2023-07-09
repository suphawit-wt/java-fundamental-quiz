import java.util.Scanner;

public class Quiz_Loop_10 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String nM;
		char a1, a2, a3, a4, a5, a6;

		System.out.print("Please Insert Word in 6 Character Length : ");
		nM = kb.next();
		kb.close();

		a1 = nM.charAt(0);
		a2 = nM.charAt(1);
		a3 = nM.charAt(2);
		a4 = nM.charAt(3);
		a5 = nM.charAt(4);
		a6 = nM.charAt(5);

		System.out.println("----------- Reverse Character Result -----------");
		System.out.println(a6 + "" + a5 + "" + a4 + "" + a3 + "" + a2 + "" + a1);
	}
}