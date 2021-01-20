package odevler;

import java.util.Scanner;

public class simetrikMatris{

	public static void main(String[] args) {
		int[][] dizi = new int[4][4];
		int sonuc = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				Scanner giris = new Scanner(System.in);

				System.out.println(+i + 1 + " satir " + (j + 1) + "sutun elemanini giriniz");
				dizi[i][j] = giris.nextInt();
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i != j && dizi[i][j] != dizi[j][i]) {
					sonuc++;
				}
			}
		}
		if (sonuc == 0) {
			System.out.println("Girdiginiz matris simetriktir.");
		} else {
			System.out.println("Girdiginiz matris simetrik degildir.");
		}
	}
}
