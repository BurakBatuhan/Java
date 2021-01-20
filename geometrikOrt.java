package odevler;

import java.util.Scanner;

public class geometrikOrt {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		double ort = 1.0;
		int n = 0, sayi = 0;
		do {
			System.out.println("bir sayi giriniz programdan cikmak icin 0 giriniz :");
			sayi = giris.nextInt();
			if (sayi != 0) {
				ort *= sayi;
				n++;
			}
		} while (sayi != 0);
		ort = Math.pow(ort, 1.0 / (double) n);
		System.out.println("Geometrik ortalama =" + ort);
	}

}
