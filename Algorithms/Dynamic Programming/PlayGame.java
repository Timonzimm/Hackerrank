import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static long playgame_DP(int[] a) {

		long[] sums = new long[a.length];
		sums[0] = a[0];

		for (int i = 1; i < sums.length; i++) {
			sums[i] += sums[i - 1] + a[i];
		}

		long[] dp = new long[a.length];
		dp[0] = a[0];
		dp[1] = a[0] + a[1];
		dp[2] = a[0] + a[1] + a[2];
		for (int k = 3; k < dp.length; k++) {
			dp[k] = Math.max(
					sums[k - 1] - dp[k - 1] + a[k],
					Math.max(
							sums[k - 2] - dp[k - 2] + a[k] + a[k - 1],
							sums[k - 3] - dp[k - 3] + a[k] + a[k - 1] + a[k - 2]
							));
		}

		return dp[a.length - 1];
	}

	public static void main(String[] args) throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		bfr.readLine();
		while(bfr.readLine() != null) {	
			String[] a = bfr.readLine().split(" ");
			int[] aRev = new int[a.length];
			int i = 0;
			int j = a.length - 1;
			while (j >= 0) {
				aRev[j] = Integer.parseInt(a[i]);
				i++;
				j--;
			}

			System.out.println(playgame_DP(aRev));
		}
	}
}