package odevler;

import java.util.Scanner;

public class kucuktenBuyugeSiralama {

	public static void main(String[] args) {

		int i = 0, b, gecici;
		System.out.println("Girilicek sayi miktarýný giriniz: ");
		Scanner giris = new Scanner(System.in);
		int n = giris.nextInt();

		int[] sayi = new int[n];
		do {
			System.out.println(i + 1 + ". sayiyi giriniz: ");

			sayi[i] = giris.nextInt();
			i++;
		} while (i < n);
		for (i = 0; i < sayi.length - 1; i++) {
			for (b = i + 1; b < sayi.length; b++) {
				if (sayi[i] > sayi[b]) {
					gecici = sayi[i];
					sayi[i] = sayi[b];
					sayi[b] = gecici;
				}
			}
		}

		System.out.println("Kucukten Buyuge Siralama ");
		for (i = 0; i < sayi.length; i++) {
			System.out.println(sayi[i]);
		}

	}

}
