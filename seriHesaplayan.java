package odevler;

import java.util.Scanner;

public class seriHesaplayan {
	public static double SeriHesapla(double n) {
		if(n<1) {
			return 0;
		}
		else
			return (n/((n*n)+1))+SeriHesapla(n-1);
		
	}

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		double n , sonuc ;
		System.out.println("N giriniz: ");
		n=giris.nextInt();
		sonuc=SeriHesapla(n);
		System.out.println("Sonuc: "+sonuc);
		
	}

}
