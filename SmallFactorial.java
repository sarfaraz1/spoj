package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

 class SmallFactorial {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			
			BigInteger fact = new BigInteger("1");
			BigInteger i = BigInteger.valueOf(n);
			BigInteger zero = new BigInteger("0");
			BigInteger one = new BigInteger("1");
			while(i.compareTo(zero)>0) {
			fact=fact.multiply(i);
			i=i.subtract(one);

			}
			System.out.println(fact);
			
		}
	}
}
