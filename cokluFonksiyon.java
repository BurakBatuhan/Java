package odevler;

import java.util.Scanner;

public class cokluFonksiyon {

	public static void main(String[] args) {
		int sayi, menu;
		int tercih;

		do {

			System.out.println("EXP()   fonksiyonu icin : 1\n");
			System.out.println("SQRT()  fonksiyonu icin : 2\n");
			System.out.println("POW()   fonksiyonu icin : 3\n");
			System.out.println("LOG()   fonksiyonu icin : 4\n");
			System.out.println("COS()   fonksiyonu icin : 5\n");
			System.out.println("SIN()   fonksiyonu icin : 6\n");
			System.out.println("FLOOR() fonksiyonu icin : 7\n");
			System.out.println("CEIL()  fonksiyonu icin : 8\n");
			System.out.println("ABS()  fonksiyonu icin : 9\n");
			System.out.println("\nLutfen kullanmak istediginiz fonksiyonun numarasini giriniz :");
			Scanner giris = new Scanner(System.in);
			menu = giris.nextInt();
			switch (menu) {
			case 1:

				System.out.println("\n--EXP() fonksiyonu ornegi--\n\n");
				System.out.println("e sayisinin kacinci kuvvetini almak istiyorsunuz :");
				sayi = giris.nextInt();

				System.out.println("ne uzeri = " + Math.exp(sayi));

				break;

			case 2:

				do {
					System.out.println("\n--SQRT() fonksiyonu ornegi--\n\n");
					System.out.println("Karekokunu almak istediginiz sayiyi giriniz :");
					sayi = giris.nextInt();
				} while (sayi < 0);
				System.out.println("\nGirdiginiz sayinin karekoku = \n\n" + Math.sqrt(sayi));
				break;

			case 3:

				int a, b;
				System.out.println("\n--POW() fonksiyonu ornegi--\n\n");
				System.out.println("Once sayiyi giriniz :");
				a = giris.nextInt();
				System.out.println("\nUssunu giriniz :");
				b = giris.nextInt();
				System.out.println("\n ussu  = \n\n" + Math.pow(a, b));
				break;

			case 4:

				float x;
				System.out.println("\n--LOG() fonksiyonu ornegi--\n\n");
				System.out.println("Bir sayi giriniz :");
				x = giris.nextInt();
				System.out.println("\nLogaritma  = \n\n" + Math.log(x));
				break;

			case 5:

				int x2;
				System.out.println("\n--COS() fonksiyonu ornegi--\n\n");
				System.out.println("COS fonksiyonu icin derece cinsinden bir deger giriniz :");
				x2 = giris.nextInt();
				System.out.println("\nCos = \n\n" + Math.cos(Math.PI * x2 / 180));
				break;

			case 6:

				System.out.println("\n--SIN() fonksiyonu ornegi--\n\n");
				System.out.println("SIN fonksiyonu icin derece cinsinden bir deger giriniz :");
				x2 = giris.nextInt();
				System.out.println("\nSIN = \n\n" + Math.sin(Math.PI * x2 / 180));
				break;

			case 7:

				float ondalikSayi = 0;
				System.out.println("\n--Floor fonksiyonu ornegi--\n\n");
				System.out.println("Bir alta tasimak istediginiz ondalik sayiyi giriniz :");
				ondalikSayi = giris.nextFloat();
				System.out.println("\nSonuc = \n\n" + Math.floor(ondalikSayi));
				break;

			case 8:

				System.out.println("\n--CEIL fonksiyonu ornegi--\n\n");
				System.out.println("Bir uste tasimak istediginiz ondalik sayiyi giriniz :");
				float sayi4 = giris.nextFloat();
				System.out.println("\nSonuc = \n\n" + Math.ceil(sayi4));
				break;

			case 9:

				System.out.println("\n--Abs fonksiyonu ornegi--\n\n");
				System.out.println("Mutlak degerini almak istediginiz sayiyi giriniz :");
				sayi = giris.nextInt();
				System.out.println("\nSonuc = \n\n" + Math.abs(sayi));
				break;

			}
			System.out.println("Baska bir fonksiyon kullanmak icin 0'a, cikmak icin herhangi bir rakama basiniz.\n");
			tercih = giris.nextInt();

		} while (tercih == 0);
		System.out.println("\n programdan cikildi .");
	}

}
