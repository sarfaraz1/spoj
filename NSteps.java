package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NSteps {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String[] s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			if(x==y) {
				if(x%2==0)
					System.out.println(2*x);
				else
					System.out.println(2*x-1);
				
				
			}
			else if(x-2==y) {
				if(x%2==0)
					System.out.println(x+y);
				else
					System.out.println(x+y-1);
				
				
			}
			
			else {
				System.out.println("No Number");
			}
			
		}
	}

}
