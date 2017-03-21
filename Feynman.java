package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 class Feynman {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		while (n!=0) {
			
			int res = (n*(n+1)*(2*n+1))/6;
			System.out.println(res);
		
			n = Integer.parseInt(br.readLine());
		}
		 
	}

}
