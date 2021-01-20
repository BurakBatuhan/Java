package odevler;

import java.util.Scanner;

public class harf_kelime_Sayaci {
	public static void main(String[] args) {
		String cumle = "Benden Selam olsun.";
		System.out.println("Cumle Giriniz: ");

		int i, harfSyc = 0, kelimeSyc = 1;
		for (i = 0; i < cumle.length(); i++) {
			char k = cumle.charAt(i);
			if (Character.isLetter(k) == true) {
				harfSyc++;
			}
			if (Character.isSpaceChar(k) == true) {
				kelimeSyc++;
			}
		}
		System.out.println("Harf sayisi: " + harfSyc);
		System.out.println("Kelime sayisi: " + kelimeSyc);

	}
}
