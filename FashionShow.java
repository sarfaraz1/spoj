package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

 class FashionShow {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int sum=0;
			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			int[] a1 = new int[n];

			for (int i = 0; i < s.length; i++) {
				a1[i] = Integer.parseInt(s[i]);
			}

			String[] s1 = br.readLine().split(" ");
			int[] a2 = new int[n];

			for (int i = 0; i < s.length; i++) {
				a2[i] = Integer.parseInt(s1[i]);
			}
			
			Arrays.sort(a1);
			Arrays.sort(a2);
			
			for (int i = 0; i < a2.length; i++) {
				sum+= a1[i]*a2[i];
				
			}
			System.out.println(sum);

		}
		

	}

}
