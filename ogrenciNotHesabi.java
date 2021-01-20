package odevler;

import java.util.Scanner;

public class ogrenciNotHesabi {
	public static int soruSayi = 10;
	public static int ogrSayi = 3;

	public static void main(String[] args) {
		char[] anahtar = new char[soruSayi];
		char[][] ogrCevap = new char[ogrSayi][soruSayi];
		int dogru=0, yanlis=0, skor;
		System.out.println("cevap anahtarýný giriniz: ");
		try (Scanner giris = new Scanner(System.in)) {
			for (int i = 0; i < soruSayi; i++) {
				anahtar[i] = giris.next().charAt(0);
			}
			for (int ogr = 0; ogr < ogrSayi; ogr++) {
				
				System.out.println((ogr + 1) + " Ogrencinin cevaplarýný giriniz: ");
				for (int i = 0; i < soruSayi; i++) {
					ogrCevap[ogr][i] = giris.next().charAt(0);
					if (anahtar[i] == ogrCevap[ogr][i]) {
						dogru++;
					} 
						yanlis++;
				}
				skor = dogru - (yanlis / 2);
				System.out.println((ogr + 1) + " Ogrencinin notu: " + skor);
			}
		}

	}

}
