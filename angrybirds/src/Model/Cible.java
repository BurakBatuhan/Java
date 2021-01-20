package Model;




import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Random;

import javax.imageio.ImageIO;

import Controller.Coord;
import View.Dekor;


public class Cible extends Observable{

	

	private Coord coord;
	private boolean touche;
	private int taille;
	private Coord vect;
	private boolean rond;
	private double angle;
	private Dekor decor;
	
	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public boolean isRond() {
		return rond;
	}
	
	public Coord getVect() {
		return vect;
	}


	public void setVect(Coord vect) {
		this.vect = vect;
		setChanged();
		notifyObservers();
	}


	
	public Cible(Dekor d){
		decor = d;
		touche = false;
		taille = 50;

		
		//harita üzerinde rastgele hedeflerin koordinatlarýný hesapla
		int x = d.getposDep()+ new Random().nextInt(d.getLargeur()-d.getposDep());
		int y = taille/2 + new Random().nextInt(d.getHauteur()-taille/2);
		while(!d.placeLibre(x, y, taille)){
			x = d.getposDep()+ new Random().nextInt(d.getLargeur()-d.getposDep());
			y = taille/2 + new Random().nextInt(d.getHauteur()-taille/2);
		}
		this.coord = new Coord(x,y);
		this.vect = new Coord(new Random().nextInt(2),new Random().nextInt(2));
		rond = new Random().nextBoolean();
	}
	
	
	
	public Coord getCoord(){
		return coord;
	}
	
	
	public int get_X(){
		return coord.getX();
	}
	
	
	public void set_X(int x){
		coord.setX(x);
		setChanged();
		notifyObservers();
	}
	

	public int get_Y(){
		return coord.getY();
	}
	
	
	public void set_Y(int y){
		coord.setY(y);
		setChanged();
		notifyObservers();
	}
	
	
	public int getTaille(){
		return taille;
	}
	

	public boolean dokunduysa(){
		return touche;
	}
	

	public void toucher(){
		touche = true;
		setChanged();
		notifyObservers();
	}


	public void setCoord(Coord c) {
		coord=c;
		setChanged();
		notifyObservers();
	}
	public void dessin(Graphics g) {
		
		
		try {
			BufferedImage img = ImageIO.read(new File("img/box.png"));
			AffineTransform tx = new AffineTransform();
		    tx.rotate(Math.toRadians(angle),getTaille() / 2 ,getTaille() / 2);
			//tx.rotate(Math.toRadians(angle), get_X(), get_Y());

		    AffineTransformOp op = new AffineTransformOp(tx,
		        AffineTransformOp.TYPE_BILINEAR);
		    img = op.filter(img, null);
		    
		    Coord coord = decor.getPlan().plan_Concret(this.coord);
		    g.drawImage(img, coord.getX()-getTaille()/2 , coord.getY()-getTaille()/2, null);
		   // System.out.println(get_X()+","+get_Y());
			
			} catch (IOException e){}
	}
}
