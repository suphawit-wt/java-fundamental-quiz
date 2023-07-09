import java.util.Scanner;

public class Quiz_Loop_19 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numberValue, cAL = 0;

		System.out.println("------ Please Select 1 to Add Apple for Calculate Calories ------");
		System.out.println("------ Please Select 2 to Add Papaya for Calculate Calories ------");
		System.out.println("------ Please Select 3 to Add Banana for Calculate Calories ------");
		System.out.println("------ Please Select 4 to Add Orange for Calculate Calories ------");
		System.out.println("------ Please Select 5 to QUIT ------");
		for (;;) {
			System.out.print("Please Select Option 1-5 : ");
			numberValue = kb.nextInt();

			if (numberValue == 5) {
				System.out.println("---- QUIT ----");
				System.out.println("Bye Bye");
				kb.close();
				break;
			}
			if (numberValue == 1) {
				System.out.println("You choose Apple");
				cAL += 100;
			} else if (numberValue == 2) {
				System.out.println("You choose Papaya");
				cAL += 120;
			} else if (numberValue == 3) {
				System.out.println("You choose Banana");
				cAL += 200;
			} else if (numberValue == 4) {
				System.out.println("You choose Orange");
				cAL += 60;
			}
		}

		System.out.println("----------- Result -----------");
		System.out.println("Total Calories: " + cAL);
	}
}