package odevler;

import java.util.Scanner;

public class faizHesapla {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);

		System.out.println("Yillik Faiz Oranini Giriniz");
		double yillikfaizorani = giris.nextDouble();

		System.out.println("Ödeme Yapilmasi Düsünülen Yil");
		int yil = giris.nextInt();

		System.out.println("Borc Alinacak Miktar");
		double borcMiktari = giris.nextDouble();

		double aylikFaizOrani = yillikfaizorani / 1200;

		double aylikOdemeMiktari = (borcMiktari * aylikFaizOrani) / (1 - (1 / Math.pow(1 + aylikFaizOrani, yil * 12)));

		double toplamBorc = aylikOdemeMiktari * 12 * yil;

		System.out.println("Aylik Odeme Miktari : " + (int) (aylikOdemeMiktari * 100) / 100.0);

		System.out.println("Toplam Odenecek Miktar : " + (int) (toplamBorc * 100) / 100.0);

	}

}
