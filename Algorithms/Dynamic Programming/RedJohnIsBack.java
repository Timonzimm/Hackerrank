import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		bfr.readLine();
		String line;
		int n = 0;
		int[] dp;
		while((line = bfr.readLine()) != null) {
			n = Integer.parseInt(line);
			dp = new int[n + 1];

			boolean[] primes = getPrimes(redjohn_dp(n, dp));
			int res = 0;
			for(int i = 0; i < primes.length; i++)
				if(primes[i])
					res++;

			System.out.println(res); 
		}
	}

	public static int redjohn_dp(int n, int[] dp) {
		if(dp[n] != 0) return dp[n]; // Node already known
		if(n == 0) return 1;
		int val = redjohn_dp(n-1, dp);

		if(n >= 4)
			val += redjohn_dp(n-4, dp);

		dp[n] = val;
		return val;
	}

	public static boolean[] getPrimes(int max){
		// Sieve of Eratosthenes
		boolean[] numbers = new boolean[max+1];
		Arrays.fill(numbers, Boolean.TRUE);
		numbers[0] = false;
		numbers[1] = false;

		for(int i = 0; i < numbers.length; i++)
			if(numbers[i])
				for(int j = 2*i; j < numbers.length; j+=i)
					numbers[j] = false;

		return numbers;
	}
}