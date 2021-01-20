package View;

import Controller.Coord;


public class Plan {

	private final Coord coordOrigin;
	
	
	public Plan(Coord coord){
		this.coordOrigin = coord;
	}
	
	
	public Coord getCoordOrigin(){
		return this.coordOrigin;
	}
	
	
	public int getXOrigin(){
		return this.coordOrigin.getX();
	}
	
	
	public int getYOrigin(){
		return this.coordOrigin.getY();
	}
	
	
	public Coord plan_Concret(Coord coordPlan){
		return new Coord(coordPlan.getX()+getXOrigin(), getYOrigin()-coordPlan.getY());
	}
	
	public Coord concret_Plan(Coord coordConc){
		return new Coord(coordConc.getX()-getXOrigin(), getYOrigin()-coordConc.getY());
	}
	
}
