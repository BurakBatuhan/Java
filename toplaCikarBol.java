package odevler;

import java.util.Scanner;

public class toplaCikarBol {

	public static void main(String[] args) {
			int buyuk,kucuk;
			System.out.println("iki sayý giriniz: ");
			Scanner giris=new Scanner(System.in);
			int sayi1=giris.nextInt();
			int sayi2=giris.nextInt();
			if(sayi1<sayi2) {
				buyuk=sayi2;
				kucuk=sayi1;
			}else {
				kucuk=sayi2;
				buyuk=sayi1;
			}
			int toplam=buyuk+kucuk;
			int carp= buyuk*kucuk;
			int bol=buyuk/kucuk;
			int fark=buyuk-kucuk;
			System.out.println("toplam:"+toplam);
			System.out.println("carp:"+carp);
			System.out.println("bol:"+bol);
			System.out.println("fark:"+fark);
			
	}

}
