package odevler;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Metin Giriniz : ");
		String metin = giris.nextLine();
		System.out.println(metin + " kelimesi palindrom mu ?");
		palindromMu(metin);
	}

	public static void palindromMu(String sozcuk1) {
		String sozcuk2 = reverse(sozcuk1);
		if (sozcuk2.equals(sozcuk1) == true) {
			System.out.println("palindromdur.");
		} else
			System.out.println("palindrom degildir.");

	}

	public static String reverse(String metin) {
		StringBuilder ters = new StringBuilder(metin);
		ters.reverse();
		return ters.toString();
	}
}
