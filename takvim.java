package odevler;

public class takvim {
	private static String[] Ay = { "OCAK", "SUBAT", "MART", "NÝSAN", "MAYIS", "HAZÝRAN", "TEMMUZ", "AGUSTOS", "EYLUL",
			"EKÝM", "KASIM", "ARALIK" };

	public static void main(String[] args) {
		int baslayanGun = 3;
		int gunSayisi = 31;
		System.out.println("2020 takvim");
		baslayanGun--;

		for (int i = 0; i < 12; i++) {
			if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11) {
				gunSayisi = 31;
			} else if (i == 1) {
				gunSayisi = 29;
			} else
				gunSayisi = 30;

			baslayanGun = ayBas(i, baslayanGun, gunSayisi);
		}

	}

	private static int ayBas(int ayNo, int ilkGun, int totalGun) {
		int w = 0;
		int sonrakiGun = 0;
		System.out.println("--------------------------");
		System.out.printf("%s \n", Ay[ayNo]);
		System.out.println("Pztr |Sali|Crs|Prs|Cuma|Cmt|Pzr");
		System.out.println("--------------------------");
		System.out.println("   |");

		for (w = 1; w <= totalGun; w++) {
			System.out.printf("%2s |", w);
			if ((w + ilkGun) % 7 == 0) {
				System.out.println();
				sonrakiGun = 0;
			} else {
				sonrakiGun++;
			}

		}
		System.out.println();
		return sonrakiGun;
	}
}