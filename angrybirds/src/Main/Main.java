package Main;


import Grafik.Menu;


public class Main {

	private static Pencere f;
	public static int compteur =0;
	
	public static void main(String[] args) {
		f = new Pencere(1024,576);
		f.setTitle("Burak Batuhan Erol - Angry Birds");
		f.changerFond(new Menu());
	}

	public static Pencere getFenetre(){
		return f;
		
	}

	public static Object getPencere() {
		// TODO Auto-generated method stub
		return null;
	}
}
