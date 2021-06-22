package nsh.codility;

import java.util.Arrays;
import java.util.Comparator;

public class Yttrium2021A implements Yttrium2021Interface {

	public int solution(String S, int K) {
		int N = S.length();
		if (K == 0)
			return N;
		else if (K > N)
			return -1;
		int[][] A = new int[26][2];
		int a = 0;
		for (int i = 0; i < 26; i++)
			A[i][0] = 2000000;
		for (int i = 0; i < N; i++) {
			int n = (S.charAt(i) - 'a');
			if (A[n][0] == 2000000) {
				A[n][0] = i;
				a++;
			}
			A[n][1] = i;
		}
		if (a < K)
			return -1;
		if (a == K)
			return 0;
		Arrays.sort(A, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		int R = N;
		for (int i = 0; i < a; i++) {
			int a1 = A[i][0], a2 = A[i][1];
			for (int j = 0; j < a; j++) {
				int b1 = A[j][0], b2 = A[j][1];
				if (b1 < a1 || b2 < a2)
					continue;
				int r = 0;
				for (int k = 0; k < a; k++)
					if (A[k][0] < a1 || A[k][1] > b2)
						r++;
				if (r == K)
					R = Math.min(R, b2 - a1 + 1);
			}
		}

		return R;
	}
}
