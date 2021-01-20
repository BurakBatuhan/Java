package odevler;

import java.util.Scanner;

public class switch_case_Calismasi {
// bicak='b' ; catal='c' ; tabak='t'
	public static double bicakFiyat = 345.68;
	public static double catalFiyat = 123.45;
	public static double tabakFiyat = 567.89;

	public static void main(String[] args) {

		String karakter;
		float fiyat;

		System.out.println("Aldiginiz malin kodunu giriniz: ");
		Scanner giris = new Scanner(System.in);
		karakter = giris.next();

		switch (karakter) {
		case "B":
		case "b":
			System.out.println("Urun: bicak");
			System.out.println("Fiyati: " + bicakFiyat + " TL");
			break;

		case "C":
		case "c":
			System.out.println("Urun: catal");
			System.out.println("Fiyati: " + catalFiyat + " TL");
			break;

		case "T":
		case "t":
			System.out.println("Urun: tabak");
			System.out.println("Fiyati: " + tabakFiyat + " TL");
			break;
		default:
			System.out.println("Birsey satin almadiniz.");
			break;
		}
		System.out.println("Tesekkur ederiz.");
}}
