import java.util.Scanner;

public class Quiz_Array_16 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n, nM, cT1 = 0, cT2 = 0;

		n = kb.nextInt();

		double[][] mT = new double[n][2];

		double mN = Integer.MAX_VALUE, Min2 = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			mT[i][0] = kb.nextDouble();
			mT[i][1] = kb.nextDouble();
		}

		nM = kb.nextInt();

		kb.close();

		for (int i = 0; i < mT.length; i++) {
			if (i != nM) {
				mN = Math.min(Math.pow(mT[nM][0] - mT[i][0], 2) + Math.pow(mT[nM][1] - mT[i][1], 2),
						mN);
			}
		}

		for (int i = 0; i < mT.length; i++) {
			if (mN == Math.pow(mT[nM][0] - mT[i][0], 2) + Math.pow(mT[nM][1] - mT[i][1], 2)) {
				cT1 = i;
			}
		}

		for (int i = 0; i < mT.length; i++) {
			if (i != nM && i != cT1)
				Min2 = Math.min(Math.pow(mT[nM][0] - mT[i][0], 2) + Math.pow(mT[nM][1] - mT[i][1], 2),
						Min2);
		}

		for (int i = 0; i < mT.length; i++) {
			if (Min2 == Math.pow(mT[nM][0] - mT[i][0], 2) + Math.pow(mT[nM][1] - mT[i][1], 2)) {
				cT2 = i;
			}
		}

		System.out.printf("%.0f, ", mT[cT1][0]);
		System.out.printf("%.0f\n", mT[cT1][1]);

		System.out.printf("%.0f, ", mT[cT2][0]);
		System.out.printf("%.0f", mT[cT2][1]);

	}
}