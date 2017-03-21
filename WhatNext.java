package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatNext {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s;
		int a1 = 0, a2 = 0, a3 = 0;
		s = br.readLine().split(" ");
		a1 = Integer.parseInt(s[0]);
		a2 = Integer.parseInt(s[1]);
		a3 = Integer.parseInt(s[2]);
		while (a1 != 0 || a2 != 0 || a3 != 0) {

			if ((a2 - a1) == (a3 - a2)) {
				System.out.println("AP " + (a3 + (a2 - a1)));

			} else {
				System.out.println("GP " + a3 * (a2 / a1));

			}
			s = br.readLine().split(" ");
			a1 = Integer.parseInt(s[0]);
			a2 = Integer.parseInt(s[1]);
			a3 = Integer.parseInt(s[2]);
		}
	}

}
