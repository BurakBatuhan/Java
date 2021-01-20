package odevler;

import java.util.Scanner;

public class randevuAlma {

	public static void main(String[] args) {
		int secim;
		System.out.println("Randevu almak istediðiniz ay'ý tuslayiniz.");
		Scanner giris = new Scanner(System.in);
		secim = giris.nextInt();

		switch (secim) {
		case 1:

			System.out.println("Ocak");
			System.out.println("Lutfen randevu almak istediginiz gunu seciniz");

			int gun = (int) (Math.random() * 31) + 1;

			System.out.println("dolu gunler" + gun);
			System.out.println("lutfen uygun Gun seciniz");
			int sayi;

			do {
				Scanner gunSecme = new Scanner(System.in);
				int secilenGun = gunSecme.nextInt();
				sayi = secilenGun;
				if (secilenGun == gun) {

					System.out.println("Hatali secim yaptýnýz.Lutfen tekrar deneyiniz.");

				} else if (secilenGun >= 32) {
					System.out.println(
							"Hatali gun secildi farkli gun seciniz veya programdan cikmak icin 0'ý tuslayiniz .");
				} else if (secilenGun == 0) {
					System.out.println("Programdan cikildi .");

				} else {
					System.out.println("Basarýyla secilen gun adýna randevu kaydedildi .");
					sayi=0;
					System.out.println("Ve Programdan cikildi .");
				}

			} while (sayi != 0);
			break;
		case 2:
			System.out.println("Subat");
			System.out.println("Lutfen randevu almak istediginiz gunu seciniz");

			int gun1 = (int) (Math.random() * 31) + 1;

			System.out.println("dolu gunler" + gun1);
			System.out.println("lutfen uygun Gun seciniz");
			int sayi1;

			do {
				Scanner gunSecme = new Scanner(System.in);
				int secilenGun = gunSecme.nextInt();
				sayi1 = secilenGun;
				if (secilenGun == gun1) {

					System.out.println("Hatali secim yaptýnýz.Lutfen tekrar deneyiniz.");

				} else if (secilenGun >= 32) {
					System.out.println(
							"Hatali gun secildi farkli gun seciniz veya programdan cikmak icin 0'ý tuslayiniz .");
				} else if (secilenGun == 0) {
					System.out.println("Programdan cikildi .");

				} else {
					System.out.println("Basarýyla secilen gun adýna randevu kaydedildi .");
					sayi=0;
					System.out.println("Ve Programdan cikildi .");
				}

			} while (sayi1 != 0);
			break;
		case 3:
			System.out.println("Mart");
			System.out.println("Lutfen randevu almak istediginiz gunu seciniz");

			int gun2 = (int) (Math.random() * 31) + 1;

			System.out.println("dolu gunler" + gun2);
			System.out.println("lutfen uygun Gun seciniz");
			int sayi2;

			do {
				Scanner gunSecme = new Scanner(System.in);
				int secilenGun = gunSecme.nextInt();
				gun2 = secilenGun;
				if (secilenGun == gun2) {

					System.out.println("Hatali secim yaptýnýz.Lutfen tekrar deneyiniz.");

				} else if (secilenGun >= 32) {
					System.out.println(
							"Hatali gun secildi farkli gun seciniz veya programdan cikmak icin 0'ý tuslayiniz .");
				} else if (secilenGun == 0) {
					System.out.println("Programdan cikildi .");

				} else {
					System.out.println("Basarýyla secilen gun adýna randevu kaydedildi .");
					sayi=0;
					System.out.println("Ve Programdan cikildi .");
				}

			} while (gun2 != 0);
			break;
		case 4:
			System.out.println("Nisan");
			System.out.println("Lutfen randevu almak istediginiz gunu seciniz");

			int gun3 = (int) (Math.random() * 31) + 1;

			System.out.println("dolu gunler" + gun3);
			System.out.println("lutfen uygun Gun seciniz");
			int sayi3;

			do {
				Scanner gunSecme = new Scanner(System.in);
				int secilenGun = gunSecme.nextInt();
				sayi3 = secilenGun;
				if (secilenGun == gun3) {

					System.out.println("Hatali secim yaptýnýz.Lutfen tekrar deneyiniz.");

				} else if (secilenGun >= 32) {
					System.out.println(
							"Hatali gun secildi farkli gun seciniz veya programdan cikmak icin 0'ý tuslayiniz .");
				} else if (secilenGun == 0) {
					System.out.println("Programdan cikildi .");

				} else {
					System.out.println("Basarýyla secilen gun adýna randevu kaydedildi .");
					sayi=0;
					System.out.println("Ve Programdan cikildi .");
				}

			} while (sayi3 != 0);
			break;
		case 5:
			System.out.println("Mayýs");
			System.out.println("Lutfen randevu almak istediginiz gunu seciniz");

			int gun4 = (int) (Math.random() * 31) + 1;

			System.out.println("dolu gunler" + gun4);
			System.out.println("lutfen uygun Gun seciniz");
			int sayi4;

			do {
				Scanner gunSecme = new Scanner(System.in);
				int secilenGun = gunSecme.nextInt();
				sayi4 = secilenGun;
				if (secilenGun == gun4) {

					System.out.println("Hatali secim yaptýnýz.Lutfen tekrar deneyiniz.");

				} else if (secilenGun >= 32) {
					System.out.println(
							"Hatali gun secildi farkli gun seciniz veya programdan cikmak icin 0'ý tuslayiniz .");
				} else if (secilenGun == 0) {
					System.out.println("Programdan cikildi .");

				} else {
					System.out.println("Basarýyla secilen gun adýna randevu kaydedildi .");
					sayi=0;
					System.out.println("Ve Programdan cikildi .");
				}

			} while (sayi4 != 0);
			break;
		case 6:
			System.out.println("Haziran");
			System.out.println("Lutfen randevu almak istediginiz gunu seciniz");

			int gun5 = (int) (Math.random() * 31) + 1;

			System.out.println("dolu gunler" + gun5);
			System.out.println("lutfen uygun Gun seciniz");
			int sayi5;

			do {
				Scanner gunSecme = new Scanner(System.in);
				int secilenGun = gunSecme.nextInt();
				sayi5 = secilenGun;
				if (secilenGun == gun5) {

					System.out.println("Hatali secim yaptýnýz.Lutfen tekrar deneyiniz.");

				} else if (secilenGun >= 32) {
					System.out.println(
							"Hatali gun secildi farkli gun seciniz veya programdan cikmak icin 0'ý tuslayiniz .");
				} else if (secilenGun == 0) {
					System.out.println("Programdan cikildi .");

				} else {
					System.out.println("Basarýyla secilen gun adýna randevu kaydedildi .");
					sayi=0;
					System.out.println("Ve Programdan cikildi .");
				}

			} while (sayi5 != 0);
			break;
		case 7:
			System.out.println("Temmuz");
			System.out.println("Lutfen randevu almak istediginiz gunu seciniz");

			int gun6 = (int) (Math.random() * 31) + 1;

			System.out.println("dolu gunler" + gun6);
			System.out.println("lutfen uygun Gun seciniz");
			int sayi6;

			do {
				Scanner gunSecme = new Scanner(System.in);
				int secilenGun = gunSecme.nextInt();
				sayi6 = secilenGun;
				if (secilenGun == gun6) {

					System.out.println("Hatali secim yaptýnýz.Lutfen tekrar deneyiniz.");

				} else if (secilenGun >= 32) {
					System.out.println(
							"Hatali gun secildi farkli gun seciniz veya programdan cikmak icin 0'ý tuslayiniz .");
				} else if (secilenGun == 0) {
					System.out.println("Programdan cikildi .");

				} else {
					System.out.println("Basarýyla secilen gun adýna randevu kaydedildi .");
					sayi=0;
					System.out.println("Ve Programdan cikildi .");
				}

			} while (sayi6 != 0);
			break;
		case 8:
			System.out.println("Agustos");
			System.out.println("Lutfen randevu almak istediginiz gunu seciniz");

			int gun7 = (int) (Math.random() * 31) + 1;

			System.out.println("dolu gunler" + gun7);
			System.out.println("lutfen uygun Gun seciniz");
			int sayi7;

			do {
				Scanner gunSecme = new Scanner(System.in);
				int secilenGun = gunSecme.nextInt();
				sayi7 = secilenGun;
				if (secilenGun == gun7) {

					System.out.println("Hatali secim yaptýnýz.Lutfen tekrar deneyiniz.");

				} else if (secilenGun >= 32) {
					System.out.println(
							"Hatali gun secildi farkli gun seciniz veya programdan cikmak icin 0'ý tuslayiniz .");
				} else if (secilenGun == 0) {
					System.out.println("Programdan cikildi .");

				} else {
					System.out.println("Basarýyla secilen gun adýna randevu kaydedildi .");
					sayi=0;
					System.out.println("Ve Programdan cikildi .");
				}

			} while (sayi7 != 0);
			break;
		case 9:
			System.out.println("Eylül");
			System.out.println("Lutfen randevu almak istediginiz gunu seciniz");

			int gun8 = (int) (Math.random() * 31) + 1;

			System.out.println("dolu gunler" + gun8);
			System.out.println("lutfen uygun Gun seciniz");
			int sayi8;

			do {
				Scanner gunSecme = new Scanner(System.in);
				int secilenGun = gunSecme.nextInt();
				sayi8 = secilenGun;
				if (secilenGun == gun8) {

					System.out.println("Hatali secim yaptýnýz.Lutfen tekrar deneyiniz.");

				} else if (secilenGun >= 32) {
					System.out.println(
							"Hatali gun secildi farkli gun seciniz veya programdan cikmak icin 0'ý tuslayiniz .");
				} else if (secilenGun == 0) {
					System.out.println("Programdan cikildi .");

				} else {
					System.out.println("Basarýyla secilen gun adýna randevu kaydedildi .");
					sayi=0;
					System.out.println("Ve Programdan cikildi .");
				}

			} while (sayi8 != 0);
			break;
		case 10:
			System.out.println("Ekim");
			System.out.println("Lutfen randevu almak istediginiz gunu seciniz");

			int gun9 = (int) (Math.random() * 31) + 1;

			System.out.println("dolu gunler" + gun9);
			System.out.println("lutfen uygun Gun seciniz");
			int sayi9;

			do {
				Scanner gunSecme = new Scanner(System.in);
				int secilenGun = gunSecme.nextInt();
				sayi9 = secilenGun;
				if (secilenGun == gun9) {

					System.out.println("Hatali secim yaptýnýz.Lutfen tekrar deneyiniz.");

				} else if (secilenGun >= 32) {
					System.out.println(
							"Hatali gun secildi farkli gun seciniz veya programdan cikmak icin 0'ý tuslayiniz .");
				} else if (secilenGun == 0) {
					System.out.println("Programdan cikildi .");

				} else {
					System.out.println("Basarýyla secilen gun adýna randevu kaydedildi .");
					sayi=0;
					System.out.println("Ve Programdan cikildi .");
				}

			} while (sayi9 != 0);
			break;
		case 11:
			System.out.println("Kasým");
			System.out.println("Lutfen randevu almak istediginiz gunu seciniz");

			int gun10 = (int) (Math.random() * 31) + 1;

			System.out.println("dolu gunler" + gun10);
			System.out.println("lutfen uygun Gun seciniz");
			int sayi10;

			do {
				Scanner gunSecme = new Scanner(System.in);
				int secilenGun = gunSecme.nextInt();
				sayi10 = secilenGun;
				if (secilenGun == gun10) {

					System.out.println("Hatali secim yaptýnýz.Lutfen tekrar deneyiniz.");

				} else if (secilenGun >= 32) {
					System.out.println(
							"Hatali gun secildi farkli gun seciniz veya programdan cikmak icin 0'ý tuslayiniz .");
				} else if (secilenGun == 0) {
					System.out.println("Programdan cikildi .");

				} else {
					System.out.println("Basarýyla secilen gun adýna randevu kaydedildi .");
					sayi=0;
					System.out.println("Ve Programdan cikildi .");
				}

			} while (sayi10 != 0);
			break;
		case 12:
			System.out.println("Aralýk");
			System.out.println("Lutfen randevu almak istediginiz gunu seciniz");

			int gun11 = (int) (Math.random() * 31) + 1;

			System.out.println("dolu gunler" + gun11);
			System.out.println("lutfen uygun Gun seciniz");
			int sayi11;

			do {
				Scanner gunSecme = new Scanner(System.in);
				int secilenGun = gunSecme.nextInt();
				sayi11 = secilenGun;
				if (secilenGun == gun11) {

					System.out.println("Hatali secim yaptýnýz.Lutfen tekrar deneyiniz.");

				} else if (secilenGun >= 32) {
					System.out.println(
							"Hatali gun secildi farkli gun seciniz veya programdan cikmak icin 0'ý tuslayiniz .");
				} else if (secilenGun == 0) {
					System.out.println("Programdan cikildi .");

				} else {
					System.out.println("Basarýyla secilen gun adýna randevu kaydedildi .");
					sayi=0;
					System.out.println("Ve Programdan cikildi .");
				}

			} while (sayi11 != 0);
			break;
		}
	}

}
