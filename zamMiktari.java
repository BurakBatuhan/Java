package odevler;

import java.util.Scanner;

public class zamMiktari {

	public static void main(String[] args) {
		Scanner giris =new Scanner(System.in);
		int[] A= {750,900,1050,1250,1800};
		int[] B=new int [A.length];
	
		
		System.out.println("Zam yapýlacak miktarý girin: ");
		int zam=giris.nextInt();
		for(int i=0;i<A.length;i++) {
			System.out.println("zamnda önceki miktar: "+A[i]);
			
			B[i]=A[i]+zam;
			
			System.out.println("Zamdan sonraki miktar: "+B[i]);
		}
		
	}

}
