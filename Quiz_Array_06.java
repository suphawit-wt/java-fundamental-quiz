import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_Array_06 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberOfInput = 10;

		ArrayList<Integer> numberList = new ArrayList<Integer>(numberOfInput);

		System.out.println("----------- Insert " + numberOfInput + " Number -----------");
		for (int i = 0; i < numberOfInput; i++) {
			System.out.print("Please Insert Number Value : ");
			numberList.add(kb.nextInt());
		}

		System.out.println("-- Option 1 : Add Number at Position You Choose and Remove Last Number --");
		System.out.println("-- Option 2 : Remove Number at Position You Choose and Add 0 To Last Number --");
		System.out.print("Please Select Option 1 or 2 : ");
		int option = kb.nextInt();

		if (option == 1) {
			System.out.println("-- Option 1 Selected --");
			System.out.print("Please Select Position of Number 1-10 : ");
			int index = kb.nextInt();

			System.out.print("Please Insert Number Value to Add : ");
			int newNumber = kb.nextInt();

			numberList.add(index - 1, newNumber);
			numberList.remove(10);
		} else if (option == 2) {
			System.out.println("-- Option 2 Selected --");
			System.out.print("Please Select Position of Number 1-10 : ");
			int index = kb.nextInt();

			numberList.remove(index - 1);
			numberList.add(0);
		}

		kb.close();

		System.out.println("----------- Result -----------");
		for (Integer number : numberList) {
			System.out.print(number + " ");
		}

	}
}