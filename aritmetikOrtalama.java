package odevler;

import java.util.Scanner;

public class aritmetikOrtalama {

	public static void main(String[] args) {
		int toplam=0;
		int n=0;
		System.out.println("Sayi Giriniz e�er 2 defa �ift girerseniz program sonlan�r. ");
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
