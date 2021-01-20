package odevler;

import java.util.Scanner;

public class kareToplam {

	public static void main(String[] args) {
		int hesap = 2, topla = 0;
		Scanner giris = new Scanner(System.in);
		System.out.println("N sayýsýný giriniz: ");
		int n = giris.nextInt();

		for (int i = 0; i <= n; i++) {
			double sonuc = Math.pow(hesap, i);
			topla += sonuc;

		}
		System.out.println("Serinin toplam sonucu : "+topla);
	}
}
