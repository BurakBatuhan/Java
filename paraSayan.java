package odevler;

import java.util.Scanner;

public class paraSayan {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		System.out.println("Bir Miktar Para Giriniz");

		double para = klavye.nextDouble();

		if (para != 0) {
			int toplamKurus = (int) (para * 100);
			int toplamT1 = toplamKurus / 100;
			int kalanKurus = toplamKurus % 100;
			int ellikurus = kalanKurus / 50;
			kalanKurus %= 50;
			int yirmiBesKurus = kalanKurus / 25;
			kalanKurus %= 25;
			int onKurus = kalanKurus / 10;
			kalanKurus %= 10;
			int besKurus = kalanKurus / 5;
			kalanKurus %= 5;
			int birKurus = kalanKurus / 1;

			System.out.println("Paranýz Toplam : " + toplamKurus + " kurustur.");
			System.out.println("Toplam 1 TL Miktarý : " + toplamT1);
			System.out.println("Toplam 50 Kurus Miktari: " + ellikurus);
			System.out.println("Toplam 25 Kurus Miktari : " + yirmiBesKurus);
			System.out.println("Toplam 10 Kurus Miktari : " + onKurus);
			System.out.println("Toplam 5 Kurus Miktari : " + besKurus);
			System.out.println("Toplam 1 Kurus Miktari : " + birKurus);
		} else
			System.out.println("hic bir kurus ayrýlamadý para bulunmamaktadýr.");

	}

}
