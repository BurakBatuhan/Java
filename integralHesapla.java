package odevler;

import java.util.Scanner;

public class integralHesapla {

	public static void main(String[] args) {

		try (Scanner giris = new Scanner(System.in)) {
			float ustSinir, altSinir, hassasiyet;

			System.out.println("a.x^3+b.x^2+c.x+d fonksiyonu icin katsayilari girin\n\n");

			System.out.println("Alt siniri giriniz:");
			altSinir = giris.nextInt();
			System.out.println("Ust siniri giriniz:");
			ustSinir = giris.nextInt();
			System.out.println("Hassasiyet degerini giriniz:");
			hassasiyet = giris.nextInt();

			System.out.println("Sonuc:" + integralHesapla(altSinir, ustSinir, hassasiyet));
		} catch (Exception e) {
		}

	}

	public static double fonksiyonHesapla(float x) {
		try (Scanner giris = new Scanner(System.in)) {
			float a, b, c, d;
			float y;
			System.out.println("a degerini giriniz:");
			a = giris.nextInt();
			System.out.println("b degerini giriniz:");
			b = giris.nextInt();
			System.out.println("c degerini giriniz:");
			c = giris.nextInt();
			System.out.println("d degerini giriniz:");
			d = giris.nextInt();

			y = a * (x * x * x) + b * (x * x) + c * (x) + (d);
			return y;
		} catch (Exception e) {
		}
		return x;

	}

	public static double integralHesapla(float altSinir, float ustSinir, float hassasiyet)

	{
		double integralSonucu = 0, yukseklik, m, n, yeniAltSinir;
		yukseklik = (ustSinir - altSinir) / hassasiyet;

		for (int i = 0; i < hassasiyet; i++) {
			m = fonksiyonHesapla(altSinir);
			altSinir = (float) (altSinir + yukseklik);
			yeniAltSinir = altSinir;
			n = fonksiyonHesapla((float) yeniAltSinir);
			integralSonucu = integralSonucu + (((m + n) / 2) * yukseklik);
		}

		return integralSonucu;
	}

}
