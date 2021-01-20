package odevler;

import java.util.Scanner;

public class besgenAlaniHesabi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Kenar sayisini girin : ");
		int n = input.nextInt();
		System.out.print("Beþgenin kenarýný girin: ");
		double kenar = input.nextDouble();

		System.out.println("Beþgenin Alaný: " + besgenAlani(n, kenar));
	}

	public static double besgenAlani(int n, double s) {
		return (n * s * s) / (4 * Math.tan(Math.PI / n));
	}

}
