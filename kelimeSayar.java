package odevler;

import java.util.Scanner;

public class kelimeSayar {

	public static void main(String[] args) {

		System.out.println("Kelime Giriniz :");
		Scanner giris = new Scanner(System.in);
		String kelime = giris.next();
		int[] sayar = new int[26];
		for (int i = 0; i < kelime.length(); i++) {
			sayar[((int) kelime.charAt(i)) - 97]++;

		}
		for (int i = 0; i < sayar.length; i++) {
			if(sayar[i]!=0)
				System.out.println(((char)(i+97))+"\t"+sayar[i]);
		}
	}

}