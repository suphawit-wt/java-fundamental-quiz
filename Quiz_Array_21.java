import java.util.Scanner;

public class Quiz_Array_21 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String n1, n2, n3;
		int cT = 0, nM = 0, cT2 = 0, cT3 = 0, cT4 = 0;

		n1 = "";
		n2 = kb.nextLine();
		n3 = kb.nextLine();

		kb.close();

		int[] c = new int[n3.length()];

		for (int i = 0; i < n3.length(); i++) {
			if (n3.charAt(i) == ' ') {
				cT++;
			}
		}

		for (int i = 0; i < n2.length(); i++) {
			if (n2.charAt(i) == ' ') {
				continue;
			} else {
				n1 += n2.charAt(i);
			}
		}

		String A[] = new String[cT + 1];

		for (int i = 0; i < A.length; i++) {
			A[i] = "";
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = nM; j < n3.length(); j++) {
				if (n3.charAt(j) == ' ') {
					nM = j + 1;
					break;

				} else if ((n3.charAt(j) >= 65 && n3.charAt(j) <= 90 || n3.charAt(j) >= 97 && n3.charAt(j) <= 122)) {
					A[i] = A[i] + n3.charAt(j);

				}
			}
		}

		for (int i = 0; i < A.length; i++) {
			for (int z = 0; z < c.length; z++) {
				c[z] = 0;
			}
			for (int j = 0; j < n1.length(); j++) {

				for (int x = 0; x < A[i].length(); x++) {
					if ((n1.toUpperCase().charAt(j) == A[i].toUpperCase().charAt(x) && c[x] != 5) || (c[x] != 5
							&& cT3 == 0 && n1.toUpperCase().charAt(j) == A[i].toUpperCase().charAt(x))) {
						if (x == 0) {
							cT3++;
						}
						cT4++;

						c[x] = 5;

						cT2++;

					}
					if (cT4 > 0) {
						cT4 = 0;
						break;
					}
					cT4 = 0;
				}

			}

			cT3 = 0;

			if (cT2 == n1.length())
				System.out.println(A[i]);
			cT2 = 0;
		}

	}
}