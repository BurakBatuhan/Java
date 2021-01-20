package odevler;

import java.util.Scanner;

public class otelFiyatHesabi {

	public static void main(String[] args) {
		int yas,gun,toplam;
		System.out.println("Cocugun yasini giriniz: ");
		Scanner giris =new Scanner(System.in);
		yas=giris.nextInt();
		System.out.println("Otelde kac gun kalinacak: ");
		gun=giris.nextInt();
		toplam=2*gun*120;
		if(yas>11) {
			toplam=toplam+gun*120;
			
		}else if(yas>=6) {
			toplam=toplam+gun*60;
		}
		System.out.println("toplam ucret: "+toplam);
	}

}
