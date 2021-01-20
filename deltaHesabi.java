package odevler;

import java.util.Scanner;

public class deltaHesabi {

	public static void main(String[] args) {

		int a, b, c;

		System.out.println("sýrayla a,b,c giriniz");
		Scanner giris = new Scanner(System.in);
		a = giris.nextInt();
		b = giris.nextInt();
		c = giris.nextInt();

		double x1;
		double x2;
		float delta;

		delta = b * b - 4 * a * c;

		if (delta > 0.0) {
			x1 = (-b + Math.sqrt(delta)) / 2 * a;
			x2 = (-b - Math.sqrt(delta)) / 2 * a;
			System.out.println("x1= " + x1 + "\n");
			System.out.println("x2= " + x2 + "\n");

		} else if (delta == 0.0) {
			x1 = -b / 2 * a;
			System.out.println("x1= " + x1 + "\n");
		} else

			System.out.println("Gercek kok yoktur.\n");

	}

}
