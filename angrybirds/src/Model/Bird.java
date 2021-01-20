package Model;


import java.util.Observable;

import Controller.Coord;
import View.Dekor;


public class Bird extends Observable {

	private Coord coord,prochaineCoord;
	private int taille;
	private Dekor decor;
	private boolean isFlying=false;
	private boolean aFiniVol;
	

	public Bird(Dekor d){
		
		decor=d;
		taille = 25;
		this.coord = new Coord(-taille/2-40*decor.getOiseaux().size(),taille/2);
		prochaineCoord = new Coord(-taille/2-20*decor.getOiseaux().size(),taille/2);
		aFiniVol=false;
	}


	public void set_X(int i) {
		coord.setX(i);
		setChanged();
		notifyObservers();
	}
	
	
	public int get_X() {
		return coord.getX();
	}

	
	public void set_Y(int i) {
		coord.setY(i);
		setChanged();
		notifyObservers();
	}
	
	
	public int get_Y() {
		return coord.getY();
	}
	
	
	public Coord getCoord() {
		return coord;
	}
	
	
	public void setCoord(Coord c) {
		this.coord = c;
		setChanged();
		notifyObservers();
	}
	
	
	public Coord getProchaineCoord(){
		return this.prochaineCoord;
	}
	
	
	public void setProchaineCoord(Coord c){
		prochaineCoord = c;
		setChanged();
		notifyObservers();
	}
	

	public int getTaille(){
		return taille;
	}
	
	
	public boolean isFlying(){
		return isFlying;
	}
	
	
	public void fly(){
		isFlying=true;
		setChanged();
		notifyObservers();
	}
	
	
	public boolean aFiniVol(){
		return aFiniVol;
		
	}
	
	
	public void finirVol(){
		aFiniVol=true;
		isFlying=false;
		setChanged();
		notifyObservers();
	}
	

	public void placerSurLP() {
		
		// TODO Auto-generated method stub
		this.setCoord(new Coord(0,decor.getHauteurLP()+taille/2));
		this.setProchaineCoord(new Coord(20,decor.getHauteurLP()+taille/2));
		setChanged();
		notifyObservers();
		
		
	}
}
