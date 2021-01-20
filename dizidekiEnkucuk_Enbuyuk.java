package odevler;

import java.util.Scanner;

public class dizidekiEnkucuk_Enbuyuk {
	public static void main(String[] args) {
		System.out.println("Dizi boyutu giriniz: ");
		Scanner giris =new Scanner(System.in);
		int n=giris.nextInt();
		int[] dizi= new int[n];
		int kucuk=dizi[0],buyuk=dizi[0];
		for(int i=0;i<dizi.length;i++) {
			System.out.println("sayi giriniz: ");
			int sayi=giris.nextInt();
			dizi[i]=sayi;
			if(dizi[i]<kucuk) 
				kucuk=dizi[i];
			if(dizi[i]>buyuk)
				buyuk=dizi[i];
			
		}
		System.out.println("en kucuk"+kucuk);
		System.out.println("en buyuk"+buyuk);

	}
}
