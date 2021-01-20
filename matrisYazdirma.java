package odevler;

import java.util.Scanner;

public class matrisYazdirma {

	public static void main(String[] args) {

		int[][] a = new int[2][3];
		int[][] b = new int[2][3];
		int[][] c = new int[2][3];
		int i, j;
		Scanner giris = new Scanner(System.in);
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("a matrisi " + i + "-" + j + ":");

				a[i][j] = giris.nextInt();
			}
		}

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("b matrisi " + i + "-" + j + ":");
				b[i][j] = giris.nextInt();
			}
		}
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("c matrisi " + i + "-" + j + ":");

				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println(c[i][j] + " ");
			}

		}

	}
}
