package odevler;

import java.util.Scanner;

public class transpoz {

	public static void main(String[] args) {
		int T=0;
		Scanner giris=new Scanner(System.in);
		System.out.println("Matris Boyutu: ");
		int n=giris.nextInt();
		int[][] matris=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println((i+1)+".satir"+(j+1)+".sutun: ");
				matris[i][j]=giris.nextInt();
			}
		}
		System.out.println("Transpozu:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("\t"+matris[j][i]);
				
			}System.out.print("\n");
		}
	}

}
