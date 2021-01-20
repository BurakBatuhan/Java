package odevler;

import java.util.Scanner;

public class elemanMaasi {

	public static void main(String[] args) {

		String adi;
		String soyadi;
		float saat;
		float top_satis, prim, ucret;

		Scanner giris = new Scanner(System.in);
		System.out.println("**** Ucret Hesabi **** \n");
		System.out.println("Satis elemaninin adini giriniz: ");
		adi = giris.next();
		System.out.println("Satis elemaninin soyadini giriniz: ");
		soyadi = giris.next();
		System.out.println("Calistigi toplam saati giriniz: ");
		saat = giris.nextInt();
		ucret = 50 * (float) saat;
		System.out.println("Sattigi urunler toplamini giriniz: ");
		top_satis = giris.nextFloat();
		if (top_satis > 5000)
			prim = 1000;
		else
			prim = 0;
		System.out.println("**** Odenecek Ucret **** \n");
		System.out.println("Satis Elemani: " + adi + " " + soyadi + "\n");
		System.out.println("Maas Bordrosu:\n");
		System.out.println("--------------\n");
		System.out.println("Ucret= " + ucret + " ve Alacagi Prim=" + prim);
		System.out.println("Toplam= " + ucret + prim + " TLodenecektir.");

	}

}
