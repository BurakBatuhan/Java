package odevler;

import java.util.Scanner;

public class dizi_Ile_Teksayi_Yazdirma {

	public static void main(String[] args) {
		int kucuk , buyuk ;
		System.out.println("sayi oku");
		Scanner giris = new Scanner(System.in);
		int sayi1 = giris.nextInt();
		int sayi2 = giris.nextInt();
		if (sayi1 < sayi2) {
			kucuk = sayi1;
			buyuk=sayi2;
		} else {
			buyuk = sayi1;
			kucuk=sayi2;
		}
		
		int fark = buyuk - kucuk;
		int[] dizi = new int[fark];

		int s = 0;

		for (int i = kucuk; i < buyuk; i++) {
			if (i % 2 == 1) {
				dizi[s] = i;
				s++;
				System.out.println("dizi["+s+"] : "+i);
			}
		}
		

	}

}
