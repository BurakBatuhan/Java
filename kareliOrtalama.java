package odevler;

import java.util.Scanner;

public class kareliOrtalama {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		double toplam = 1.0, sonuc, ortalama, kare;
		int n = 0, sayi = 0;
		do {
			System.out.println("bir sayi giriniz programdan cikmak icin 0 giriniz :");
			sayi = giris.nextInt();
			if (sayi != 0) {
				kare = Math.pow(sayi, 2);
				toplam += kare;
				n++;
			}
		} while (sayi != 0);
		ortalama = toplam / n;
		System.out.println("Kareli Ortalama: " + Math.sqrt(ortalama));
	}

}
