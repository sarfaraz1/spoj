package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Bytelandian {
	static long[] a = new long[10000001];

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n;
		String s;
		for (int i = 0; i <= 10000000; i++) {
			a[i] = Math.max(i, a[i / 2] + a[i / 3] + a[i / 4]);
		}
		while ((s = br.readLine()) != null) {
			n = Integer.parseInt(s);

			n = Mdollar(n);
			System.out.println(n);

		}
	}

	private static long fill(long n) {

		return a[(int) n];

	}

	private static long Mdollar(long n) {
		if (n <= 10000000) {
			return a[(int) n];
		}

		else {
			n = Math.max(n, Mdollar(n / 2) + Mdollar(n / 3) + Mdollar(n / 4));
		}

		return n;

	}

}
