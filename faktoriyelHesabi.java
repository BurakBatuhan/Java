package odevler;

import java.util.Scanner;

public class faktoriyelHesabi {

	public static void main(String[] args) {

		int i, sayi;
		int faktoriyel = 1;
		System.out.println("Faktoriyeli hesaplanmasýný istediginiz sayiyi giriniz :");

		Scanner giris = new Scanner(System.in);
		sayi = giris.nextInt();

	
		for (i = 1; i <= sayi; i++)
			faktoriyel *= i;
		System.out.println("Sonuc: " + faktoriyel);

	}

}
