package odevler;

public class fibonacci {

	public static void main(String[] args) {

		int x = 0, y = 1;
		System.out.println(" Fibonacci Serisi \n");
		System.out.println("x: " + x + " y: " + y);
		fibonacci(x, y);

	}

	public static int fibonacci(int x, int y) {
		int toplam;
		if (y == 89) {
			return 1;
		} else {
			toplam = y + x;
			x = y;
			y = toplam;
			System.out.println("toplam:  " + toplam);
			return fibonacci(x, y);
		}
	}
}
