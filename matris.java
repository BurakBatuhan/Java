package odevler;

import java.util.Scanner;

public class matris {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Matris boyutunu belirleyiniz: ");
		int n = giris.nextInt();
		int[][] dizi = new int[n][n];
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if (i == j) {
					dizi[i][j] = 1;
				} else
					dizi[i][j] = 0;

				System.out.println(i+".sutun"+j +".satir: "+ dizi[i][j]);

			}

		}

	}
}	
