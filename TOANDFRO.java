package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class TOANDFRO {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		while (c != 0) {
			int p = 0;
			int r = s.length() / c;

			char[][] a = new char[r][c];

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++, p++)
					a[i][j] = s.charAt(p);
				
				i++;
				if (i < r) {
					for (int k = c - 1; k >= 0; k--, p++)
						a[i][k] = s.charAt(p);

				}

			}

			for (int i = 0; i < c; i++) {
				for (int j = 0; j < r; j++)
					System.out.print(a[j][i]);

			}
			c = Integer.parseInt(br.readLine());
			s = br.readLine();
			System.out.println();

		}

	}

}
