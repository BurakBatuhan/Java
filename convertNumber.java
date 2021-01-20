package odevler;

import java.util.Scanner;

public class convertNumber {

	public static void main(String[] args) {
		int i;
		System.out.println("Sayi giriniz: ");
		Scanner giris = new Scanner(System.in);
		i = giris.nextInt();
		System.out.println("ikili sayi sisteminde: " + Integer.toBinaryString(i));
		System.out.println("Sekizli sayi sisteminde: " + Integer.toOctalString(i));
		System.out.println("Onalti sayi sisteminde: " + Integer.toHexString(i));

	}
}