package Controller;

import java.util.Timer;
import java.util.TimerTask;

import Model.Bird;
import View.Dekor;


public class LancePierre {

	private Dekor d;
	double t;
	
	double vitesse,angle;


	
	public LancePierre(Bird o,Dekor d1,double v,double a){
		d=d1;
		vitesse =v;
		angle=a;
		lancePierre(o);
	}
	
	

	public void lancePierre(final Bird o){
		t=0;
		final Timer timer = new Timer(); 
		TimerTask timerTask = new TimerTask(){	
			@Override
			public void run()  { 
				t+=1;
				if(o.getCoord().distance(new Coord(0,d.getHauteurLP()+o.getTaille()/2)) >0){
					o.setCoord(prochCoordDroite((int)t,o.getCoord(),new Coord(0,d.getHauteurLP()+o.getTaille()/2)));
					o.setProchaineCoord(prochCoordDroite((int)t+10,o.getCoord(),new Coord(0,d.getHauteurLP()+o.getTaille()/2)));
					d.repaint();
				}
				else {
					timer.cancel();
					new Animation(o,d,vitesse,angle);
				}
			}
		};
		timer.scheduleAtFixedRate(timerTask,0,5);
		}
	

	public static Coord prochCoordDroite(int t,Coord dep, Coord arr){
		Coord p = arr;
		
		while(p.distance(dep)>t){
			if(Math.abs(p.getX()-dep.getX()) >Math.abs(p.getY()-dep.getY())){
				if(p.getX()>dep.getX()) p.setX(p.getX()-1);
				else p.setX(p.getX()+1);
			}
			else {
				if(p.getY()>dep.getY()) p.setY(p.getY()-1);
				else p.setY(p.getY()+1);
			}
		}
		return p;

	}


	
	
	
	
}
