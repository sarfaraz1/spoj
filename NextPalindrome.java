package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.stream.events.Characters;

class NextPalindrome {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String s = br.readLine();
			int[] a = new int[s.length()];
			String[] s1 = new String[s.length()];
			for (int i = 0; i < s.length(); i++) {
				s1[i] = Character.toString(s.charAt(i));
			}
			for (int i = 0; i < s.length(); i++) {
				a[i] = Integer.parseInt(s1[i]);
			}

			// case1
			if (checkNine(a)) {
				System.out.print("1");
				for (int i = 0; i < a.length; i++) {
					System.out.print("0");
				}
				System.out.print("1");
			} // case1
			
			// case2
			else {
				
				int i,j;
				if(a.length%2==1)
					i=j=a.length/2;
				else {
					i=a.length/2-1;
					j=i+1;
				}
				while(i>=0&&j<s.length()) {
					if(a[i]!=a[j])
						break;
					else {
						i--;
						j++;
					}
						
				}
				
				if(i==-1) {
					if(a[s.length()/2]==9)
						propogate(a,a[s.length()/2]);
				}
				
					
				
				
				

			}

		}

	}

	private static void propogate(int[] a, int i) {
		a[i]=0;
		if(a[i-1]==9)
			propogate(a, i-1);
		else
			a[i-1]++;
		
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}

		
		
	}

	private static boolean checkNine(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 9)
				return false;

		}
		return true;
	}

}
