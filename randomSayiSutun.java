package odevler;

import java.util.Random;
import java.util.Scanner;

public class randomSayiSutun {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		System.out.println("Sutun Boyutu: ");
		int n=giris.nextInt();
		int[][] dizi =new int[3][n];
		int a=0, b=0;
		
		for(int i=0;i<3;i++){
			while(a<n) {
				int sayi=(int) (Math.random()*90);

				if(sayi%2==0) {
		
					dizi[1][b]=sayi;
					
					System.out.println("1.sutun:"+dizi[1][b]);
					a++;
				}else {
				dizi[2][b]=sayi;
				
				System.out.println("2.sutun:"+dizi[2][b]);
				a++;
					
			}
		}
	}

}
}