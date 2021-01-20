package odevler;

import java.util.Scanner;

public class sinifSayisiHesaplama {

	public static void main(String[] args) {

		int k, n = 0;
		System.out.println("Kac adet sayi oldugun giriniz (N)");
		Scanner giris = new Scanner(System.in);
		n = giris.nextInt();

		k = (int) (1 + (3.3 * Math.log10(n)));
		System.out.println("Sýnýf sayýsý (K): " + k);
	}

}
