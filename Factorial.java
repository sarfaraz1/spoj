package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- >0) {
			int count=0;
			int n = Integer.parseInt(br.readLine());
			for (int i = n; i>=5; ) {
				i=i/5;
				count=count+i;
				
			}
			
			System.out.println(count);
			
			
			
			
			
			
		}

	}

}
