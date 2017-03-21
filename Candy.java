package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Candy {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		while (n != -1) {
			int mean = 0;
			int count = 0;
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(br.readLine());
				mean = mean + a[i];
			}
			
			if (mean % n == 0) {
				mean=mean/n;
				for (int i = 0; i < a.length; i++) {
					if (a[i] > mean)
						count=count+(a[i]-mean);

				}
				System.out.println(count);
			} else
				System.out.println(-1);

			n = Integer.parseInt(br.readLine());
		}

	}

}
