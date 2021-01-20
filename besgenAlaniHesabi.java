package odevler;

import java.util.Scanner;

public class besgenAlaniHesabi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Kenar sayisini girin : ");
		int n = input.nextInt();
		System.out.print("Be�genin kenar�n� girin: ");
		double kenar = input.nextDouble();

		System.out.println("Be�genin Alan�: " + besgenAlani(n, kenar));
	}

	public static double besgenAlani(int n, double s) {
		return (n * s * s) / (4 * Math.tan(Math.PI / n));
	}

}
