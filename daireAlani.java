package odevler;

import java.util.Scanner;

public class daireAlani {
	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		System.out.println("Dairenin yaricapini giriniz");
		int yariCap = giris.nextInt();
		System.out.println("Dairenin diliminin acisini giriniz");
		int aci = giris.nextInt();

		double sonuc = Math.PI * yariCap * yariCap * aci / 360;
		System.out.println("Daire diliminin alani: " + sonuc);

	}
}
