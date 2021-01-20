package odevler;

import java.util.Scanner;

public class dizininTersiAlinmasi {

	public static void main(String[] args) {
		
		Scanner giris=new Scanner(System.in);
		int n=giris.nextInt();
		int[] dizi=new int[n];
		System.out.println("dizi elemanlarýný giriniz: ");
		for(int i=0;i<n;i++) {
			dizi[i]=giris.nextInt();
		}
		
		System.out.println("dizinin tersi alýnmadan önce :");
		
		for(int i=0;i<n;i++) {
			System.out.println(dizi[i]);
		}
		
		for(int i=0;i<n/2;i++) {
			int temp=dizi[i];
			dizi[i]=dizi[n-i-1];
			dizi[n-i-1]=temp;
		}
		System.out.println("dizinin tersi alýndýktan sonra : ");
		for(int i=0;i<n;i++) {
			System.out.println(dizi[i]);
		}

	}

}
