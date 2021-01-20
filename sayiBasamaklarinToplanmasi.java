package odevler;

import java.util.Scanner;

public class sayiBasamaklarinToplanmasi {

	public static void main(String[] args) {
		int b1,b2,b3,sayi;
		System.out.println("uc basamakli bir sayin giriniz ");
		Scanner giris=new Scanner(System.in);
		sayi=giris.nextInt();
		
		b1=sayi/100;
		b2=sayi%100/10;
		b3=sayi%10;
		System.out.println(+sayi+ "Sayininin basamaklarinin toplami: ");
		int sonuc=b1+b2+b3;
		System.out.println(b1+"+"+b2+"+"+b3+"="+sonuc);
	}

}
