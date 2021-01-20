package odevler;

import java.util.Scanner;

public class sayininKuvvetineGoreHesapla {
	public static int sonuc(int m, int n) {
		if (m == 0)
			return 1;

		else
			return n * sonuc(m - 1, n);

	}

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);

		System.out.println("Bir sayi giriniz :");
		int kuvvet = giris.nextInt();
		System.out.println("Kuvvetini giriniz. :");
		int sayi = giris.nextInt();
		System.out.println("\n" + sonuc(sayi, kuvvet));

	}

}
