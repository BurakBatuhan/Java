package odevler;

import java.util.Scanner;

public class yedekKosegenElemani {

	public static void main(String[] args) {
		int[][] dizi = new int[4][4];
		int yedek = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				Scanner giris = new Scanner(System.in);

				System.out.println(+i + 1 + " satir " + (j + 1) + "sutun elemanini giriniz");
				dizi[i][j] = giris.nextInt();
				if (i + j == 3) {
					yedek = yedek + dizi[i][j];
				}
			}
		}
		System.out.println("Yedek kosegen elemanlari toplamidir. :" + yedek);
	}

}
