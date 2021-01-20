package odevler;

import java.util.Scanner;

// ilk 100 KM'ye kadar 0.5 TL/KM
// 100 KM'den Sonra 0.2 TL/KM

public class kmGoreParaHesapla {
	public static double yuzAlti = 0.5;
	public static double yuzUstu = 0.2;

	public static void main(String[] args) {

		int kilometre;
		double ucretYuzAlti, ucretYuzUstu, toplamUcret;

		System.out.println("Gidilen KM'yi giriniz: ");
		Scanner giris = new Scanner(System.in);

		kilometre = giris.nextInt();
		if (kilometre <= 100) {
			ucretYuzAlti = kilometre * yuzAlti;
			ucretYuzUstu = 0;
		} else {
			ucretYuzAlti = 100 * yuzAlti;
			ucretYuzUstu = (kilometre - 100) * yuzUstu;
		}
		toplamUcret = ucretYuzAlti + ucretYuzUstu;
		System.out.println("\nToplam Ucret= " + toplamUcret + "TL" + "\n");
	}

}
