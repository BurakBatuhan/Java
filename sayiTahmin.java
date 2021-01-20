package odevler;

import java.util.Scanner;

public class sayiTahmin {

	public static void main(String[] args) {

		int piyango = (int) (Math.random() * 90) + 10;

		Scanner giris = new Scanner(System.in);

		System.out.println("Ýki Basamakli Bir Sayi Tahmin Ediniz  ");

		int tahmin = giris.nextInt();

		int piyangoBirlerb = piyango % 10;
		int piyangoOnlarb = piyango / 10;

		int tahminBirlerb = tahmin % 10;
		int tahminOnlarb = tahmin / 10;

		System.out.println("Piyango Numarasi " + piyango);

		if (piyango == tahmin) {
			System.out.println("Tebrikler Bildiniz 10000 tl Kazandiniz");
		} else if (piyangoBirlerb == tahminOnlarb && piyangoOnlarb == tahminBirlerb) {
			System.out.println("Ýki Rakami da Bildiniz 3000 tl Kazandiniz");
		} else if (piyangoBirlerb == tahminOnlarb || piyangoOnlarb == tahminBirlerb || piyangoOnlarb == tahminOnlarb
				|| piyangoBirlerb == tahminBirlerb) {
			System.out.println("Bir Rakami Bildiniz 1000 tl Kazandiniz");
		} else {
			System.out.println("Tahmininiz Tutmadi :(");

		}

	}

}
