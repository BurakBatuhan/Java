package odevler;

import java.util.Scanner;

public class standartSapma {

	public static void main(String[] args) {
		int ortalama = 1, toplam = 0, kare, kareToplam = 0;
		double sonuc = 0;
		int artan = 0;
		Scanner giris = new Scanner(System.in);

		System.out.println("kaç adet sayý girilecek");
		int n = giris.nextInt();
		int[] dizi = new int[n];
		if (n != 0) {
			for (int a = 0; a < n; a++) {
				System.out.println("Veri giriniz.");
				dizi[a] = giris.nextInt();
				toplam += dizi[a];

			}
			ortalama = toplam / n;
			System.out.println(ortalama);
			for (int a = 0; a < dizi.length; a++) {
				int degisken = dizi[a];
				int temp = degisken - ortalama;
				dizi[a] = temp;
				artan++;
				System.out.println("dizideki " + artan + ".eleman " + dizi[a]);
				kare = dizi[a] * dizi[a];
				System.out.println("Karesi alýnan " + artan + ". eleman " + kare);
				kareToplam += kare;
			}

		}

		sonuc = Math.sqrt(kareToplam / (n - 1));
		System.out.println("Standart Sapma= " + sonuc);

	}

}