package odevler;

import java.util.Scanner;

public class harmonikOrt {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		double ort = 0.0, sayi = 0.0;
		int n = 0;
		do {
			System.out.println("bir sayi giriniz programdan cikmak icin 0 giriniz :");
			sayi = giris.nextInt();
			if (sayi != 0) {
				ort += 1.0 / sayi;
				n++;
			}
		} while (sayi != 0);
		ort = ((double) n) / ort;
		System.out.println("Harmonik ortalama =" + ort);
	}

}
