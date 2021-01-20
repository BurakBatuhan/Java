package odevler;

import java.util.Scanner;

public class aritmetikOrtalama {

	public static void main(String[] args) {
		int toplam=0;
		int n=0;
		System.out.println("Sayi Giriniz eðer 2 defa çift girerseniz program sonlanýr. ");
		while(true) {
			
			Scanner giris=new Scanner(System.in);
			int sayi1=giris.nextInt();
			n++;
			toplam+=sayi1;
			if(sayi1%2==0) {
				int sayi2=giris.nextInt();
				n++;
				toplam+=sayi2;
				if(sayi2%2==0) {
					break;
				}
			}
		}
		System.out.println("Aritmetik ortalam :"+(double)toplam/n);

	}

}
