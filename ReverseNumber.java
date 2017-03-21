package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class ReverseNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[2];
		while (n-- > 0) {
			String[] s = br.readLine().split(" ");
//			s[0] = s[0].replaceFirst("^0+(?!$)", "");
//			s[1] = s[1].replaceFirst("^0+(?!$)", "");

			s[0] = reverse(s[0]);
			s[1] = reverse(s[1]);

//			s[0] = s[0].replaceFirst("^0+(?!$)", "");
//			s[1] = s[1].replaceFirst("^0+(?!$)", "");

			a[0] = Integer.parseInt(s[0]);
			a[1] = Integer.parseInt(s[1]);
		
			int t = a[0] + a[1];
			s[0] = Integer.toString(t);
			s[0]= reverse(s[0]);
			s[0] = s[0].replaceFirst("^0+(?!$)", "");
			System.out.println(s[0]);

		}
	}

	private static String reverse(String s) {
		if (s.length() > 1) {
			String s1 = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				s1 = s1 + s.charAt(i);
			}

			return s1;
		} else
			return s;
	}
}
