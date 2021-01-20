package odevler;

import java.util.Scanner;

public class ucgenKenarSonucu {

	public static void main(String[] args) {
		int s,t,h ;
		int secim ;
		
		do {
			System.out.println("Ucgenin iki kenarýný giriniz: ");
			Scanner giris=new Scanner(System.in);
			s=giris.nextInt();
			t=giris.nextInt();
			System.out.println("Ucgenin hipotenüsünü giriniz. ");
			h=giris.nextInt();
			if((Math.sqrt(s*s+t*t))== h) {
				System.out.println("dik acili ucgen");
			}
			else 
				System.out.println("Girdiðiniz veriler dik acili ucgen degildir . ");
			
			System.out.println("Devam etmek icin 1, devam etmemek icin 0 basýnýz. ");
			secim=giris.nextInt();
		}while(secim != 0);

	}

}
