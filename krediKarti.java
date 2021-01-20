package odevler;

/*
 	örnek : 1234 5678 9876 5432
 = 1*2 + 2 + 3*2 + 4 + 5*2 +6 + 7*2 þeklinde devam eden
 =  2  +  2 + 6 + 4 + 10 +6 +14 
 =2+2+6+4+1+0+6+1+4 ... = 75  eðer  10 a tam bölünebiliyorsa kart numarasý geçerlidir .
 */
import java.util.Scanner;

public class krediKarti {

	public static void main(String[] args) {
		int i, toplam = 0;
		int[] kart = new int[16];
		Scanner giris = new Scanner(System.in);
		System.out.println("kart numarasý giriniz: ");
		while (true) {
			String kartNo = giris.next();
			for (i = 0; i < 16; i++) {
				char karakter = kartNo.charAt(i);
				if (karakter >= '0' && karakter <= '9') {
					kart[i] = karakter - '0';

				} else
					System.out.println("hatalý karakter");

			}
			for (i = 0; i < 16; i += 2) {
				kart[i] = kart[i] * 2;
				if (kart[i] > 9) {
					kart[i] = (kart[i] % 10) + (kart[i] / 10);
				}
			}
			for (i = 0; i < 16; i++) {
				toplam = toplam + kart[i];
			}
			if (toplam % 10 == 0) {
				System.out.println("kredi kartý gecerlidir");
			} else
				System.out.println("kredi kartý gecersizdir");
		}
	}

}
