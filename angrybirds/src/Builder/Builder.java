package Builder;

import Model.Cible;
import View.Dekor;

public class Builder {

	private Dekor dekor;

	public Builder(Dekor d) {
		dekor = d;
	}

	public void tur() {

		// for(int i=1;i<2;i++){
		Cible c = new Cible(dekor);
		c.set_X(dekor.getposDep() + 100);
		c.set_Y(c.getTaille() / 2);
		dekor.ajouterCible(c);
		Cible c2 = new Cible(dekor);
		c2.set_X(dekor.getposDep() + 100);
		c2.set_Y(c.getTaille() + c2.getTaille() / 2);
		dekor.ajouterCible(c2);
		Cible c3 = new Cible(dekor);
		c3.set_X(dekor.getposDep() + 100);
		c3.set_Y(c2.get_Y() + c2.getTaille());
		dekor.ajouterCible(c3);

		Cible c4 = new Cible(dekor);
		c4.set_X(dekor.getposDep() + 200);
		c4.set_Y(c4.getTaille() / 2);
		dekor.ajouterCible(c4);
		Cible c5 = new Cible(dekor);
		c5.set_X(dekor.getposDep() + 200);
		c5.set_Y(c4.getTaille() + c5.getTaille() / 2);
		dekor.ajouterCible(c5);
		Cible c6 = new Cible(dekor);
		c6.set_X(dekor.getposDep() + 200);
		c6.set_Y(c5.get_Y() + c5.getTaille());
		dekor.ajouterCible(c6);
		Cible c7 = new Cible(dekor);
		c7.set_X(dekor.getposDep() + 200);
		c7.set_Y(c6.get_Y() + c6.getTaille());
		dekor.ajouterCible(c7);

	}

	public void tur2() {
		Cible c = new Cible(dekor);
		c.set_X(dekor.getposDep() + 100);
		c.set_Y(c.getTaille() / 2);
		dekor.ajouterCible(c);
		Cible c2 = new Cible(dekor);
		c2.set_X(dekor.getposDep() + 100);
		c2.set_Y(c.getTaille() + c2.getTaille() / 2);
		dekor.ajouterCible(c2);
		Cible c3 = new Cible(dekor);
		c3.set_X(dekor.getposDep() + 100);
		c3.set_Y(c2.get_Y() + c2.getTaille());
		dekor.ajouterCible(c3);

		Cible c4 = new Cible(dekor);
		c4.set_X(dekor.getposDep() + 400);
		c4.set_Y(c4.getTaille() / 2);
		dekor.ajouterCible(c4);
		Cible c5 = new Cible(dekor);
		c5.set_X(dekor.getposDep() + 400);
		c5.set_Y(c4.getTaille() + c5.getTaille() / 2);
		dekor.ajouterCible(c5);
		Cible c6 = new Cible(dekor);
		c6.set_X(dekor.getposDep() + 400);
		c6.set_Y(c5.get_Y() + c5.getTaille());
		dekor.ajouterCible(c6);

		Cible c7 = new Cible(dekor);
		c7.set_X(dekor.getposDep() + 500);
		c7.set_Y(c7.getTaille() / 2);
		dekor.ajouterCible(c7);
		Cible c8 = new Cible(dekor);
		c8.set_X(dekor.getposDep() + 500);
		c8.set_Y(c8.getTaille() + c7.getTaille() / 2);
		dekor.ajouterCible(c8);

	}

}
