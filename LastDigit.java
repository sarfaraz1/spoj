package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LastDigit {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			long b = Integer.parseInt(s[1]);
		 if (b == 0) {
               System.out.println(1);
            } else {
                b = b % 4;
                if (b == 0)
                    b = 4;
                System.out.println(((int)Math.pow(a, b))%10);
            }

	} }

}
