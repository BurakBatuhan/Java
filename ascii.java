package odevler;

import java.util.Scanner;

public class ascii {

	public static void main(String[] args) {
		Scanner giris =new Scanner(System.in);
		String asci="" ;
		int sayi;
		System.out.println("Kaç adet sayi girilicek ");
		int n=giris.nextInt();
		int[] dizi =new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("sayi giriniz: ");
			sayi=giris.nextInt();
			dizi[i]=sayi;
			asci+=(char)sayi;
		}
		System.out.println("ASCI kelime :"+asci);
	}

}
